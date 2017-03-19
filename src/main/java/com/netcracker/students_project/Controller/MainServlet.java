package com.netcracker.students_project.Controller;


import com.netcracker.students_project.dataBase.ManagerDB;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServlet;

@Controller
@RequestMapping("/")
public class MainServlet extends HttpServlet {
    ManagerDB managerDB=ManagerDB.getInstance();

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//        req.setAttribute("name", "Test jsp");
//        req.getRequestDispatcher("index.jsp").forward(req,resp);
////        PrintWriter out = resp.getWriter();
////        out.print("<h1>Hello Servlet</h1>");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//
//        super.doPost(req, resp);
//    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView main() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("userJSP", new User());
//        modelAndView.setViewName("index");
//        return modelAndView;
//    }
//
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC - Hello World");
        return "index";

    }
    /*как только на index.jsp подтвердится форма
    <spring:form method="post"  modelAttribute="userJSP" action="check-user">,
    то попадем вот сюда
     */
//    @RequestMapping(value = "/check-user")
//    public ModelAndView checkUser(@ModelAttribute("userJSP") User user) {
//        ModelAndView modelAndView = new ModelAndView();
//
//        //имя представления, куда нужно будет перейти
//        modelAndView.setViewName("secondPageTest");
//
//        //записываем в атрибут userJSP (используется на странице *.jsp объект user
//        modelAndView.addObject("userJSP", user);
//        managerDB.insertPeopleToDB(user.getName(),user.getAge());
//        return modelAndView; //после уйдем на представление, указанное чуть выше, если оно будет найдено.
//    }

}