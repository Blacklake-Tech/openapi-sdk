package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialLocationResponseDTO {
    /**
     * 仓位信息
     */
    private SimpleCodeNameIdResponseDTO storage;

    /**
     * 仓库信息
     */
    private SimpleCodeNameIdResponseDTO warehouse;

    /**
     * 区域信息
     */
    private List<SimpleAreaResponseDTO> areaList;

    public SimpleCodeNameIdResponseDTO getStorage() {
        return storage;
    }

    public SimpleCodeNameIdResponseDTO getWarehouse() {
        return warehouse;
    }

    public List<SimpleAreaResponseDTO> getAreaList() {
        return areaList;
    }

    public void setStorage(SimpleCodeNameIdResponseDTO storage) {
        this.storage = storage;
    }

    public void setWarehouse(SimpleCodeNameIdResponseDTO warehouse) {
        this.warehouse = warehouse;
    }

    public void setAreaList(List<SimpleAreaResponseDTO> areaList) {
        this.areaList = areaList;
    }
}
