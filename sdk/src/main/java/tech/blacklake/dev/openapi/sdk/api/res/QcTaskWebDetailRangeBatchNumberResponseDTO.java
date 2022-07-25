package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskWebDetailRangeBatchNumberResponseDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 批号
     */
    private String batchNumber;

    public Long getId() {
        return id;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }
}

