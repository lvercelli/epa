package org.lvh.tsbp.core.db.model;

import javax.persistence.*;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "core_user")
public class CoreUser {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "core_entity_id")
    private CoreEntity coreEntity;

    @Column(name = "email")
    private String email;

    public Integer getId() {
        return id;
    }

    public CoreUser setId(Integer id) {
        this.id = id;
        return this;
    }

    public CoreEntity getCoreEntity() {
        return coreEntity;
    }

    public CoreUser setCoreEntity(CoreEntity coreEntity) {
        this.coreEntity = coreEntity;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CoreUser setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "CoreUser{" +
                "id=" + id +
                ", coreEntity=" + (coreEntity != null ? coreEntity.getId() : null) +
                ", email='" + email + '\'' +
                '}';
    }
}
