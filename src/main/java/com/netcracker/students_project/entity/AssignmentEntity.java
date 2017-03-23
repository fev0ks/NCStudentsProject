package com.netcracker.students_project.entity;

import javax.persistence.*;


@Entity
@Table(name = "assignment", schema = "netcracker", catalog = "nc_student_project")
@IdClass(AssignmentEntityPK.class)
public class AssignmentEntity {
    private long userId;
    private long taskId;
    private Boolean emailNotification;


    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private RoleEntity roleEntity;

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }

    @Id
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "task_id")
    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "email_notification")
    public Boolean getEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(Boolean emailNotification) {
        this.emailNotification = emailNotification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssignmentEntity that = (AssignmentEntity) o;

        if (userId != that.userId) return false;
        if (taskId != that.taskId) return false;
        if (emailNotification != null ? !emailNotification.equals(that.emailNotification) : that.emailNotification != null)
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "AssignmentEntity{" +
                "userId=" + userId +
                ", taskId=" + taskId +
                ", emailNotification=" + emailNotification +
                ", roleName=" + roleEntity.getName() +
                '}';
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (taskId ^ (taskId >>> 32));
        result = 31 * result + (emailNotification != null ? emailNotification.hashCode() : 0);
        return result;
    }
}
