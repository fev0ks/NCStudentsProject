package ru.studentProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.studentProject.exception.ExceptionDao;
import ru.studentProject.model.Task;
import ru.studentProject.model.User;
import ru.studentProject.service.interfaces.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;
import java.util.Date;


@Controller
public class ControllerMain {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView goMain(@ModelAttribute("mvc-dispatcher") ModelMap model) {
        model.addAttribute("text", "Hello user!!!");
        return new ModelAndView("start", "command", model);
    }

    @RequestMapping(value = "/profile")
    public ModelAndView profile() {
        User user = new User();
        user.setId(Math.round(Math.random() * 100000));
        System.out.println(user.toString());
        //  user.setDtRegistration((Calendar.getInstance().getTime()));
        return new ModelAndView("profile", "command", user);
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

    @RequestMapping(value = "/profileSave")//, method = RequestMethod.GET)
    public ModelAndView profile(@ModelAttribute("mvc-dispatcher") User user, ModelMap model) {
        model.addAttribute("user", user);
        model.addAttribute("dtRegistration", new Date(Calendar.getInstance().getTime().getTime()));// user.getDtRegistration().toString());
        return new ModelAndView("profile", "command", user);
        // return "result";
    }

    @RequestMapping(value = "main", method = RequestMethod.GET)
    public String goHome(ModelMap modelMap) {
        modelMap.addAttribute("code", "55");
        return "main";
    }

    @RequestMapping(value = "/goHome/{user_id}", method = RequestMethod.GET)
    public String homePage(@PathVariable("user_id") long user_id, ModelMap model) throws ExceptionDao {
//        String code = request.getParameter("code");
//        model.addAttribute("code", code);
        //User user=userService.getOrGiveUser(code);
        User user=userService.get(user_id);
        model.addAttribute("user_vk_info", user.toString());
      //  user.setEmail("dmitry.parshikov28@gmail.com");
       // userService.create(a);
        return "home";
    }
//    @RequestMapping (value = "goal/{goal_link}")  //ПРИМЕР как надо тоскать id пользователя, чтоб выкачивать его из бд!11!!
//    public String getGoal (@PathVariable("goal_link") String goal_link,
//                           ModelMap model) {
//        Goals goal = goalService.getGoalsByLink(goal_link);
//        model.addAttribute("goal_name", goal.getName());
//        model.addAttribute("goal_description", goal.getDescription());
//        return "goal";
//    }
    @RequestMapping(value = "/notice")//, method = RequestMethod.GET)
    public String notice(@ModelAttribute("mvc-dispatcher") ModelMap model) {

        return "notification";
    }
    @RequestMapping(value = "/autoTransfer",method = RequestMethod.GET)//, method = RequestMethod.GET)
    public String autoTransferToHomeFromStart(HttpServletRequest request, ModelMap model) {
        String code = request.getParameter("code");
        model.addAttribute("code", code);
        User user=userService.getOrGiveUser(code);
        model.addAttribute("user_id", user.getId());
        return "autoTransfer";
    }

    @RequestMapping(value = "/viewTask")//, method = RequestMethod.GET)
    public String viewTask(@ModelAttribute("mvc-dispatcher") ModelMap model) {

        return "viewTask";
    }
    /*@RequestMapping(value = "main", method = RequestMethod.GET)
    public String goHome(ModelMap modelMap) {
        modelMap.addAttribute("code", "55");
        return "main";
    }*/
}
