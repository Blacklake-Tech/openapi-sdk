package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

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
