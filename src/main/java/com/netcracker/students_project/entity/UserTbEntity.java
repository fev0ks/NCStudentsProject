package com.netcracker.students_project.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by mixa1 on 21.03.2017.
 */
@Entity
@Table(name = "user_tb", schema = "netcracker", catalog = "nc_students_project")
public class UserTbEntity {
    private long id;
    private String email;
    private String nickname;
    private Date dtRegistration;
    private long vkId;
    private String vkToken;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "dt_registration")
    public Date getDtRegistration() {
        return dtRegistration;
    }

    public void setDtRegistration(Date dtRegistration) {
        this.dtRegistration = dtRegistration;
    }

    @Basic
    @Column(name = "vk_id")
    public long getVkId() {
        return vkId;
    }

    public void setVkId(long vkId) {
        this.vkId = vkId;
    }

    @Basic
    @Column(name = "vk_token")
    public String getVkToken() {
        return vkToken;
    }

    public void setVkToken(String vkToken) {
        this.vkToken = vkToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTbEntity that = (UserTbEntity) o;

        if (id != that.id) return false;
        if (vkId != that.vkId) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (dtRegistration != null ? !dtRegistration.equals(that.dtRegistration) : that.dtRegistration != null)
            return false;
        if (vkToken != null ? !vkToken.equals(that.vkToken) : that.vkToken != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (dtRegistration != null ? dtRegistration.hashCode() : 0);
        result = 31 * result + (int) (vkId ^ (vkId >>> 32));
        result = 31 * result + (vkToken != null ? vkToken.hashCode() : 0);
        return result;
    }
}
