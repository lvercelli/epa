package org.lvh.tsbp.db.model;

import javax.persistence.*;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "system_status")
public class SystemStatus {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "system_entity_id")
    private SystemEntity systemEntity;

    @Column(name = "name")
    private String name;

    public Integer getId() {
        return id;
    }

    public SystemStatus setId(Integer id) {
        this.id = id;
        return this;
    }

    public SystemEntity getSystemEntity() {
        return systemEntity;
    }

    public SystemStatus setSystemEntity(SystemEntity systemEntity) {
        this.systemEntity = systemEntity;
        return this;
    }

    public String getName() {
        return name;
    }

    public SystemStatus setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "SystemStatus{" +
                "id=" + id +
                ", systemEntity=" + (systemEntity != null ? systemEntity.getId() : null) +
                ", name='" + name + '\'' +
                '}';
    }
}
