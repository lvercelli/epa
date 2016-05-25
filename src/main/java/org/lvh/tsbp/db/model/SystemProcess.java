package org.lvh.tsbp.db.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "system_process")
public class SystemProcess {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "system_operation_id")
    private SystemOperation systemOperation;

    @ManyToOne
    @JoinColumn(name = "issued_by_id")
    private SystemUser issuedBy;

    @Column(name = "started_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startedAt;

    @Column(name = "finished_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date finishedAt;

    @ManyToOne
    @JoinColumn(name = "system_operation_result_id")
    private SystemOperationResult systemOperationResult;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "exception")
    private String exception;

    public Long getId() {
        return id;
    }

    public SystemProcess setId(Long id) {
        this.id = id;
        return this;
    }

    public SystemOperation getSystemOperation() {
        return systemOperation;
    }

    public SystemProcess setSystemOperation(SystemOperation systemOperation) {
        this.systemOperation = systemOperation;
        return this;
    }

    public SystemUser getIssuedBy() {
        return issuedBy;
    }

    public SystemProcess setIssuedBy(SystemUser issuedBy) {
        this.issuedBy = issuedBy;
        return this;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public SystemProcess setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public Date getFinishedAt() {
        return finishedAt;
    }

    public SystemProcess setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    public SystemOperationResult getSystemOperationResult() {
        return systemOperationResult;
    }

    public SystemProcess setSystemOperationResult(SystemOperationResult systemOperationResult) {
        this.systemOperationResult = systemOperationResult;
        return this;
    }

    public String getRemarks() {
        return remarks;
    }

    public SystemProcess setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public String getException() {
        return exception;
    }

    public SystemProcess setException(String exception) {
        this.exception = exception;
        return this;
    }

    @Override
    public String toString() {
        return "SystemProcess{" +
                "id=" + id +
                ", systemOperation=" + (systemOperation != null ? systemOperation.getId() : null) +
                ", issuedBy=" + (issuedBy != null ? issuedBy.getId() : null) +
                ", startedAt=" + startedAt +
                ", finishedAt=" + finishedAt +
                ", systemOperationResult=" + (systemOperationResult != null ? systemOperationResult.getId() : null) +
                ", remarks='" + remarks + '\'' +
                ", exception='" + exception + '\'' +
                '}';
    }
}
