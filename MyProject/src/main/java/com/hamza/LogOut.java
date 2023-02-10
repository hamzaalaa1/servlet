package com.hamza;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogOut extends HttpServlet{
    public void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException
    {
        if(request.getSession(false) != null)
        {  
            request.getSession(false).invalidate();
          
            response.sendRedirect("index.html");
        } else
        {
              response.getWriter().println("<h1>successfully logedOut</h1> <a href=\"index.html\">Back to login</a>");
        }
              
    
    }
}
