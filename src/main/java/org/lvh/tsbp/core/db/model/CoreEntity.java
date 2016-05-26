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
    private CoreProcess creationProcess;

    @ManyToOne
    @JoinColumn(name = "last_system_log_id")
    private CoreLog lastCoreLog;

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

    public CoreProcess getCreationProcess() {
        return creationProcess;
    }

    public CoreEntity setCreationProcess(CoreProcess creationProcess) {
        this.creationProcess = creationProcess;
        return this;
    }

    public CoreLog getLastCoreLog() {
        return lastCoreLog;
    }

    public CoreEntity setLastCoreLog(CoreLog lastCoreLog) {
        this.lastCoreLog = lastCoreLog;
        return this;
    }

    @Override
    public String toString() {
        return "CoreEntity{" +
                "id=" + id +
                ", coreClass=" + coreClass +
                ", creationProcess=" + (creationProcess != null ? creationProcess.getId() : null) +
                ", lastCoreLog=" + (lastCoreLog != null ? lastCoreLog.getId() : null) +
                '}';
    }
}
