package org.lvh.tsbp.core.db.model;

import javax.persistence.*;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "core_event")
public class CoreEvent {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "core_entity_id")
    private CoreEntity coreEntity;

    @Column(name = "description")
    private String description;

    public Integer getId() {
        return id;
    }

    public CoreEvent setId(Integer id) {
        this.id = id;
        return this;
    }

    public CoreEntity getCoreEntity() {
        return coreEntity;
    }

    public CoreEvent setCoreEntity(CoreEntity coreEntity) {
        this.coreEntity = coreEntity;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CoreEvent setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "CoreEvent{" +
                "id=" + id +
                ", coreEntity=" + (coreEntity != null ? coreEntity.getId() : null) +
                ", description='" + description + '\'' +
                '}';
    }
}
