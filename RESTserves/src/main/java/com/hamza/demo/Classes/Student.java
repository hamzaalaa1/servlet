package com.hamza.demo.Classes;

public class Student {
    String name ;
    String id;
    int age ;  
    public Student(String name ,String id,int age )
    {
       this.age = age ; 
       this.name = name ; 
       this.id  = id ; 
    }
    public Student()
    {
        
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
