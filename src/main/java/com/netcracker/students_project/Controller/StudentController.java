package com.netcracker.students_project.controller;


import com.netcracker.students_project.entity.Task;
import com.netcracker.students_project.entity.User;
import com.netcracker.students_project.service.StartVK;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;
import java.util.Date;

@SessionAttributes("session")
@Controller
public class StudentController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView start(@ModelAttribute("mvc-dispatcher") ModelMap model) {
        model.addAttribute("text", "Hello user!!!");

        return new ModelAndView("start","command",model);
    }

    @RequestMapping(value = "/profile")
    public ModelAndView profile() {
        User user = new User();
        user.setId(Math.round(Math.random() * 100000));
        System.out.println(user.toString());
        //  user.setDtRegistration((Calendar.getInstance().getTime()));
        return new ModelAndView("profile", "command", user);
    }

    @RequestMapping(value = "/profileSave")//, method = RequestMethod.GET)
    public ModelAndView profile(@ModelAttribute("mvc-dispatcher") User user, ModelMap model) {
        model.addAttribute("user", user);
        model.addAttribute("dtRegistration", new Date(Calendar.getInstance().getTime().getTime()));// user.getDtRegistration().toString());
        return new ModelAndView("profile", "command", user);
        // return "result";
    }

    @RequestMapping(value = "/createTask")//, method = RequestMethod.GET)
    public String createTask(@ModelAttribute("mvc-dispatcher") Task task, User user, ModelMap model) {
        // System.out.println(user.toString());
        model.addAttribute("user", user);
        model.addAttribute("task", task);
        //  nameClass.doSomeThing(student);
        // model.addAttribute("name", user.getNickname());
        model.addAttribute("date", new Date(Calendar.getInstance().getTime().getTime()));// user.getDtRegistration().toString());

        return "createTask";
        //  return new ModelAndView("createTask", "command",model);
    }

    @RequestMapping(value = "/goHome", method = RequestMethod.GET)
    public String homePage(HttpServletRequest request, ModelMap model) {

        String code = request.getParameter("code");
        model.addAttribute("code", code);
        model.addAttribute("rand", Math.round(Math.random() * 100000));
        StartVK startVK=new StartVK();
        model.addAttribute("user_vk_info",startVK.startVkApi(code).toString());
       // model.addAttribute("text", model.get("code"));

         //return new ModelAndView("home", "command",modelMap);
       // return new ModelAndView("home", "command",model);
        return "home";
    }

    @RequestMapping(value = "/mentorList")//, method = RequestMethod.GET)
    public String mentor(@ModelAttribute("mvc-dispatcher") ModelMap model) {

        return "mentorList";
    }

    @RequestMapping(value = "/notice")//, method = RequestMethod.GET)
    public String notice(@ModelAttribute("mvc-dispatcher") ModelMap model) {

        return "notification";
    }

    @RequestMapping(value = "/viewTask")//, method = RequestMethod.GET)
    public String viewTask(@ModelAttribute("mvc-dispatcher") ModelMap model) {

        return "viewTask";
    }

}