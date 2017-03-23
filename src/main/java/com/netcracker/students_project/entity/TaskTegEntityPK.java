package com.netcracker.students_project.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TaskTegEntityPK implements Serializable {
    private long taskId;
    private int tegId;

    @Column(name = "task_id")
    @Id
    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    @Column(name = "teg_id")
    @Id
    public int getTegId() {
        return tegId;
    }

    public void setTegId(int tegId) {
        this.tegId = tegId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskTegEntityPK that = (TaskTegEntityPK) o;

        if (taskId != that.taskId) return false;
        if (tegId != that.tegId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (taskId ^ (taskId >>> 32));
        result = 31 * result + tegId;
        return result;
    }
}
