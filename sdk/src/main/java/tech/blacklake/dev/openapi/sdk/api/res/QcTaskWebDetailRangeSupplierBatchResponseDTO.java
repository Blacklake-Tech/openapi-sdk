package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskWebDetailRangeSupplierBatchResponseDTO {
    /**
     * id
     */
    private Long id;

    /**
     * name
     */
    private String name;

    /**
     * 供应商批号
     */
    private String supplierBatchNumber;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSupplierBatchNumber() {
        return supplierBatchNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupplierBatchNumber(String supplierBatchNumber) {
        this.supplierBatchNumber = supplierBatchNumber;
    }
}

