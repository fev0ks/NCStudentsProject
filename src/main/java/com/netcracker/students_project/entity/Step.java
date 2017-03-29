package com.netcracker.students_project.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "step", schema = "public", catalog = "nc_students_project")
public class Step {

    private long id;
    private String name;
    private String description;
    private Date deadline;
    private byte[] proof_photo;
    private Date dt_finished;
    private Date dt_started;

    private Task task;
    private Set<Submission> submissions = new HashSet<Submission>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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

    @Column(name = "deadline")
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Column(name = "proof_photo")
    public byte[] getProof_photo() {
        return proof_photo;
    }

    public void setProof_photo(byte[] proof_photo) {
        this.proof_photo = proof_photo;
    }

    @Column(name = "dt_finished")
    public Date getDt_finished() {
        return dt_finished;
    }

    public void setDt_finished(Date dt_finished) {
        this.dt_finished = dt_finished;
    }

    @Column(name = "dt_started")
    public Date getDt_started() {
        return dt_started;
    }

    public void setDt_started(Date dt_started) {
        this.dt_started = dt_started;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="task_id")
    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "step")
    public Set<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(Set<Submission> submissions) {
        this.submissions = submissions;
    }
}
