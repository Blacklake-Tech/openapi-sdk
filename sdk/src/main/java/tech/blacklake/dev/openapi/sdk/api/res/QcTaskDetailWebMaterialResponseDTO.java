package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcTaskDetailWebMaterialResponseDTO {
    /**
     * id
     */
    private Long id;

    /**
     * name
     */
    private String name;

    /**
     * code
     */
    private String code;

    /**
     * 物料属性
     */
    private List<MaterialAttributeResponseDTO> attributes;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<MaterialAttributeResponseDTO> getAttributes() {
        return attributes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setAttributes(List<MaterialAttributeResponseDTO> attributes) {
        this.attributes = attributes;
    }
}
