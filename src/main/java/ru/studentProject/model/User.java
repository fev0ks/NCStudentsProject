package ru.studentProject.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user_tb", schema = "public", catalog = "nc_students_project", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "nickname"),
        @UniqueConstraint(columnNames = "vk_id"),
})
public class User implements Serializable {

    private long id;
    private String email;
    private String nickname;
    private Date dtRegistration;
    private long vkId;
    private String vkToken;

    private Set<Assignment> assignments = new HashSet<Assignment>();
    private Set<CommentTask> comments = new HashSet<CommentTask>();
    private Set<Submission> submissions = new HashSet<Submission>();

    public User(String nickname, long vkId, String vkToken) {
        this.nickname = nickname;
        this.vkId = vkId;
        this.vkToken = vkToken;
        this.dtRegistration=(new Date(Calendar.getInstance().getTimeInMillis()));
    }

    public User() {
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

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Column(name = "dt_registration")
    public Date getDtRegistration() {
        return dtRegistration;
    }

    public void setDtRegistration(Date dtRegistration) {
        this.dtRegistration = dtRegistration;
    }

    @Column(name = "vk_id")
    public long getVkId() {
        return vkId;
    }

    public void setVkId(long vkId) {
        this.vkId = vkId;
    }

    @Column(name = "vk_token")
    public String getVkToken() {
        return vkToken;
    }


    public void setVkToken(String vkToken) {
        this.vkToken = vkToken;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    public Set<CommentTask> getComments() {
        return comments;
    }

    public void setComments(Set<CommentTask> comments) {
        this.comments = comments;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "mentor")
    public Set<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(Set<Submission> submissions) {
        this.submissions = submissions;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    public Set<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(Set<Assignment> assignments) {
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", vkId=" + vkId +
                ", vkToken='" + vkToken + '\'' +
                '}';
    }
}

