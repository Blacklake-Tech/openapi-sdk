package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcConfigCheckItemByGroupWebDetailResponseDTO {
    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 检验项
     */
    private List<QcConfigCheckItemWebDetailResponseDTO> checkItemAppDetailVOS;

    public String getGroupName() {
        return groupName;
    }

    public List<QcConfigCheckItemWebDetailResponseDTO> getCheckItemAppDetailVOS() {
        return checkItemAppDetailVOS;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setCheckItemAppDetailVOS(List<QcConfigCheckItemWebDetailResponseDTO> checkItemAppDetailVOS) {
        this.checkItemAppDetailVOS = checkItemAppDetailVOS;
    }
}
