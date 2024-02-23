package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ExecuteAmountResponseDTO {
    /**
     * 执行数量/单位
     */
    private AmountResponseDTO amount;

    /**
     * 辅助单位数量
     */
    private List<AmountResponseDTO> auxAmountList;

    public AmountResponseDTO getAmount() {
        return amount;
    }

    public List<AmountResponseDTO> getAuxAmountList() {
        return auxAmountList;
    }

    public void setAmount(AmountResponseDTO amount) {
        this.amount = amount;
    }

    public void setAuxAmountList(List<AmountResponseDTO> auxAmountList) {
        this.auxAmountList = auxAmountList;
    }
}
