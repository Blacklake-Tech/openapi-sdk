package tech.blacklake.dev.openapi.sdk.event;

import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.blacklake.dev.openapi.domain.service.mq.dto.CallbackDTO;
import tech.blacklake.dev.openapi.domain.service.mq.dto.Header;
import tech.blacklake.dev.openapi.sdk.constants.Constants;
import tech.blacklake.dev.openapi.sdk.constants.enums.EventTypeEnum;
import tech.blacklake.dev.openapi.sdk.event.exception.EventTypeAlreadyHasHandlerException;
import tech.blacklake.dev.openapi.sdk.event.exception.HandlerNotFoundException;
import tech.blacklake.dev.openapi.sdk.event.exception.UnknownEventTypeException;
import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;
import tech.blacklake.dev.openapi.sdk.event.model.EventReq;
import tech.blacklake.dev.openapi.sdk.event.model.EventResp;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import static tech.blacklake.dev.openapi.sdk.constants.enums.EventTypeEnum.*;
import static tech.blacklake.infra.boot.common.util.ObjectMapperConfigure.objectMapper;

public class EventDispatcher {
    private static final Logger logger = LoggerFactory.getLogger(EventDispatcher.class);

    private String secretKey;

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

    private String parseEventCallback(EventReq eventReq) throws Exception {
        String callbackBodyStr = new String(eventReq.getBody(), Constants.SYSTEM_CHARSET);
        logger.info("event callback has body str: {}", callbackBodyStr);
        if (Strings.isBlank(secretKey)) {
            return callbackBodyStr;
        }
        String decryptedBodyStr =
                decryptEvent((String) (objectMapper.readValue(callbackBodyStr, Map.class)).get("encrypt"));
        logger.info("event callback has body str: {} after decryption", decryptedBodyStr);
        return decryptedBodyStr;
    }

    public EventResp handle(EventReq eventReq) {
        EventResp eventResp = new EventResp();
        eventResp.setStatusCode(Constants.SUCCESS_HTTP_CODE);
        eventResp.setContentType(Constants.JSON_CONTENT_TYPE);
        String requestId = Constants.DEFAULT_REQUEST_ID;
        try {
            // 解析并解密eventReq获取CallbackDTO
            String plainEventJsonStr = parseEventCallback(eventReq);
            // 解析公有字段--即header
            CallbackDTO fuzzyCallbackDTO = objectMapper.readValue(plainEventJsonStr, CallbackDTO.class);
            Header header = fuzzyCallbackDTO.getHeader();
            requestId = header.getRequestId();
            return doHandle(plainEventJsonStr, fuzzyCallbackDTO.getHeader());
        } catch (Throwable e) {
            logger.error("handle event failed, httpPath:{}, requestId:{}, err:", eventReq.getHttpPath(), requestId, e);
            eventResp.setStatusCode(Constants.INTERNAL_ERROR_HTTP_CODE);
            eventResp.setBody(String.format(EventResp.ERROR_RESPONSE_FORMAT, e.getMessage())
                    .getBytes(Constants.SYSTEM_CHARSET));
        }
        return eventResp;
    }

    private EventResp doHandle(String plainEventJsonStr, Header header) throws Throwable {
        EventResp eventResp = new EventResp();
        eventResp.setStatusCode(Constants.SUCCESS_HTTP_CODE);
        eventResp.setContentType(Constants.JSON_CONTENT_TYPE);
        // 获取eventType与对应的handler
        String eventType = header.getEventType();
        EventTypeEnum eventTypeEnum = EventTypeEnum.getByEventTypeStr(eventType);
        if (eventTypeEnum == null) {
            throw new UnknownEventTypeException(eventType);
        }
        IEventHandler handler = eventType2EventHandler.get(eventTypeEnum);
        if (handler == null) {
            throw new HandlerNotFoundException(eventType);
        }
        // 按照事件类型解析具体回调请求体，并由handler处理
        BaseCallbackDTO detailedCallbackDTO =
                objectMapper.readValue(plainEventJsonStr, handler.getEvent().getClass());
        Object responseData = handler.handle(detailedCallbackDTO);
        // 请求成功，设置返回体为handler的返回
        eventResp.setBody(objectMapper.writeValueAsBytes(responseData));
        return eventResp;
    }

    public static class Builder {
        private Map<EventTypeEnum, IEventHandler> eventType2EventHandler = new HashMap<>();

        private String secretKey;

        public Builder(String secretKey) {
            this.secretKey = secretKey;
        }

        public EventDispatcher build() {
            return new EventDispatcher(this);
        }

        private Builder onEventType(EventTypeEnum eventTypeEnum, IEventHandler handler) {
            if (eventType2EventHandler.containsKey(eventTypeEnum)) {
                throw new EventTypeAlreadyHasHandlerException(eventTypeEnum);
            }
            eventType2EventHandler.put(eventTypeEnum, handler);
            return this;
        }

        public Builder onCheck(EventHandlers.CheckHandler handler) {
            return onEventType(CHECK, handler);
        }

        public Builder onMfgResultNotifyProgressReport(EventHandlers.MfgResultNotifyProgressReportHandler handler) {
            return onEventType(MFG_RESULT_NOTIFY_PROGRESS_REPORT, handler);
        }

        public Builder onMfgResultNotifyProgressReportAdjust(
                EventHandlers.MfgResultNotifyProgressReportAdjustHandler handler) {
            return onEventType(MFG_RESULT_NOTIFY_PROGRESS_REPORT_ADJUST, handler);
        }

        public Builder onMfgResultNotifyFeeding(EventHandlers.MfgResultNotifyFeedingHandler handler) {
            return onEventType(MFG_RESULT_NOTIFY_FEEDING, handler);
        }

        public Builder onMfgResultNotifyFeedingRetract(EventHandlers.MfgResultNotifyFeedingRetractHandler handler) {
            return onEventType(MFG_RESULT_NOTIFY_FEEDING_RETRACT, handler);
        }

        public Builder onMedResultNotifyProduceTaskDispatch(
                EventHandlers.MedResultNotifyProduceTaskDispatchHandler handler) {
            return onEventType(MED_RESULT_NOTIFY_PRODUCE_TASK_DISPATCH, handler);
        }

        public Builder onPloResultNotifyProductionWorkOrderLaunch(
                EventHandlers.PloResultNotifyProductionWorkOrderLaunchHandler handler) {
            return onEventType(PLO_RESULT_NOTIFY_PRODUCTION_WORK_ORDER_LAUNCH, handler);
        }

        public Builder onSopTaskStatusChange(EventHandlers.SopTaskStatusChangeHandler handler) {
            return onEventType(SOP_TASK_STATUS_CHANGE, handler);
        }

        public Builder onReportCreateModify(EventHandlers.ReportCreateModifyHandler handler) {
            return onEventType(REPORT_CREATE_MODIFY, handler);
        }

        public Builder onInventoryResultNotifyOutbound(EventHandlers.InventoryResultNotifyOutboundHandler handler) {
            return onEventType(INVENTORY_RESULT_NOTIFY_OUTBOUND, handler);
        }

        public Builder onInventoryResultNotifyInbound(EventHandlers.InventoryResultNotifyInboundHandler handler) {
            return onEventType(INVENTORY_RESULT_NOTIFY_INBOUND, handler);
        }

        public Builder onInventoryResultNotifyTransfer(EventHandlers.InventoryResultNotifyTransferHandler handler) {
            return onEventType(INVENTORY_RESULT_NOTIFY_TRANSFER, handler);
        }

        public Builder onInventoryResultNotifyTransferIssue(
                EventHandlers.InventoryResultNotifyTransferIssueHandler handler) {
            return onEventType(INVENTORY_RESULT_NOTIFY_TRANSFER_ISSUE, handler);
        }

        public Builder onInventoryResultNotifyTransferReceive(
                EventHandlers.InventoryResultNotifyTransferReceiveHandler handler) {
            return onEventType(INVENTORY_RESULT_NOTIFY_TRANSFER_RECEIVE, handler);
        }

        public Builder onInventoryResultNotifyAdjust(EventHandlers.InventoryResultNotifyAdjustHandler handler) {
            return onEventType(INVENTORY_RESULT_NOTIFY_ADJUST, handler);
        }

        public Builder onInventoryResultNotifyPosting(EventHandlers.InventoryResultNotifyPostingHandler handler) {
            return onEventType(INVENTORY_RESULT_NOTIFY_POSTING, handler);
        }

        public Builder onQualityResultNotifyQcTask(EventHandlers.QualityResultNotifyQcTaskHandler handler) {
            return onEventType(QUALITY_RESULT_NOTIFY_QC_TASK, handler);
        }

        public Builder onQualityResultNotifyChangeQcStatus(
                EventHandlers.QualityResultNotifyChangeQcStatusHandler handler) {
            return onEventType(QUALITY_RESULT_NOTIFY_CHANGE_QC_STATUS, handler);
        }
    }
}
