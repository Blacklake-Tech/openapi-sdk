package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class CustomObjectCreateResponseResponseDTO {
    /**
     * 插入后的实例ID
     */
    private Long insertedId;

    public Long getInsertedId() {
        return insertedId;
    }

    public void setInsertedId(Long insertedId) {
        this.insertedId = insertedId;
    }
}
