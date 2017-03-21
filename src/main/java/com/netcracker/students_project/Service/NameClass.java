package com.netcracker.students_project.Service;

import com.netcracker.students_project.dao.StudentDAO;
import com.netcracker.students_project.entity.Student;

import java.util.List;

/**
 * Created by mixa1 on 21.03.2017.
 */
public class NameClass {
    public void doSomeThing(Student student) {
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.insertStudent(student);
        student.setId(studentDAO.getStudentID(student));
        System.out.println(student.toString());
        showStudents(studentDAO.selectAllStudents());
    }

    public void showStudents(List<Student> listStudent) {
        if (listStudent != null && !listStudent.isEmpty()) {
            for (Student student : listStudent
                    ) {
                System.out.println(student);
            }
        }
    }
}
