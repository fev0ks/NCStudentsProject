package com.netcracker.students_project.controller;


import com.netcracker.students_project.service.NameClass;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    NameClass nameClass=new NameClass();

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView student() {
//        return new ModelAndView("student", "command", new Student());
//    }

  //  @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
//    public String addStudent(@ModelAttribute("mvc-dispatcher") Student student, ModelMap model) {
//
////        nameClass.doSomeThing(student);
////        model.addAttribute("name", student.getName());
////        model.addAttribute("age", student.getAge());
////        model.addAttribute("pass", student.getPass());
////        model.addAttribute("id", student.getId());
//
//        return "result";
//    }


}