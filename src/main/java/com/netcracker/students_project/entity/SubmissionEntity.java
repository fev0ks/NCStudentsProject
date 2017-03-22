package com.netcracker.students_project.entity;

import javax.persistence.*;

/**
 * Created by mixa1 on 21.03.2017.
 */
@Entity
@Table(name = "submission", schema = "netcracker", catalog = "nc_students_project")
public class SubmissionEntity {
    private long id;
    private Boolean result;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "result")
    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubmissionEntity that = (SubmissionEntity) o;

        if (id != that.id) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = (int) (id ^ (id >>> 32));
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        return result1;
    }
}
