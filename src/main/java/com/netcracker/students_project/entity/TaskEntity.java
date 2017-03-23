package com.netcracker.students_project.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;


@Entity
@Table(name = "task", schema = "netcracker", catalog = "nc_student_project")
public class TaskEntity {
    private long id;
    private String name;
    private String description;
    private Date dtCreated;

    @OneToMany
    @OrderBy("id")
    private Set<StepEntity> stepsSet;

    public Set<StepEntity> getStepsSet() {
        return stepsSet;
    }

    public void setStepsSet(Set<StepEntity> stepsSet) {
        this.stepsSet = stepsSet;
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

        TaskEntity that = (TaskEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (dtCreated != null ? !dtCreated.equals(that.dtCreated) : that.dtCreated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (dtCreated != null ? dtCreated.hashCode() : 0);
        return result;
    }
}
