package ru.studentProject.model;


import javax.persistence.*;

@Entity
@Table(name = "assignment", schema = "public", catalog = "nc_students_project")
public class Assignment {

    private long id;
    private boolean emailNotification;

    private User user;
    private Task task;

    public Assignment() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "email_notification")
    public boolean getEmailNotification() {
        return emailNotification;
    }


    public void setEmailNotification(boolean emailNotification) {
        this.emailNotification = emailNotification;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id")
    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
