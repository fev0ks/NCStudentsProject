package com.netcracker.students_project.Controller;


import com.netcracker.students_project.dao.StudentDAO;
import com.netcracker.students_project.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("mvc-dispatcher") Student student, ModelMap model) {
        StudentDAO studentDAO=new StudentDAO();
        studentDAO.insertStudent(student);
        student.setId(studentDAO.getStudentID(student));
        System.out.println(student.toString());
        showStudents(studentDAO.selectAllStudents());

        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("pass", student.getPass());
        model.addAttribute("id", student.getId());

        return "result";
    }

    public void showStudents(List<Student> listStudent)  {
        if(listStudent!=null && !listStudent.isEmpty()){
            for (Student student : listStudent
                    ) {
                System.out.println(student);
            }
        }
    }
}