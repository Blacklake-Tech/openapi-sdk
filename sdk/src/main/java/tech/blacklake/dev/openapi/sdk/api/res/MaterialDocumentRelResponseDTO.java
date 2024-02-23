package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialDocumentRelResponseDTO {
    /**
     * 文件ID
     */
    private Long documentId;

    /**
     * 文件路径
     */
    private String documentPath;

    public Long getDocumentId() {
        return documentId;
    }

    public String getDocumentPath() {
        return documentPath;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }
}
