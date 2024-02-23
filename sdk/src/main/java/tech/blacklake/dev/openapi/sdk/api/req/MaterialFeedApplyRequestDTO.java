package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialFeedApplyRequestDTO {
    /**
     * feedKey
     */
    private FeedKeyRequestDTO feedKey;

    /**
     * 单物料投料申请列表
     */
    private List<MaterialFeedApplyItemRequestDTO> materialFeedAppliesItem;

    public FeedKeyRequestDTO getFeedKey() {
        return feedKey;
    }

    public List<MaterialFeedApplyItemRequestDTO> getMaterialFeedAppliesItem() {
        return materialFeedAppliesItem;
    }

    public void setFeedKey(FeedKeyRequestDTO feedKey) {
        this.feedKey = feedKey;
    }

    public void setMaterialFeedAppliesItem(List<MaterialFeedApplyItemRequestDTO> materialFeedAppliesItem) {
        this.materialFeedAppliesItem = materialFeedAppliesItem;
    }
}
