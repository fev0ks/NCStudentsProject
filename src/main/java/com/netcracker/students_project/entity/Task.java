package com.netcracker.students_project.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "task", schema = "public", catalog = "nc_students_project")
public class Task {

    private long id;
    private String name;
    private String description;
    private Date dtCreated;

    private Set<Assignment> assignments = new HashSet<Assignment>();
    private Set<Step> steps = new HashSet<Step>();
    private Set<Tag> tags = new HashSet<Tag>();
    private Set<CommentTask> commentTasks = new HashSet<CommentTask>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",  columnDefinition = "serial")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "dt_created")
    public Date getDtCreated() {
        return dtCreated;
    }

    public void setDtCreated(Date dtCreated) {
        this.dtCreated = dtCreated;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "task")
    public Set<Step> getSteps() {
        return steps;
    }

    public void setSteps(Set<Step> steps) {
        this.steps = steps;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "task_tag",
            joinColumns = {@JoinColumn(name="task_id")},
            inverseJoinColumns = {@JoinColumn(name = "tag_id")})
    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "task")
    public Set<CommentTask> getCommentTasks() {
        return commentTasks;
    }

    public void setCommentTasks(Set<CommentTask> commentTasks) {
        this.commentTasks = commentTasks;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "task")
    public Set<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(Set<Assignment> assignments) {
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dtCreated=" + dtCreated +
                ", steps=" + steps +
                ", tags=" + tags +
                '}';
    }
}