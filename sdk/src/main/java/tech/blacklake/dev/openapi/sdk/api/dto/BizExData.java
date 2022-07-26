package tech.blacklake.dev.openapi.sdk.api.dto;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BizExData implements Supplier {
    /**
     * args
     */
    private Object[] args;

    /**
     * data
     */
    private Object data;

    /**
     * errorCodeInterface
     */
    private ErrorCodeInterface errorCodeInterface;

    /**
     * needCheck
     */
    private Boolean needCheck;

    public Object[] getArgs() {
        return args;
    }

    public Object getData() {
        return data;
    }

    public ErrorCodeInterface getErrorCodeInterface() {
        return errorCodeInterface;
    }

    public Boolean getNeedCheck() {
        return needCheck;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setErrorCodeInterface(ErrorCodeInterface errorCodeInterface) {
        this.errorCodeInterface = errorCodeInterface;
    }

    public void setNeedCheck(Boolean needCheck) {
        this.needCheck = needCheck;
    }
}

