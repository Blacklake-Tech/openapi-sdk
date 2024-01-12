package tech.blacklake.dev.openapi.sdk.event.model.mfg;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

import java.util.List;

public class MfgResultNotifyFeedingRetractDTO extends BaseCallbackDTO {
    private DataItem data;

    public DataItem getData() {
        return data;
    }

    public void setData(DataItem data) {
        this.data = data;
    }

    public static class DataItem {
        private List<Long> recordIds;

        private Boolean result;

        private String reason;

        private List<RecordItem> recordList;

        public List<Long> getRecordIds() {
            return recordIds;
        }

        public void setRecordIds(List<Long> recordIds) {
            this.recordIds = recordIds;
        }

        public Boolean getResult() {
            return result;
        }

        public void setResult(Boolean result) {
            this.result = result;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public List<RecordItem> getRecordList() {
            return recordList;
        }

        public void setRecordList(List<RecordItem> recordList) {
            this.recordList = recordList;
        }
    }

    public static class RecordItem {
        private Long id;

        private Long taskId;

        private String batchIdentifier;

        private String inventoryIdentifier;

        private Integer qcStatus;

        private String batchNo;

        private Integer opeAmount;

        private Long opeUnitId;

        private Long opeLocationId;

        private Integer auxAmount1;

        private Long auxUnitId1;

        private String reason;

        private String remark;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getTaskId() {
            return taskId;
        }

        public void setTaskId(Long taskId) {
            this.taskId = taskId;
        }

        public String getBatchIdentifier() {
            return batchIdentifier;
        }

        public void setBatchIdentifier(String batchIdentifier) {
            this.batchIdentifier = batchIdentifier;
        }

        public String getInventoryIdentifier() {
            return inventoryIdentifier;
        }

        public void setInventoryIdentifier(String inventoryIdentifier) {
            this.inventoryIdentifier = inventoryIdentifier;
        }

        public Integer getQcStatus() {
            return qcStatus;
        }

        public void setQcStatus(Integer qcStatus) {
            this.qcStatus = qcStatus;
        }

        public String getBatchNo() {
            return batchNo;
        }

        public void setBatchNo(String batchNo) {
            this.batchNo = batchNo;
        }

        public Integer getOpeAmount() {
            return opeAmount;
        }

        public void setOpeAmount(Integer opeAmount) {
            this.opeAmount = opeAmount;
        }

        public Long getOpeUnitId() {
            return opeUnitId;
        }

        public void setOpeUnitId(Long opeUnitId) {
            this.opeUnitId = opeUnitId;
        }

        public Long getOpeLocationId() {
            return opeLocationId;
        }

        public void setOpeLocationId(Long opeLocationId) {
            this.opeLocationId = opeLocationId;
        }

        public Integer getAuxAmount1() {
            return auxAmount1;
        }

        public void setAuxAmount1(Integer auxAmount1) {
            this.auxAmount1 = auxAmount1;
        }

        public Long getAuxUnitId1() {
            return auxUnitId1;
        }

        public void setAuxUnitId1(Long auxUnitId1) {
            this.auxUnitId1 = auxUnitId1;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }

}
