package tech.blacklake.dev.openapi.sdk.constants;

public enum EventTypeEnum {
    MFG_RESULT_NOTIFY_PROGRESS_REPORT("mfg.result_notify.progress_report"),

    MFG_RESULT_NOTIFY_PROGRESS_REPORT_ADJUST("mfg.result_notify.progress_report_adjust"),

    MFG_RESULT_NOTIFY_FEEDING("mfg.result_notify.feeding"),

    MFG_RESULT_NOTIFY_FEEDING_RETRACT("mfg.result_notify.feeding_retract"),

    MFG_RESULT_NOTIFY_PRODUCE_TASK_DISPATCH("med.result_notify.produce_task_dispatch"),

    SOP_TASK_STATUS_CHANGE("sop.sop_task.status_change"),

    REPORT_CREATE_MODIFY("report.report.create_modify"),

    INVENTORY_RESULT_NOTIFY_OUTBOUND("inventory.result_notify.outbound"),

    INVENTORY_RESULT_NOTIFY_INBOUND("inventory.result_notify.inbound"),

    INVENTORY_RESULT_NOTIFY_TRANSFER("inventory.result_notify.transfer"),

    INVENTORY_RESULT_NOTIFY_ADJUST("inventory.result_notify.adjust"),

    INVENTORY_RESULT_NOTIFY_POSTING("inventory.result_notify.posting"),

    PLO_RESULT_NOTIFY_PRODUCTION_WORK_ORDER_LAUNCH("plo.result_notify.production_workorder_launch"),

    INVENTORY_RESULT_NOTIFY_TRANSFER_ISSUE("inventory.result_notify.transfer_issue"),

    INVENTORY_RESULT_NOTIFY_TRANSFER_RECEIVE("inventory.result_notify.transfer_receive"),

    QUALITY_RESULT_NOTIFY_QC_TASK("quality.result_notify.qc_task"),

    QUALITY_RESULT_NOTIFY_CHANGE_QC_STATUS("quality.result_notify.change_qc_status"),

    CHECK("check"),
    ;
    private String eventTypeStr;

    public String getEventTypeStr() {
        return eventTypeStr;
    }

    EventTypeEnum(String eventTypeStr) {
        this.eventTypeStr = eventTypeStr;
    }

    public static EventTypeEnum getByEventTypeStr(String eventTypeStr) {
        for (EventTypeEnum eventTypeEnum : values()) {
            if (eventTypeEnum.getEventTypeStr().equals(eventTypeStr)) {
                return eventTypeEnum;
            }
        }
        return null;
    }
}
