package com.netcracker.students_project.entity;

import javax.persistence.*;


@Entity
@Table(name = "task_tegs", schema = "netcracker", catalog = "nc_student_project")
@IdClass(TaskTegsEntityPK.class)
public class TaskTegsEntity {
    private long taskId;
    private int tegId;

    @Id
    @Column(name = "task_id")
    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    @Id
    @Column(name = "teg_id")
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

        TaskTegsEntity that = (TaskTegsEntity) o;

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
