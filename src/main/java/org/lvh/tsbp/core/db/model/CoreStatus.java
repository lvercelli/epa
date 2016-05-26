package org.lvh.tsbp.core.db.model;

import javax.persistence.*;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "core_status")
public class CoreStatus {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "core_entity_id")
    private CoreEntity coreEntity;

    @Column(name = "name")
    private String name;

    public Integer getId() {
        return id;
    }

    public CoreStatus setId(Integer id) {
        this.id = id;
        return this;
    }

    public CoreEntity getCoreEntity() {
        return coreEntity;
    }

    public CoreStatus setCoreEntity(CoreEntity coreEntity) {
        this.coreEntity = coreEntity;
        return this;
    }

    public String getName() {
        return name;
    }

    public CoreStatus setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "CoreStatus{" +
                "id=" + id +
                ", coreEntity=" + (coreEntity != null ? coreEntity.getId() : null) +
                ", name='" + name + '\'' +
                '}';
    }
}
