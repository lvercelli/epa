package org.lvh.tsbp.core.db.model;

import javax.persistence.*;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "core_entity")
public class CoreEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "core_class_id")
    private CoreClass coreClass;

    @ManyToOne
    @JoinColumn(name = "creation_process_id")
    private SystemProcess creationProcess;

    @ManyToOne
    @JoinColumn(name = "last_system_log_id")
    private SystemLog lastSystemLog;

    public Long getId() {
        return id;
    }

    public CoreEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public CoreClass getCoreClass() {
        return coreClass;
    }

    public CoreEntity setCoreClass(CoreClass coreClass) {
        this.coreClass = coreClass;
        return this;
    }

    public SystemProcess getCreationProcess() {
        return creationProcess;
    }

    public CoreEntity setCreationProcess(SystemProcess creationProcess) {
        this.creationProcess = creationProcess;
        return this;
    }

    public SystemLog getLastSystemLog() {
        return lastSystemLog;
    }

    public CoreEntity setLastSystemLog(SystemLog lastSystemLog) {
        this.lastSystemLog = lastSystemLog;
        return this;
    }

    @Override
    public String toString() {
        return "CoreEntity{" +
                "id=" + id +
                ", coreClass=" + coreClass +
                ", creationProcess=" + (creationProcess != null ? creationProcess.getId() : null) +
                ", lastSystemLog=" + (lastSystemLog != null ? lastSystemLog.getId() : null) +
                '}';
    }
}
