package com.ita.controllers;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello")
public class HelloController extends HttpServlet {
 
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
	String message = "Hi Jenkins from Controller!";

	request.setAttribute("mess", message);

	RequestDispatcher d = request.getRequestDispatcher("/hello_page.jsp");
	d.forward(request, response);

  }
  
}

