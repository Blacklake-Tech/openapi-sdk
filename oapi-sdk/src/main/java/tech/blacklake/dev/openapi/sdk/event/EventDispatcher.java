package tech.blacklake.dev.openapi.sdk.event;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.blacklake.dev.openapi.domain.service.mq.dto.CallbackDTO;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Map;

public class EventDispatcher {
    private static final Logger logger = LoggerFactory.getLogger(EventDispatcher.class);

    private String secretKey;

    private ObjectMapper objectMapper = new ObjectMapper();

    public EventDispatcher(String secretKey) {
        this.secretKey = secretKey;
    }

    public EventDispatcher() {
    }

    public String getSecretKey() {
        return secretKey;
    }

    private String decryptEvent(String encryptedStr) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] keyBytes = digest.digest(secretKey.getBytes(StandardCharsets.UTF_8));
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(keyBytes, "AES"));
        Base64.Decoder decoder = Base64.getDecoder();
        return new String(cipher.doFinal(decoder.decode(encryptedStr.getBytes())));
    }

    private CallbackDTO parseEventCallback(Object callbackBody) throws Exception {
        String callbackBodyStr = objectMapper.writeValueAsString(callbackBody);
        logger.info("event callback has body str: {}", callbackBodyStr);
        if (Strings.isBlank(secretKey)) {
            return objectMapper.readValue(callbackBodyStr, CallbackDTO.class);
        }
        String decryptedBodyStr = decryptEvent((String) (objectMapper.readValue(callbackBodyStr, Map.class)).get("encrypt"));
        logger.info("event callback has body str: {} after decryption", decryptedBodyStr);
        return objectMapper.readValue(decryptedBodyStr, CallbackDTO.class);
    }
}
