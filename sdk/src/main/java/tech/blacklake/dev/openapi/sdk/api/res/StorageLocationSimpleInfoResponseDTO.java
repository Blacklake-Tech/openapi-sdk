package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class StorageLocationSimpleInfoResponseDTO {
    /**
     * 仓库信息
     */
    private StorageWarehouseResponseDTO warehouse;

    /**
     * 仓库仓位信息
     */
    private StorageLocationResponseDTO location;

    public StorageWarehouseResponseDTO getWarehouse() {
        return warehouse;
    }

    public StorageLocationResponseDTO getLocation() {
        return location;
    }

    public void setWarehouse(StorageWarehouseResponseDTO warehouse) {
        this.warehouse = warehouse;
    }

    public void setLocation(StorageLocationResponseDTO location) {
        this.location = location;
    }
}

