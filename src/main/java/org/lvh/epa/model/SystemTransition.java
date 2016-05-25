package org.lvh.epa.model;

import javax.persistence.*;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "system_transition")
public class SystemTransition {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "system_event_id")
    private SystemEvent systemEvent;

    @ManyToOne
    @JoinColumn(name = "prev_system_status_id")
    private SystemStatus prevSystemStatus;

    @ManyToOne
    @JoinColumn(name = "post_system_status_id")
    private SystemStatus postSystemStatus;

    public Long getId() {
        return id;
    }

    public SystemTransition setId(Long id) {
        this.id = id;
        return this;
    }

    public SystemEvent getSystemEvent() {
        return systemEvent;
    }

    public SystemTransition setSystemEvent(SystemEvent systemEvent) {
        this.systemEvent = systemEvent;
        return this;
    }

    public SystemStatus getPrevSystemStatus() {
        return prevSystemStatus;
    }

    public SystemTransition setPrevSystemStatus(SystemStatus prevSystemStatus) {
        this.prevSystemStatus = prevSystemStatus;
        return this;
    }

    public SystemStatus getPostSystemStatus() {
        return postSystemStatus;
    }

    public SystemTransition setPostSystemStatus(SystemStatus postSystemStatus) {
        this.postSystemStatus = postSystemStatus;
        return this;
    }

    @Override
    public String toString() {
        return "SystemTransition{" +
                "id=" + id +
                ", systemEvent=" + (systemEvent != null ? systemEvent.getId() : null) +
                ", prevSystemStatus=" + (prevSystemStatus != null ? prevSystemStatus.getId() : null) +
                ", postSystemStatus=" + (postSystemStatus != null ? postSystemStatus.getId() : null) +
                '}';
    }
}
