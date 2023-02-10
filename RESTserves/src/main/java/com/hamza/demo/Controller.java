package com.hamza.demo;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Media;
import javax.print.attribute.standard.MediaTray;

import com.hamza.demo.Classes.Student;
import com.hamza.demo.Classes.UtilClass;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("demo")
public class Controller {
  private static List<Student> s = new ArrayList<>();

  @GET
  @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
  public List<Student> getStudent() {
    return s;
  }

  @GET
  @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
  @Path("{param}")
  public Student gettStudent(@PathParam("param") String name) {
    return UtilClass.fineStudent(s, name);
  }

  @POST
  @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
  @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
  public void welcom(Student s) {
    this.s.add(s);
  }

  @DELETE
  @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN })
  @Path("{param}")
  public void removeStudent(@PathParam("param") String name) {
    UtilClass.deleteStudent(s, name);
  }
  @PUT
  @Consumes({MediaType.APPLICATION_JSON})
  @Path("{param}")
  public void modifiyData(@PathParam("param")String name,Student newStudent)
  {
     UtilClass.modifiyData(s, name, newStudent);
  }

}
