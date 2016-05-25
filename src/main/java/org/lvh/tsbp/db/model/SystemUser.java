package org.lvh.tsbp.db.model;

import javax.persistence.*;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "system_user")
public class SystemUser {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "system_entity_id")
    private SystemEntity systemEntity;

    @Column(name = "email")
    private String email;

    public Integer getId() {
        return id;
    }

    public SystemUser setId(Integer id) {
        this.id = id;
        return this;
    }

    public SystemEntity getSystemEntity() {
        return systemEntity;
    }

    public SystemUser setSystemEntity(SystemEntity systemEntity) {
        this.systemEntity = systemEntity;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public SystemUser setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "SystemUser{" +
                "id=" + id +
                ", systemEntity=" + (systemEntity != null ? systemEntity.getId() : null) +
                ", email='" + email + '\'' +
                '}';
    }
}
