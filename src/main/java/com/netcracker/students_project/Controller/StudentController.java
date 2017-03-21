package com.netcracker.students_project.Controller;


import com.netcracker.students_project.Service.NameClass;
import com.netcracker.students_project.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    NameClass nameClass=new NameClass();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("mvc-dispatcher") Student student, ModelMap model) {

        nameClass.doSomeThing(student);
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("pass", student.getPass());
        model.addAttribute("id", student.getId());

        return "result";
    }


}