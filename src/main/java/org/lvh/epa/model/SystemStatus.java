package org.lvh.epa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "system_status")
public class SystemStatus {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Integer getId() {
        return id;
    }

    public SystemStatus setId(Integer id) {
        this.id = id;
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
                ", name='" + name + '\'' +
                '}';
    }
}
