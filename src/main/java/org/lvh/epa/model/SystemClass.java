package org.lvh.epa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "system_class")
public class SystemClass {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Integer getId() {
        return id;
    }

    public SystemClass setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SystemClass setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "SystemClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
