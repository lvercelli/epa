package org.lvh.tsbp.core.db.model;

import javax.persistence.*;

/**
 * Created by lvercelli on 5/23/16.
 */
@Entity
@Table(name = "core_transition")
public class CoreTransition {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "core_event_id")
    private CoreEvent coreEvent;

    @ManyToOne
    @JoinColumn(name = "prev_system_status_id")
    private CoreStatus prevCoreStatus;

    @ManyToOne
    @JoinColumn(name = "post_system_status_id")
    private CoreStatus postCoreStatus;

    public Long getId() {
        return id;
    }

    public CoreTransition setId(Long id) {
        this.id = id;
        return this;
    }

    public CoreEvent getCoreEvent() {
        return coreEvent;
    }

    public CoreTransition setCoreEvent(CoreEvent coreEvent) {
        this.coreEvent = coreEvent;
        return this;
    }

    public CoreStatus getPrevCoreStatus() {
        return prevCoreStatus;
    }

    public CoreTransition setPrevCoreStatus(CoreStatus prevCoreStatus) {
        this.prevCoreStatus = prevCoreStatus;
        return this;
    }

    public CoreStatus getPostCoreStatus() {
        return postCoreStatus;
    }

    public CoreTransition setPostCoreStatus(CoreStatus postCoreStatus) {
        this.postCoreStatus = postCoreStatus;
        return this;
    }

    @Override
    public String toString() {
        return "CoreTransition{" +
                "id=" + id +
                ", coreEvent=" + (coreEvent != null ? coreEvent.getId() : null) +
                ", prevCoreStatus=" + (prevCoreStatus != null ? prevCoreStatus.getId() : null) +
                ", postCoreStatus=" + (postCoreStatus != null ? postCoreStatus.getId() : null) +
                '}';
    }
}
