package tech.blacklake.dev.openapi.sdk.event.model.mfg;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

import java.math.BigDecimal;
import java.util.List;

public class MfgResultNotifyProgressReportAdjustDTO extends BaseCallbackDTO {
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
        private Long taskId;

        private Long materialId;

        private Integer qcStatus;

        private String qrCode;

        private String batchNo;

        private Long progressReportRecordId;

        private BigDecimal reportAmount;

        private Long reportUnitId;

        private Long workOrderId;

        private Long processId;

        public Long getTaskId() {
            return taskId;
        }

        public void setTaskId(Long taskId) {
            this.taskId = taskId;
        }

        public Long getMaterialId() {
            return materialId;
        }

        public void setMaterialId(Long materialId) {
            this.materialId = materialId;
        }

        public Integer getQcStatus() {
            return qcStatus;
        }

        public void setQcStatus(Integer qcStatus) {
            this.qcStatus = qcStatus;
        }

        public String getQrCode() {
            return qrCode;
        }

        public void setQrCode(String qrCode) {
            this.qrCode = qrCode;
        }

        public String getBatchNo() {
            return batchNo;
        }

        public void setBatchNo(String batchNo) {
            this.batchNo = batchNo;
        }

        public Long getProgressReportRecordId() {
            return progressReportRecordId;
        }

        public void setProgressReportRecordId(Long progressReportRecordId) {
            this.progressReportRecordId = progressReportRecordId;
        }

        public BigDecimal getReportAmount() {
            return reportAmount;
        }

        public void setReportAmount(BigDecimal reportAmount) {
            this.reportAmount = reportAmount;
        }

        public Long getReportUnitId() {
            return reportUnitId;
        }

        public void setReportUnitId(Long reportUnitId) {
            this.reportUnitId = reportUnitId;
        }

        public Long getWorkOrderId() {
            return workOrderId;
        }

        public void setWorkOrderId(Long workOrderId) {
            this.workOrderId = workOrderId;
        }

        public Long getProcessId() {
            return processId;
        }

        public void setProcessId(Long processId) {
            this.processId = processId;
        }
    }
}
