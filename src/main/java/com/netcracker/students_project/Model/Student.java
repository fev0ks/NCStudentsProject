package com.netcracker.students_project.Model;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name;
    private int age;
    private int id;
    private int pass=0;
       private int randomNumberForPass;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        setRandomPass();
        this.pass = randomNumberForPass;
    }

    public Student(String name, int age, int pass) {
        this.name = name;
        this.age = age;
        setRandomPass();
        this.pass=pass+randomNumberForPass;
    }
    private void setRandomPass(){
        randomNumberForPass=(int)(Math.random()*123+1000);
    }
    public void setPass(int pass){
        this.pass=pass+randomNumberForPass;
    }
    public int getPass() {
        return pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
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
    public String toString(){
        return String.format(
                "User[id=%d, Name='%s', Age='%d']",
                id, name, age);
    }
}
