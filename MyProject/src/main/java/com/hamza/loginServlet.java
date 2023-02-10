package com.hamza;

import java.io.IOException;

import com.hamza.relatedClasses.UserClass;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.server.ServerEndpoint;
 
public class loginServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
         HttpSession session = request.getSession(true);
         session.setAttribute("user", new UserClass(request.getParameter("email"),request.getParameter("pass")));
       //  session.setMaxInactiveInterval(2);
         response.sendRedirect("home");
    }
}
