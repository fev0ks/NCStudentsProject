package com.netcracker.students_project.Controller;


import com.netcracker.students_project.entity.Student;
import com.netcracker.students_project.dataBase.ManagerDB;
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
        process(student);
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("pass", student.getPass());
        model.addAttribute("id", student.getId());

        return "result";
    }

    public void process(Student student)  {
        ManagerDB managerDB=ManagerDB.getInstance();

        managerDB.insertPeopleToDB(student);
        student.setId(managerDB.getIdUser(student));
        List<Student> hashMap=managerDB.getAllPeopleFromDB();
        for (Student student1:hashMap) {
            System.out.println(student1);
        }
        //return student;
    }
}