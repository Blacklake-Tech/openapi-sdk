package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

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

