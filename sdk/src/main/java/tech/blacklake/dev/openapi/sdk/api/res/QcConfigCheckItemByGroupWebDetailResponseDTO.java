package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

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

