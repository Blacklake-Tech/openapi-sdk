package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class MaterialDocumentRelResponseDTO {
    /**
     * 物料ID
     */
    private Long materialId;

    /**
     * 文件ID
     */
    private Long documentId;

    /**
     * 文件路径
     */
    private String documentPath;

    public Long getMaterialId() {
        return materialId;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public String getDocumentPath() {
        return documentPath;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }
}

