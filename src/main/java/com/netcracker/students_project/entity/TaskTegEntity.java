package com.netcracker.students_project.entity;

import javax.persistence.*;


@Entity
@Table(name = "task_tegs", schema = "netcracker", catalog = "nc_student_project")
@IdClass(TaskTegEntityPK.class)
public class TaskTegEntity {
    private long taskId;
    private int tegId;

    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private TaskEntity taskEntity;

    public TaskEntity getTaskEntity() {
        return taskEntity;
    }

    public void setTaskEntity(TaskEntity taskEntity) {
        this.taskEntity = taskEntity;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private TegEntity tegEntity;

    public TegEntity getTegEntity() {
        return tegEntity;
    }

    public void setTegEntity(TegEntity tegEntity) {
        this.tegEntity = tegEntity;
    }

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

        TaskTegEntity that = (TaskTegEntity) o;

        if (taskId != that.taskId) return false;
        if (tegId != that.tegId) return false;

        return true;
    }

    @Override
    public String toString() {
        return "TaskTegEntity{" +
                "taskId=" + taskId +
                ", tegId=" + tegId +
                ", task_id=" + taskEntity.getId() +
                ", teg_text=" + tegEntity.getText() +
                '}';
    }

    @Override
    public int hashCode() {
        int result = (int) (taskId ^ (taskId >>> 32));
        result = 31 * result + tegId;
        return result;
    }
}
