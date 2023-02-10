package com.hamza;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TimerServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException
    {
        long ellabsedTime ;
        long timeInsec;
        long startTime = System.currentTimeMillis();
        while(true)
        {
            ellabsedTime   = System.currentTimeMillis() - startTime ; 
            timeInsec = ellabsedTime/1000;
            if(timeInsec == 10)
            {
               response.sendRedirect("Main");
              break;
            }
        }
    }
}
