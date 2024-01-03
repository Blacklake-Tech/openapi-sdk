package tech.blacklake.dev.openapi.sdk.event;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.blacklake.dev.openapi.domain.service.mq.dto.CallbackDTO;
import tech.blacklake.dev.openapi.sdk.constants.Constants;
import tech.blacklake.dev.openapi.sdk.constants.EventTypeEnum;
import tech.blacklake.dev.openapi.sdk.event.exception.EventTypeAlreadyHasHandlerException;
import tech.blacklake.dev.openapi.sdk.event.exception.HandlerNotFoundException;
import tech.blacklake.dev.openapi.sdk.event.model.EventReq;
import tech.blacklake.dev.openapi.sdk.event.model.EventResp;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class EventDispatcher {
    private static final Logger logger = LoggerFactory.getLogger(EventDispatcher.class);

    private String secretKey;

    private ObjectMapper objectMapper = new ObjectMapper();

    private Map<EventTypeEnum, IEventHandler> eventType2EventHandler;

    public EventDispatcher(Builder builder) {
        this.secretKey = builder.secretKey;
        this.eventType2EventHandler = builder.eventType2EventHandler;
    }

    public static Builder newBuilder(String secretKey) {
        return new Builder(secretKey);
    }

    public String getSecretKey() {
        return secretKey;
    }

    private String decryptEvent(String encryptedStr) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] keyBytes = digest.digest(secretKey.getBytes(Constants.SYSTEM_CHARSET));
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(keyBytes, "AES"));
        Base64.Decoder decoder = Base64.getDecoder();
        return new String(cipher.doFinal(decoder.decode(encryptedStr.getBytes())));
    }

    private CallbackDTO parseEventCallback(EventReq eventReq) throws Exception {
        String callbackBodyStr = new String(eventReq.getBody(), Constants.SYSTEM_CHARSET);
        logger.info("event callback has body str: {}", callbackBodyStr);
        if (Strings.isBlank(secretKey)) {
            return objectMapper.readValue(callbackBodyStr, CallbackDTO.class);
        }
        String decryptedBodyStr = decryptEvent((String) (objectMapper.readValue(callbackBodyStr, Map.class)).get("encrypt"));
        logger.info("event callback has body str: {} after decryption", decryptedBodyStr);
        return objectMapper.readValue(decryptedBodyStr, CallbackDTO.class);
    }

    public EventResp handle(EventReq eventReq) {
        EventResp eventResp = new EventResp();
        eventResp.setStatusCode(Constants.SUCCESS_HTTP_CODE);
        eventResp.setContentType(Constants.JSON_CONTENT_TYPE);
        String requestId = Constants.DEFAULT_REQUEST_ID;
        try {
            // 解析并解密eventReq获取CallbackDTO
            eventReq.setCallbackDTO(parseEventCallback(eventReq));
            requestId = eventReq.getCallbackDTO().getHeader().getRequestId();
            return doHandle(eventReq);
        } catch (Throwable e) {
            logger.error("handle event failed, httpPath:{}, requestId:{}, err:", eventReq.getHttpPath(), requestId, e);
            eventResp.setStatusCode(Constants.INTERNAL_ERROR_HTTP_CODE);
            eventResp.setBody(String.format(EventResp.RESPONSE_FORMAT,
                    e.getMessage()).getBytes(Constants.SYSTEM_CHARSET));
        }
        return eventResp;
    }

    private EventResp doHandle(EventReq eventReq) throws Throwable {
        EventResp eventResp = new EventResp();
        eventResp.setStatusCode(Constants.SUCCESS_HTTP_CODE);
        eventResp.setContentType(Constants.JSON_CONTENT_TYPE);
        // 获取eventType与对应的handler
        String eventType = eventReq.getCallbackDTO().getHeader().getEventType();
        IEventHandler handler = eventType2EventHandler.get(EventTypeEnum.getByEventTypeStr(eventType));
        if (handler == null) {
            throw new HandlerNotFoundException(eventType);
        }
        handler.handle(eventReq);
        eventResp.setBody(String.format(EventResp.RESPONSE_FORMAT, "success").getBytes(Constants.SYSTEM_CHARSET));
        return eventResp;
    }

    public static class Builder {
        private Map<EventTypeEnum, IEventHandler> eventType2EventHandler = new HashMap<>();

        private String secretKey;

        public Builder(String secretKey) {
            this.secretKey = secretKey;
        }

        public Builder onEventTypeHandler(EventTypeEnum eventTypeEnum, IEventHandler handler) {
            if (eventType2EventHandler.containsKey(eventTypeEnum)) {
                throw new EventTypeAlreadyHasHandlerException(eventTypeEnum);
            }
            eventType2EventHandler.put(eventTypeEnum, handler);
            return this;
        }
    }
}
