package com.netcracker.students_project.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;


@Entity
@Table(name = "step", schema = "netcracker", catalog = "nc_student_project")
public class StepEntity {
    private long id;
    private String name;
    private String description;
    private Date deadline;
    private Date dtFinished;
    private Date dtStarted;
    private byte[] proofPhoto;
    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private TaskEntity taskEntity;

    public TaskEntity getTaskEntity() {
        return taskEntity;
    }

    public void setTaskEntity(TaskEntity taskEntity) {
        this.taskEntity = taskEntity;
    }
    @ManyToMany
    private List<SubmissionEntity> submissionEntity;

    public List<SubmissionEntity> getSubmissionEntity() {
        return submissionEntity;
    }

    public void setSubmissionEntity(List<SubmissionEntity> submissionEntity) {
        this.submissionEntity = submissionEntity;
    }

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "deadline")
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "dt_finished")
    public Date getDtFinished() {
        return dtFinished;
    }

    public void setDtFinished(Date dtFinished) {
        this.dtFinished = dtFinished;
    }

    @Basic
    @Column(name = "dt_started")
    public Date getDtStarted() {
        return dtStarted;
    }

    public void setDtStarted(Date dtStarted) {
        this.dtStarted = dtStarted;
    }

    @Basic
    @Column(name = "proof_photo")
    public byte[] getProofPhoto() {
        return proofPhoto;
    }

    public void setProofPhoto(byte[] proofPhoto) {
        this.proofPhoto = proofPhoto;
    }

    @Override
    public String toString() {
        return "StepEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", dtFinished=" + dtFinished +
                ", dtStarted=" + dtStarted +
                ", there is a proofPhoto=" + (!Arrays.toString(proofPhoto).isEmpty()) +
                ", task_id=" + taskEntity.getId() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StepEntity that = (StepEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (deadline != null ? !deadline.equals(that.deadline) : that.deadline != null) return false;
        if (dtFinished != null ? !dtFinished.equals(that.dtFinished) : that.dtFinished != null) return false;
        if (dtStarted != null ? !dtStarted.equals(that.dtStarted) : that.dtStarted != null) return false;
        if (!Arrays.equals(proofPhoto, that.proofPhoto)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (dtFinished != null ? dtFinished.hashCode() : 0);
        result = 31 * result + (dtStarted != null ? dtStarted.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(proofPhoto);
        return result;
    }
}
