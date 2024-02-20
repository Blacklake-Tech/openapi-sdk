package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class FeedRecordDetailResponseDTO extends CustomFieldBaseVO {
    /**
     * 物料信息
     */
    private MaterialResponseDTO materialInfo;

    /**
     * 投料记录信息
     */
    private FeedRecordInfoResponseDTO feedRecordInfo;

    public MaterialResponseDTO getMaterialInfo() {
        return materialInfo;
    }

    public FeedRecordInfoResponseDTO getFeedRecordInfo() {
        return feedRecordInfo;
    }

    public void setMaterialInfo(MaterialResponseDTO materialInfo) {
        this.materialInfo = materialInfo;
    }

    public void setFeedRecordInfo(FeedRecordInfoResponseDTO feedRecordInfo) {
        this.feedRecordInfo = feedRecordInfo;
    }
}
