package org.lvh.tsbp.core.db.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "core_process")
public class CoreProcess {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "core_operation_id")
    private CoreOperation coreOperation;

    @ManyToOne
    @JoinColumn(name = "issued_by_id")
    private CoreUser issuedBy;

    @Column(name = "started_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startedAt;

    @Column(name = "finished_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date finishedAt;

    @ManyToOne
    @JoinColumn(name = "core_operation_result_id")
    private CoreOperationResult coreOperationResult;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "exception")
    private String exception;

    public Long getId() {
        return id;
    }

    public CoreProcess setId(Long id) {
        this.id = id;
        return this;
    }

    public CoreOperation getCoreOperation() {
        return coreOperation;
    }

    public CoreProcess setCoreOperation(CoreOperation coreOperation) {
        this.coreOperation = coreOperation;
        return this;
    }

    public CoreUser getIssuedBy() {
        return issuedBy;
    }

    public CoreProcess setIssuedBy(CoreUser issuedBy) {
        this.issuedBy = issuedBy;
        return this;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public CoreProcess setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public Date getFinishedAt() {
        return finishedAt;
    }

    public CoreProcess setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    public CoreOperationResult getCoreOperationResult() {
        return coreOperationResult;
    }

    public CoreProcess setCoreOperationResult(CoreOperationResult coreOperationResult) {
        this.coreOperationResult = coreOperationResult;
        return this;
    }

    public String getRemarks() {
        return remarks;
    }

    public CoreProcess setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public String getException() {
        return exception;
    }

    public CoreProcess setException(String exception) {
        this.exception = exception;
        return this;
    }

    @Override
    public String toString() {
        return "CoreProcess{" +
                "id=" + id +
                ", coreOperation=" + (coreOperation != null ? coreOperation.getId() : null) +
                ", issuedBy=" + (issuedBy != null ? issuedBy.getId() : null) +
                ", startedAt=" + startedAt +
                ", finishedAt=" + finishedAt +
                ", coreOperationResult=" + (coreOperationResult != null ? coreOperationResult.getId() : null) +
                ", remarks='" + remarks + '\'' +
                ", exception='" + exception + '\'' +
                '}';
    }
}
