package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

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
