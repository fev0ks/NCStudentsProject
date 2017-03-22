package com.netcracker.students_project.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by mixa1 on 21.03.2017.
 */
@Entity
@Table(name = "comments_task", schema = "netcracker", catalog = "nc_students_project")
public class CommentsTaskEntity {
    private long id;
    private String text;
    private Date dtCreated;

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
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (dtCreated != null ? dtCreated.hashCode() : 0);
        return result;
    }
}
