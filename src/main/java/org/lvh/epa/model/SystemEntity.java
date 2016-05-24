package org.lvh.epa.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "system_entity")
public class SystemEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "system_class_id")
    private SystemClass systemClass;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "created_by_id")
    private SystemUser createdBy;

    @ManyToOne
    @JoinColumn(name = "last_system_log_id")
    private SystemLog lastSystemLog;

    public Long getId() {
        return id;
    }

    public SystemEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public SystemClass getSystemClass() {
        return systemClass;
    }

    public SystemEntity setSystemClass(SystemClass systemClass) {
        this.systemClass = systemClass;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public SystemEntity setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public SystemUser getCreatedBy() {
        return createdBy;
    }

    public SystemEntity setCreatedBy(SystemUser createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public SystemLog getLastSystemLog() {
        return lastSystemLog;
    }

    public SystemEntity setLastSystemLog(SystemLog lastSystemLog) {
        this.lastSystemLog = lastSystemLog;
        return this;
    }

    @Override
    public String toString() {
        return "SystemEntity{" +
                "id=" + id +
                ", systemClass=" + systemClass +
                ", createdAt=" + createdAt +
                ", createdBy=" + (createdBy != null ? createdBy.getId() : null) +
                ", lastSystemLog=" + (lastSystemLog != null ? lastSystemLog.getId() : null) +
                '}';
    }
}
