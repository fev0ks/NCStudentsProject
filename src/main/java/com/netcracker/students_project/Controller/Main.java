package com.netcracker.students_project.Controller;

import com.netcracker.students_project.dao.StudentDAO;
import com.netcracker.students_project.entity.Student;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO=new StudentDAO();
        studentDAO.getStudentID(new Student());
    }
}
