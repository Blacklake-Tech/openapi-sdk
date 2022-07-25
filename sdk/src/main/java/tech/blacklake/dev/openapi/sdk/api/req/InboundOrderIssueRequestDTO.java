package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderIssueRequestDTO {
    /**
     * 入库单 ID and Version 集合
     */
    private List<IdVersionRequestDTO> inboundOrderIdVersionList;

    public List<IdVersionRequestDTO> getInboundOrderIdVersionList() {
        return inboundOrderIdVersionList;
    }

    public void setInboundOrderIdVersionList(List<IdVersionRequestDTO> inboundOrderIdVersionList) {
        this.inboundOrderIdVersionList = inboundOrderIdVersionList;
    }
}

