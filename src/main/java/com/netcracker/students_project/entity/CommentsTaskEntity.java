package com.netcracker.students_project.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "comments_task", schema = "netcracker", catalog = "nc_student_project")
public class CommentsTaskEntity {
    private long id;
    private String text;
    private Date dtCreated;
    private long task_id;
    private long user_id;

    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private UserEntity userEntity;

    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private TaskEntity taskEntity;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "dt_created")
    public Date getDtCreated() {
        return dtCreated;
    }

    public void setDtCreated(Date dtCreated) {
        this.dtCreated = dtCreated;
    }

    @Basic
    @Column(name = "task_id")
    public long getTask_id() {
        return task_id;
    }

    public void setTask_id(long task_id) {
        this.task_id = task_id;
    }
    @Basic
    @Column(name = "user_id")
    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentsTaskEntity that = (CommentsTaskEntity) o;

        if (id != that.id) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (dtCreated != null ? !dtCreated.equals(that.dtCreated) : that.dtCreated != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "CommentsTaskEntity{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", dtCreated=" + dtCreated +
                ", user_id=" + userEntity.getId() +
                ", task_id=" + taskEntity.getId() +
                '}';
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (dtCreated != null ? dtCreated.hashCode() : 0);
        return result;
    }
}
