package tech.blacklake.dev.openapi.sdk.event.model.report;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

public class ReportCreateModifyDTO extends BaseCallbackDTO {
    private DataItem data;

    public DataItem getData() {
        return data;
    }

    public void setData(DataItem data) {
        this.data = data;
    }

    public static class DataItem {
        private Long reportId;

        private Integer reportType;

        private Integer operateType;

        public Long getReportId() {
            return reportId;
        }

        public void setReportId(Long reportId) {
            this.reportId = reportId;
        }

        public Integer getReportType() {
            return reportType;
        }

        public void setReportType(Integer reportType) {
            this.reportType = reportType;
        }

        public Integer getOperateType() {
            return operateType;
        }

        public void setOperateType(Integer operateType) {
            this.operateType = operateType;
        }
    }
}