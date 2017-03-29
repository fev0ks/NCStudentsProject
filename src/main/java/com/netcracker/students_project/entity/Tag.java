package com.netcracker.students_project.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "tag", schema = "public", catalog = "nc_students_project")
public class Tag {

    private long id;
    private String text;

    private Set<Task> taska = new HashSet<Task>();

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name="\"id\"", columnDefinition = "serial")
    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "tags")
    public Set<Task> getTasks() {
        return taska;
    }

    public void setTasks(Set<Task> taske) {
        this.taska = taske;
    }
}