package org.lvh.epa.model;

import javax.persistence.*;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "system_event")
public class SystemEvent {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "system_entity_id")
    private SystemEntity systemEntity;

    @Column(name = "description")
    private String description;

    public Integer getId() {
        return id;
    }

    public SystemEvent setId(Integer id) {
        this.id = id;
        return this;
    }

    public SystemEntity getSystemEntity() {
        return systemEntity;
    }

    public SystemEvent setSystemEntity(SystemEntity systemEntity) {
        this.systemEntity = systemEntity;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public SystemEvent setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "SystemEvent{" +
                "id=" + id +
                ", systemEntity=" + (systemEntity != null ? systemEntity.getId() : null) +
                ", description='" + description + '\'' +
                '}';
    }
}
