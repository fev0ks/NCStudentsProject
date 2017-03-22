package com.netcracker.students_project.dao;

import javax.persistence.*;


public class ListenersDao<T> {
    @PrePersist
    void prePersist(T object) {
    }

    @PreUpdate
    void preUpdate(T object) {
    }

    @PreRemove
    void preRemove(T object) {
    }

    @PostLoad
    void postLoad(T object) {
    }

    @PostRemove
    void postRemove(T object) {
    }

    @PostUpdate
    void postUpdate(T object) {
    }

    @PostPersist
    void postPersist(T object) {
    }
}
