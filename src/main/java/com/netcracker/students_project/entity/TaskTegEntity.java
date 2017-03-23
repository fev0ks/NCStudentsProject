package com.netcracker.students_project.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "task_tegs", schema = "netcracker", catalog = "nc_student_project")
@IdClass(TaskTegEntityPK.class)
public class TaskTegEntity {
    private long taskId;
    private int tegId;
    private TaskEntity taskEntity;
    private TegEntity tegEntity;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="task_id", referencedColumnName="id")
    public TaskEntity getTaskEntity() {
        return taskEntity;
    }

    public void setTaskEntity(TaskEntity taskEntity) {
        this.taskEntity = taskEntity;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="task_id", referencedColumnName="id")
    public TegEntity getTegEntity() {
        return tegEntity;
    }

    public void setTegEntity(TegEntity tegEntity) {
        this.tegEntity = tegEntity;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "task_id")
    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
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
