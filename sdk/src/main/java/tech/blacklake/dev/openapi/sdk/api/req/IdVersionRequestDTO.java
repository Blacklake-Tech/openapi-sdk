package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

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

