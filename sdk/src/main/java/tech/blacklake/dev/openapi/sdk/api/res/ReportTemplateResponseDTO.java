package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ReportTemplateResponseDTO {
    /**
     * 业务id
     */
    private long id;

    /**
     * 模板分类
     */
    private int category;

    /**
     * 名称
     */
    private String name;

    public long getId() {
        return id;
    }

    public int getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }
}

