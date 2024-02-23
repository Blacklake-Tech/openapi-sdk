package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ChangeMaterialQcStatusRequestDTO {
    /**
     * 物料id
     */
    private Long materialId;

    /**
     * 库存id集合
     */
    private List<ChangeMaterialQcStatusInventoryRequestDTO> inventoryIds;

    /**
     * 修改后质量状态(1合格, 2让步合格, 3待检, 4不合格)
     */
    private Integer toQcStatus;

    /**
     * 备注
     */
    private String description;

    /**
     * 附件id集合
     */
    private List<Long> attachmentIds;

    public Long getMaterialId() {
        return materialId;
    }

    public List<ChangeMaterialQcStatusInventoryRequestDTO> getInventoryIds() {
        return inventoryIds;
    }

    public Integer getToQcStatus() {
        return toQcStatus;
    }

    public String getDescription() {
        return description;
    }

    public List<Long> getAttachmentIds() {
        return attachmentIds;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setInventoryIds(List<ChangeMaterialQcStatusInventoryRequestDTO> inventoryIds) {
        this.inventoryIds = inventoryIds;
    }

    public void setToQcStatus(Integer toQcStatus) {
        this.toQcStatus = toQcStatus;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAttachmentIds(List<Long> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }
}
