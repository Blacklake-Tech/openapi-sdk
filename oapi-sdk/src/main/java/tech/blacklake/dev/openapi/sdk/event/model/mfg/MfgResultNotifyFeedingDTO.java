package tech.blacklake.dev.openapi.sdk.event.model.mfg;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

import java.util.List;

public class MfgResultNotifyFeedingDTO extends BaseCallbackDTO {
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

        private Long workOrderId;

        private Long processId;

        private Long taskId;

        private List<Integer> qcStatuses;

        private String qrCode;

        private List<String> batchNoList;

        private List<Long> locationIds;

        private Integer opeAmount;

        private String opeAmountStr;

        private Long opeUnitId;

        private List<String> batchIdentifiers;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
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

        public Long getTaskId() {
            return taskId;
        }

        public void setTaskId(Long taskId) {
            this.taskId = taskId;
        }

        public List<Integer> getQcStatuses() {
            return qcStatuses;
        }

        public void setQcStatuses(List<Integer> qcStatuses) {
            this.qcStatuses = qcStatuses;
        }

        public String getQrCode() {
            return qrCode;
        }

        public void setQrCode(String qrCode) {
            this.qrCode = qrCode;
        }

        public List<String> getBatchNoList() {
            return batchNoList;
        }

        public void setBatchNoList(List<String> batchNoList) {
            this.batchNoList = batchNoList;
        }

        public List<Long> getLocationIds() {
            return locationIds;
        }

        public void setLocationIds(List<Long> locationIds) {
            this.locationIds = locationIds;
        }

        public Integer getOpeAmount() {
            return opeAmount;
        }

        public void setOpeAmount(Integer opeAmount) {
            this.opeAmount = opeAmount;
        }

        public String getOpeAmountStr() {
            return opeAmountStr;
        }

        public void setOpeAmountStr(String opeAmountStr) {
            this.opeAmountStr = opeAmountStr;
        }

        public Long getOpeUnitId() {
            return opeUnitId;
        }

        public void setOpeUnitId(Long opeUnitId) {
            this.opeUnitId = opeUnitId;
        }

        public List<String> getBatchIdentifiers() {
            return batchIdentifiers;
        }

        public void setBatchIdentifiers(List<String> batchIdentifiers) {
            this.batchIdentifiers = batchIdentifiers;
        }
    }

}
