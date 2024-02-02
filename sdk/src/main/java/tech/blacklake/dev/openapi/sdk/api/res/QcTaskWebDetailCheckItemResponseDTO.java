package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskWebDetailCheckItemResponseDTO {
    /**
     * 质检项分组名称
     */
    private String groupName;

    /**
     * 检验项结果信息
     */
    private List<QcTaskWebDetailCheckItemDetailResponseDTO> qcTaskCheckItems;

    public String getGroupName() {
        return groupName;
    }

    public List<QcTaskWebDetailCheckItemDetailResponseDTO> getQcTaskCheckItems() {
        return qcTaskCheckItems;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setQcTaskCheckItems(List<QcTaskWebDetailCheckItemDetailResponseDTO> qcTaskCheckItems) {
        this.qcTaskCheckItems = qcTaskCheckItems;
    }
}

