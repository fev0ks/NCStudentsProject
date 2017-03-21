package com.netcracker.students_project.entity;

import javax.persistence.*;

@Entity
@Table(name = "test_tb")
public class Student {

    private int id;
    private String name;
    private int age;
    private int pass;

    public Student() {
        this.name = "";
        this.age = 0;
        this.pass = 123456;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int pass) {
        this.name = name;
        this.age = age;
        this.pass = pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getPass() {
        return pass;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, Name='%s', Age='%d',Password='%d']",
                id, name, age,pass);
    }
}
