package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ObjectServiceBatchCodeToIdRequestRequestDTO {
    /**
     * objectCode
     */
    private String objectCode;

    /**
     * codeList
     */
    private List<String> codeList;

    public String getObjectCode() {
        return objectCode;
    }

    public List<String> getCodeList() {
        return codeList;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }
}
