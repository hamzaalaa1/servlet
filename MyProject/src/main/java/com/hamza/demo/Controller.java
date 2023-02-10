package com.hamza.demo;

import javax.print.attribute.standard.Media;
import javax.print.attribute.standard.MediaTray;

import jakarta.enterprise.inject.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("demo")
public class Controller
{
    @GET
    @jakarta.ws.rs.Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public String getStudent()
    { 
      return "hello";
    }
  
}