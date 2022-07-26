package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ObjectServiceCodeToIdRequestRequestDTO {
    /**
     * objectCode
     */
    private String objectCode;

    /**
     * code
     */
    private String code;

    public String getObjectCode() {
        return objectCode;
    }

    public String getCode() {
        return code;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

