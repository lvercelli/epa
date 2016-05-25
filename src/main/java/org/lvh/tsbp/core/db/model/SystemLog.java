package org.lvh.tsbp.core.db.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "core_log")
public class SystemLog {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "core_entity_id")
    private CoreEntity coreEntity;

    @ManyToOne
    @JoinColumn(name = "core_transition_id")
    private SystemTransition systemTransition;

    @ManyToOne
    @JoinColumn(name = "core_status_id")
    private SystemStatus systemStatus;

    @Column(name = "issued_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date issuedAt;

    @ManyToOne
    @JoinColumn(name = "core_process_id")
    private SystemProcess systemProcess;

    public Long getId() {
        return id;
    }

    public SystemLog setId(Long id) {
        this.id = id;
        return this;
    }

    public CoreEntity getCoreEntity() {
        return coreEntity;
    }

    public SystemLog setCoreEntity(CoreEntity coreEntity) {
        this.coreEntity = coreEntity;
        return this;
    }

    public SystemTransition getSystemTransition() {
        return systemTransition;
    }

    public SystemLog setSystemTransition(SystemTransition systemTransition) {
        this.systemTransition = systemTransition;
        return this;
    }

    public SystemStatus getSystemStatus() {
        return systemStatus;
    }

    public SystemLog setSystemStatus(SystemStatus systemStatus) {
        this.systemStatus = systemStatus;
        return this;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public SystemLog setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }

    public SystemProcess getSystemProcess() {
        return systemProcess;
    }

    public SystemLog setSystemProcess(SystemProcess systemProcess) {
        this.systemProcess = systemProcess;
        return this;
    }

    @Override
    public String toString() {
        return "SystemLog{" +
                "id=" + id +
                ", coreEntity=" + (coreEntity != null ? coreEntity.getId() : null) +
                ", systemTransition=" + (systemTransition != null ? systemTransition.getId() : null) +
                ", systemStatus=" + systemStatus +
                ", issuedAt=" + issuedAt +
                ", systemProcess=" + systemProcess +
                '}';
    }
}
