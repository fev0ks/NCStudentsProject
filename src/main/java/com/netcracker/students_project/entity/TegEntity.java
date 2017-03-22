package com.netcracker.students_project.entity;

import javax.persistence.*;

/**
 * Created by mixa1 on 21.03.2017.
 */
@Entity
@Table(name = "teg", schema = "netcracker", catalog = "nc_students_project")
public class TegEntity {
    private int id;
    private String text;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TegEntity tegEntity = (TegEntity) o;

        if (id != tegEntity.id) return false;
        if (text != null ? !text.equals(tegEntity.text) : tegEntity.text != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }
}
