package org.lvh.tsbp.db.model;

import javax.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "creation_process_id")
    private SystemProcess creationProcess;

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

    public SystemProcess getCreationProcess() {
        return creationProcess;
    }

    public SystemEntity setCreationProcess(SystemProcess creationProcess) {
        this.creationProcess = creationProcess;
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
                ", creationProcess=" + (creationProcess != null ? creationProcess.getId() : null) +
                ", lastSystemLog=" + (lastSystemLog != null ? lastSystemLog.getId() : null) +
                '}';
    }
}
