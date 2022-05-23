package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class StorageLocationResponseDTO {
    /**
     * 仓库信息
     */
    private StorageWarehouseResponseDTO warehouse;

    /**
     * 区域信息
     */
    private StorageAreaResponseDTO area;

    /**
     * 仓位信息
     */
    private StorageLocationInfoResponseDTO location;

    public StorageWarehouseResponseDTO getWarehouse() {
        return warehouse;
    }

    public StorageAreaResponseDTO getArea() {
        return area;
    }

    public StorageLocationInfoResponseDTO getLocation() {
        return location;
    }

    public void setWarehouse(StorageWarehouseResponseDTO warehouse) {
        this.warehouse = warehouse;
    }

    public void setArea(StorageAreaResponseDTO area) {
        this.area = area;
    }

    public void setLocation(StorageLocationInfoResponseDTO location) {
        this.location = location;
    }
}

