package com.netcracker.students_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    private int visitorCount = 0;
    @RequestMapping("/index.jsp")
    public String index(Model model) {
        model.addAttribute("visitorCount", visitorCount++);
        return "WEB-INF/view/index.jsp";
    }
}
