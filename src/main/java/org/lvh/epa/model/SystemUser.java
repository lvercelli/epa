package org.lvh.epa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "system_user")
public class SystemUser {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "email")
    private String email;

    public Integer getId() {
        return id;
    }

    public SystemUser setId(Integer id) {
        this.id = id;
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
                ", email='" + email + '\'' +
                '}';
    }
}
