package org.lvh.epa.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "system_log")
public class SystemLog {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "system_entity_id")
    private SystemEntity systemEntity;

    @ManyToOne
    @JoinColumn(name = "system_transition_id")
    private SystemTransition systemTransition;

    @ManyToOne
    @JoinColumn(name = "system_status_id")
    private SystemStatus systemStatus;

    @Column(name = "issued_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date issuedAt;

    @ManyToOne
    @JoinColumn(name = "system_process_id")
    private SystemProcess systemProcess;

    public Long getId() {
        return id;
    }

    public SystemLog setId(Long id) {
        this.id = id;
        return this;
    }

    public SystemEntity getSystemEntity() {
        return systemEntity;
    }

    public SystemLog setSystemEntity(SystemEntity systemEntity) {
        this.systemEntity = systemEntity;
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
                ", systemEntity=" + (systemEntity != null ? systemEntity.getId() : null) +
                ", systemTransition=" + (systemTransition != null ? systemTransition.getId() : null) +
                ", systemStatus=" + systemStatus +
                ", issuedAt=" + issuedAt +
                ", systemProcess=" + systemProcess +
                '}';
    }
}
