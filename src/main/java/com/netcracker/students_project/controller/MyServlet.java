package com.netcracker.students_project.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		out.print("<h1>Runned as Servlet</h1>");

		String name = req.getParameter("name");

		if(name == null) {
			out.print("<h2 style=\"color: red\">I need your name</h2>");
			out.print("<a href=\"?name=Kitty\">Try this link</a>");
		}
		else {
			out.printf("<h1>Hello %s</h1>", name);
		}
	}
}