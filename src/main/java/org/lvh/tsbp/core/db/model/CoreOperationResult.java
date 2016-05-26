package org.lvh.tsbp.core.db.model;

import javax.persistence.*;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "core_operation_result")
public class CoreOperationResult {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "core_operation_id")
    private CoreOperation coreOperation;

    @Column(name = "description")
    private String description;

    @Column(name = "code")
    private String code;

    @Column(name = "message")
    private String message;

    public Integer getId() {
        return id;
    }

    public CoreOperationResult setId(Integer id) {
        this.id = id;
        return this;
    }

    public CoreOperation getCoreOperation() {
        return coreOperation;
    }

    public CoreOperationResult setCoreOperation(CoreOperation coreOperation) {
        this.coreOperation = coreOperation;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CoreOperationResult setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CoreOperationResult setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CoreOperationResult setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "CoreOperationResult{" +
                "id=" + id +
                ", coreOperation=" + (coreOperation != null ? coreOperation.getId() : null) +
                ", description='" + description + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
