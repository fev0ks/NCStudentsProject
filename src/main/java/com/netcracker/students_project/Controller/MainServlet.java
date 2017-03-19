package com.netcracker.students_project.Controller;


import com.netcracker.students_project.Model.User;
import com.netcracker.students_project.dataBase.ManagerDB;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@Controller
@RequestMapping("/")
//@WebServlet("/")
public class MainServlet extends HttpServlet {
    ManagerDB managerDB=ManagerDB.getInstance();

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//       // req.setAttribute("name", "Test jsp");
//        req.getRequestDispatcher("index.jsp").forward(req,resp);
////        PrintWriter out = resp.getWriter();
////        out.print("<h1>Hello Servlet</h1>");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//
//        this.process(req, resp);
//    }
public void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setStatus(200);

    PrintWriter out = resp.getWriter();
    resp.setContentType("text/plain");

    // Get the values of all request parameters
    Enumeration en = req.getParameterNames();
    if (en.hasMoreElements()) {
        // Get the name of the request parameter
        String name = (String) en.nextElement();
        out.println(name);
        int age = (int) en.nextElement();
        out.println(age);
    }
}
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new User());
        modelAndView.addObject("message","123123123");
        modelAndView.setViewName("index");
        return modelAndView;
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String printWelcome(ModelMap model) {
//
//        model.addAttribute("message", "Spring 3 MVC - Hello World");
//        return "index";
//
//    }
    /*как только на index.jsp подтвердится форма
    <spring:form method="post"  modelAttribute="userJSP" action="check-user">,
    то попадем вот сюда
     */
    @RequestMapping(value = "/check-user")
    public ModelAndView checkUser(@ModelAttribute("userJSP") User user) {
        ModelAndView modelAndView = new ModelAndView();

        //имя представления, куда нужно будет перейти
        modelAndView.setViewName("secondPageTest");

        //записываем в атрибут userJSP (используется на странице *.jsp объект user
        modelAndView.addObject("userJSP", user);
        managerDB.insertPeopleToDB(user.getName(),user.getAge());
        return modelAndView; //после уйдем на представление, указанное чуть выше, если оно будет найдено.
    }

}