package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class StorageLocationDetailInfoResponseDTO {
    /**
     * 仓库信息
     */
    private StorageWarehouseResponseDTO warehouse;

    /**
     * 仓库区域信息
     */
    private StorageAreaTreeResponseDTO area;

    /**
     * 仓库仓位信息
     */
    private StorageLocationResponseDTO location;

    public StorageWarehouseResponseDTO getWarehouse() {
        return warehouse;
    }

    public StorageAreaTreeResponseDTO getArea() {
        return area;
    }

    public StorageLocationResponseDTO getLocation() {
        return location;
    }

    public void setWarehouse(StorageWarehouseResponseDTO warehouse) {
        this.warehouse = warehouse;
    }

    public void setArea(StorageAreaTreeResponseDTO area) {
        this.area = area;
    }

    public void setLocation(StorageLocationResponseDTO location) {
        this.location = location;
    }
}

