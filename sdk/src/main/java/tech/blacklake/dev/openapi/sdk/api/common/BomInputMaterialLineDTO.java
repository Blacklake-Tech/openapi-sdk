package tech.blacklake.dev.openapi.sdk.api.common;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class BomInputMaterialLineDTO  {
    /**
     * 父项物料编号,不可超过255个字符
     */
    private String bomMaterialCode = "";

    /**
     * 版本号,不可超过255个字符
     */
    private String bomVersion = "";

    /**
     * 所属项次,子项物料项次号
     */
    private String belongSeq = "";

    /**
     * 项次,默认以1000开始,以10递增,同一物料清单内的多行子项物料(第一层+第二层,非替代件),项次+物料编号不支持重复
     */
    private String seq = "";

    /**
     * 物料编号,不可超过255个字符
     */
    private String materialCode = "";

    /**
     * 物料名称,不可超过255个字符
     */
    private String materialName;

    /**
     * 用量:分子,默认值为所属子项物料行的用量分子,必须大于0
     */
    private String inputAmountNumerator;

    /**
     * 行备注,不可超过1000个字符,支持换行
     */
    private String remark;

    /**
     * 投料工序号,指定投料工序=是时,不可超过255个字符
     */
    private String inputProcessNum;

    /**
     * 投料管控行
     */
    private List<BomFeedingControlDTO> bomFeedingControls;

    public String getBomMaterialCode() {
        return bomMaterialCode;
    }

    public String getBomVersion() {
        return bomVersion;
    }

    public String getBelongSeq() {
        return belongSeq;
    }

    public String getSeq() {
        return seq;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getInputAmountNumerator() {
        return inputAmountNumerator;
    }

    public String getRemark() {
        return remark;
    }

    public String getInputProcessNum() {
        return inputProcessNum;
    }

    public List<BomFeedingControlDTO> getBomFeedingControls() {
        return bomFeedingControls;
    }

    public void setBomMaterialCode(String bomMaterialCode) {
        this.bomMaterialCode = bomMaterialCode;
    }

    public void setBomVersion(String bomVersion) {
        this.bomVersion = bomVersion;
    }

    public void setBelongSeq(String belongSeq) {
        this.belongSeq = belongSeq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setInputAmountNumerator(String inputAmountNumerator) {
        this.inputAmountNumerator = inputAmountNumerator;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setInputProcessNum(String inputProcessNum) {
        this.inputProcessNum = inputProcessNum;
    }

    public void setBomFeedingControls(List<BomFeedingControlDTO> bomFeedingControls) {
        this.bomFeedingControls = bomFeedingControls;
    }
}

