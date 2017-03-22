package com.netcracker.students_project.Service;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class NameClass {

//    @Transactional
//    public void doSomeThing(Student student) {
//        StudentDAO studentDAO = new StudentDAO();
//        studentDAO.insertStudent(student);
//       // student.setId(studentDAO.getStudentID(student)); так делать не надо, оно вроде само id присвоит
//        System.out.println(student.toString());
//        showStudents(studentDAO.selectAllStudents());
//    }
//
//    public void showStudents(List<Student> listStudent) {
//        if (listStudent != null && !listStudent.isEmpty()) {
//            for (Student student : listStudent
//                    ) {
//                System.out.println(student);
//            }
//        }
//    }
}
