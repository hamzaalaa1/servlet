package com.hamza;

import com.hamza.Classes.Student;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;

public class App {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        // Student s =
        // client.target("http://localhost:9090/rest/api/demo").path("{hamza}").resolveTemplate("hamza","hamza").request().get(
        // Student.class);
        // System.out.println(s);
        // -----------------------------------------------------------------------------------------------------------------------------------------------------------//
        //   client.
        //   target("http://localhost:9090/rest/api/demo")
        //   .request()
        //   .post(Entity.entity(new Student("Eng.mohsen Diab","1234",20),MediaType.APPLICATION_JSON));
        //   client.
        //   target("http://localhost:9090/rest/api/demo")
        //   .path("{name}").resolveTemplate("name", "Eng.mohsen Diab")
        //   .request()
        //   .delete();

        //   client.
        //   target("http://localhost:9090/rest/api/demo/Eng.mohsen Diab")
        //   .request()
        //   .put(Entity.entity(new Student("hamza","1234",20),MediaType.APPLICATION_JSON));
        
    }
}
