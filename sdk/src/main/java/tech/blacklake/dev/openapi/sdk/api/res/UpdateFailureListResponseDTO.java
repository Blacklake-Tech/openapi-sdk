package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class UpdateFailureListResponseDTO {
    /**
     * 更新失败用户信息
     */
    private List<UpdateFailureResponseDTO> updateFailureVOList;

    /**
     * 更新成功数
     */
    private Integer successNum;

    /**
     * 更新失败数
     */
    private Integer failureNum;

    public List<UpdateFailureResponseDTO> getUpdateFailureVOList() {
        return updateFailureVOList;
    }

    public Integer getSuccessNum() {
        return successNum;
    }

    public Integer getFailureNum() {
        return failureNum;
    }

    public void setUpdateFailureVOList(List<UpdateFailureResponseDTO> updateFailureVOList) {
        this.updateFailureVOList = updateFailureVOList;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public void setFailureNum(Integer failureNum) {
        this.failureNum = failureNum;
    }
}
