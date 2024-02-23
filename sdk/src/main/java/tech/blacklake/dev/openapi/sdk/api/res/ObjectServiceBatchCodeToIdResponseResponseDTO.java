package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

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
