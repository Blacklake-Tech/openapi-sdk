package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskSaveForMengniuSimpleNameRequestDTO {
    /**
     * 名称
     */
    private String name;

    /**
     * id
     */
    private Long id;

    /**
     * extra long
     */
    private Long extraLong;

    /**
     * extra string
     */
    private String extraString;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Long getExtraLong() {
        return extraLong;
    }

    public String getExtraString() {
        return extraString;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setExtraLong(Long extraLong) {
        this.extraLong = extraLong;
    }

    public void setExtraString(String extraString) {
        this.extraString = extraString;
    }
}

