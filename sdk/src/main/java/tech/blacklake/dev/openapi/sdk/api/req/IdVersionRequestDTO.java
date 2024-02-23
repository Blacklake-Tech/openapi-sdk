package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class IdVersionRequestDTO {
    /**
     * 主键ID
     */
    private long id;

    /**
     * version
     */
    private int version;

    public long getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
