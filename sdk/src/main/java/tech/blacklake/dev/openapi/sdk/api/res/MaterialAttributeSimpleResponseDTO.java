package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialAttributeSimpleResponseDTO {
    /**
     * 名称
     */
    private String name;

    /**
     * ID
     */
    private Long id;

    /**
     * 内容
     */
    private String content;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
