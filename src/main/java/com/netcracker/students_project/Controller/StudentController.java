package com.netcracker.students_project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String start(@ModelAttribute("mvc-dispatcher") UserEntity userEntity, ModelMap model) {
//        model.addAttribute("text","Hello user!!!");
//         return "start";
//    }

//    @RequestMapping(value = "/profile")
//    public ModelAndView profile() {
//        UserEntity userEntity=new UserEntity();
//        userEntity.setId(Math.round(Math.random()*100000));
//        System.out.println(userEntity.toString());
//      //  userEntity.setDtRegistration((Calendar.getInstance().getTime()));
//        return new ModelAndView("profile", "command", userEntity);
//    }

//    @RequestMapping(value = "/profileSave")//, method = RequestMethod.GET)
//    public ModelAndView profile(@ModelAttribute("mvc-dispatcher") UserEntity userEntity, ModelMap model) {
//        model.addAttribute("user",userEntity);
//        model.addAttribute("dtRegistration",new Date(Calendar.getInstance().getTime().getTime()));// userEntity.getDtRegistration().toString());
//        return new ModelAndView("profile", "command", userEntity);
//       // return "result";
//    }

//    @RequestMapping(value = "/createTask")//, method = RequestMethod.GET)
//    public String createTask(@ModelAttribute("mvc-dispatcher") TaskEntity taskEntity, UserEntity userEntity, ModelMap model) {
//       // System.out.println(userEntity.toString());
//        model.addAttribute("user",userEntity);
//        model.addAttribute("task",taskEntity);
//        //  nameClass.doSomeThing(student);
//       // model.addAttribute("name", userEntity.getNickname());
//        model.addAttribute("date",new Date(Calendar.getInstance().getTime().getTime()));// userEntity.getDtRegistration().toString());
//
//        return "createTask";
//      //  return new ModelAndView("createTask", "command",model);
//    }

    @RequestMapping(value = "/home")
    public String homePage(@ModelAttribute("mvc-dispatcher") ModelMap model) {
//        System.out.println(userEntity.toString());
//        model.addAttribute(userEntity);
//        TaskEntity taskEntity=new TaskEntity();
//        model.addAttribute(taskEntity);
//        //  nameClass.doSomeThing(student);
//       // model.addAttribute("name", userEntity.getNickname());
//        model.addAttribute("date",new Date(Calendar.getInstance().getTime().getTime()));// userEntity.getDtRegistration().toString());
            model.addAttribute("text","texttext");
            model.addAttribute("rand",Math.round(Math.random()*100000));
     //   return new ModelAndView("home", "command",model);
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