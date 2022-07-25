package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class EquipmentResourceGroupInfoRequestDTO  {
    /**
     * ID
     */
    private Long id;

    /**
     * 设备参数集合
     */
    private List<ResourceParamsRequestDTO> paramsCOList;

    public Long getId() {
        return id;
    }

    public List<ResourceParamsRequestDTO> getParamsCOList() {
        return paramsCOList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setParamsCOList(List<ResourceParamsRequestDTO> paramsCOList) {
        this.paramsCOList = paramsCOList;
    }
}

