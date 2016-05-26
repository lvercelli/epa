package org.lvh.tsbp.core.db.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "core_log")
public class CoreLog {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "core_entity_id")
    private CoreEntity coreEntity;

    @ManyToOne
    @JoinColumn(name = "core_transition_id")
    private CoreTransition coreTransition;

    @ManyToOne
    @JoinColumn(name = "core_status_id")
    private CoreStatus coreStatus;

    @Column(name = "issued_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date issuedAt;

    @ManyToOne
    @JoinColumn(name = "core_process_id")
    private CoreProcess coreProcess;

    public Long getId() {
        return id;
    }

    public CoreLog setId(Long id) {
        this.id = id;
        return this;
    }

    public CoreEntity getCoreEntity() {
        return coreEntity;
    }

    public CoreLog setCoreEntity(CoreEntity coreEntity) {
        this.coreEntity = coreEntity;
        return this;
    }

    public CoreTransition getCoreTransition() {
        return coreTransition;
    }

    public CoreLog setCoreTransition(CoreTransition coreTransition) {
        this.coreTransition = coreTransition;
        return this;
    }

    public CoreStatus getCoreStatus() {
        return coreStatus;
    }

    public CoreLog setCoreStatus(CoreStatus coreStatus) {
        this.coreStatus = coreStatus;
        return this;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public CoreLog setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }

    public CoreProcess getCoreProcess() {
        return coreProcess;
    }

    public CoreLog setCoreProcess(CoreProcess coreProcess) {
        this.coreProcess = coreProcess;
        return this;
    }

    @Override
    public String toString() {
        return "CoreLog{" +
                "id=" + id +
                ", coreEntity=" + (coreEntity != null ? coreEntity.getId() : null) +
                ", coreTransition=" + (coreTransition != null ? coreTransition.getId() : null) +
                ", coreStatus=" + coreStatus +
                ", issuedAt=" + issuedAt +
                ", coreProcess=" + coreProcess +
                '}';
    }
}
