package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ObjectServiceBatchCodeToIdResponseResponseDTO {
    /**
     * pairList
     */
    private List<ObjectServiceCodeIdPairResponseDTO> pairList;

    public List<ObjectServiceCodeIdPairResponseDTO> getPairList() {
        return pairList;
    }

    public void setPairList(List<ObjectServiceCodeIdPairResponseDTO> pairList) {
        this.pairList = pairList;
    }
}

