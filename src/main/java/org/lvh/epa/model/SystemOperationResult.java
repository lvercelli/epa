package org.lvh.epa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "system_operation_result")
public class SystemOperationResult {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "code")
    private String code;

    @Column(name = "message")
    private String message;

    public Integer getId() {
        return id;
    }

    public SystemOperationResult setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public SystemOperationResult setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCode() {
        return code;
    }

    public SystemOperationResult setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public SystemOperationResult setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "SystemOperationResult{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
