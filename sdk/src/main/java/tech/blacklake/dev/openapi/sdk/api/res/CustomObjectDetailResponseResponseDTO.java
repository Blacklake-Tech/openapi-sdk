package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class CustomObjectDetailResponseResponseDTO extends CustomObjectDetailCommonResponseVO {
    /**
     * 自定义对象实例id
     */
    private Long instanceId;

    /**
     * 对象编码
     */
    private String objectCode;

    /**
     * 自定义对象从对象列表
     */
    private List<CustomObjectSonObjectInstanceResponseResponseDTO> sonObjects;

    public Long getInstanceId() {
        return instanceId;
    }

    public String getObjectCode() {
        return objectCode;
    }

    public List<CustomObjectSonObjectInstanceResponseResponseDTO> getSonObjects() {
        return sonObjects;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public void setSonObjects(List<CustomObjectSonObjectInstanceResponseResponseDTO> sonObjects) {
        this.sonObjects = sonObjects;
    }
}

