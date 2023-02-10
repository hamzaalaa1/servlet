package com.hamza;

import java.io.IOException;

import com.hamza.relatedClasses.UserClass;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Home extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
       HttpSession session = request.getSession(false);
       if(session==null)
       {
        response.sendRedirect("Main");
       }else
       {
         response.getWriter().println((UserClass)session.getAttribute("user"));
       }
    }
}
