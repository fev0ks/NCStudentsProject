package com.netcracker.students_project.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mixa1 on 21.03.2017.
 */
public class AssignmentEntityPK implements Serializable {
    private long userId;
    private long taskId;

    @Column(name = "user_id")
    @Id
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "task_id")
    @Id
    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssignmentEntityPK that = (AssignmentEntityPK) o;

        if (userId != that.userId) return false;
        if (taskId != that.taskId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (taskId ^ (taskId >>> 32));
        return result;
    }
}
