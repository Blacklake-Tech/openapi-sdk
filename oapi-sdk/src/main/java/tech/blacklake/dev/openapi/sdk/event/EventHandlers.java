package tech.blacklake.dev.openapi.sdk.event;

import tech.blacklake.dev.openapi.sdk.event.model.check.CheckDTO;
import tech.blacklake.dev.openapi.sdk.event.model.inventory.*;
import tech.blacklake.dev.openapi.sdk.event.model.med.MedResultNotifyProduceTaskDispatchDTO;
import tech.blacklake.dev.openapi.sdk.event.model.mfg.MfgResultNotifyFeedingDTO;
import tech.blacklake.dev.openapi.sdk.event.model.mfg.MfgResultNotifyFeedingRetractDTO;
import tech.blacklake.dev.openapi.sdk.event.model.mfg.MfgResultNotifyProgressReportAdjustDTO;
import tech.blacklake.dev.openapi.sdk.event.model.mfg.MfgResultNotifyProgressReportDTO;
import tech.blacklake.dev.openapi.sdk.event.model.plo.PloResultNotifyProductionWorkOrderLaunchDTO;
import tech.blacklake.dev.openapi.sdk.event.model.quality.QualityResultNotifyChangeQcStatusDTO;
import tech.blacklake.dev.openapi.sdk.event.model.quality.QualityResultNotifyQcTaskDTO;
import tech.blacklake.dev.openapi.sdk.event.model.report.ReportCreateModifyDTO;
import tech.blacklake.dev.openapi.sdk.event.model.sop.SopTaskStatusChangeDTO;

public class EventHandlers {

    public abstract static class CheckHandler implements IEventHandler<CheckDTO> {
        @Override
        public CheckDTO getEvent() {
            return new CheckDTO();
        }
    }

    public abstract static class MfgResultNotifyProgressReportHandler
            implements IEventHandler<MfgResultNotifyProgressReportDTO> {
        @Override
        public MfgResultNotifyProgressReportDTO getEvent() {
            return new MfgResultNotifyProgressReportDTO();
        }
    }

    public abstract static class MfgResultNotifyProgressReportAdjustHandler
            implements IEventHandler<MfgResultNotifyProgressReportAdjustDTO> {
        @Override
        public MfgResultNotifyProgressReportAdjustDTO getEvent() {
            return new MfgResultNotifyProgressReportAdjustDTO();
        }
    }

    public abstract static class MfgResultNotifyFeedingHandler implements IEventHandler<MfgResultNotifyFeedingDTO> {
        @Override
        public MfgResultNotifyFeedingDTO getEvent() {
            return new MfgResultNotifyFeedingDTO();
        }
    }

    public abstract static class MfgResultNotifyFeedingRetractHandler
            implements IEventHandler<MfgResultNotifyFeedingRetractDTO> {
        @Override
        public MfgResultNotifyFeedingRetractDTO getEvent() {
            return new MfgResultNotifyFeedingRetractDTO();
        }
    }

    public abstract static class MedResultNotifyProduceTaskDispatchHandler
            implements IEventHandler<MedResultNotifyProduceTaskDispatchDTO> {
        @Override
        public MedResultNotifyProduceTaskDispatchDTO getEvent() {
            return new MedResultNotifyProduceTaskDispatchDTO();
        }
    }

    public abstract static class PloResultNotifyProductionWorkOrderLaunchHandler
            implements IEventHandler<PloResultNotifyProductionWorkOrderLaunchDTO> {
        @Override
        public PloResultNotifyProductionWorkOrderLaunchDTO getEvent() {
            return new PloResultNotifyProductionWorkOrderLaunchDTO();
        }
    }

    public abstract static class SopTaskStatusChangeHandler implements IEventHandler<SopTaskStatusChangeDTO> {
        @Override
        public SopTaskStatusChangeDTO getEvent() {
            return new SopTaskStatusChangeDTO();
        }
    }

    public abstract static class ReportCreateModifyHandler implements IEventHandler<ReportCreateModifyDTO> {
        @Override
        public ReportCreateModifyDTO getEvent() {
            return new ReportCreateModifyDTO();
        }
    }

    public abstract static class InventoryResultNotifyOutboundHandler
            implements IEventHandler<InventoryResultNotifyOutboundDTO> {
        @Override
        public InventoryResultNotifyOutboundDTO getEvent() {
            return new InventoryResultNotifyOutboundDTO();
        }
    }

    public abstract static class InventoryResultNotifyInboundHandler
            implements IEventHandler<InventoryResultNotifyInboundDTO> {
        @Override
        public InventoryResultNotifyInboundDTO getEvent() {
            return new InventoryResultNotifyInboundDTO();
        }
    }

    public abstract static class InventoryResultNotifyTransferHandler
            implements IEventHandler<InventoryResultNotifyTransferDTO> {
        @Override
        public InventoryResultNotifyTransferDTO getEvent() {
            return new InventoryResultNotifyTransferDTO();
        }
    }

    public abstract static class InventoryResultNotifyTransferIssueHandler
            implements IEventHandler<InventoryResultNotifyTransferIssueDTO> {
        @Override
        public InventoryResultNotifyTransferIssueDTO getEvent() {
            return new InventoryResultNotifyTransferIssueDTO();
        }
    }

    public abstract static class InventoryResultNotifyTransferReceiveHandler
            implements IEventHandler<InventoryResultNotifyTransferReceiveDTO> {
        @Override
        public InventoryResultNotifyTransferReceiveDTO getEvent() {
            return new InventoryResultNotifyTransferReceiveDTO();
        }
    }

    public abstract static class InventoryResultNotifyAdjustHandler
            implements IEventHandler<InventoryResultNotifyAdjustDTO> {
        @Override
        public InventoryResultNotifyAdjustDTO getEvent() {
            return new InventoryResultNotifyAdjustDTO();
        }
    }

    public abstract static class InventoryResultNotifyPostingHandler
            implements IEventHandler<InventoryResultNotifyPostingDTO> {
        @Override
        public InventoryResultNotifyPostingDTO getEvent() {
            return new InventoryResultNotifyPostingDTO();
        }
    }

    public abstract static class QualityResultNotifyQcTaskHandler
            implements IEventHandler<QualityResultNotifyQcTaskDTO> {
        @Override
        public QualityResultNotifyQcTaskDTO getEvent() {
            return new QualityResultNotifyQcTaskDTO();
        }
    }

    public abstract static class QualityResultNotifyChangeQcStatusHandler
            implements IEventHandler<QualityResultNotifyChangeQcStatusDTO> {
        @Override
        public QualityResultNotifyChangeQcStatusDTO getEvent() {
            return new QualityResultNotifyChangeQcStatusDTO();
        }
    }
}
