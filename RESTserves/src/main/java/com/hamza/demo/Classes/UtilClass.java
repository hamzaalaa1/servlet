package com.hamza.demo.Classes;

import java.util.List;

public class UtilClass {
   static public Student fineStudent(List<Student> list , String name)
    {
       for(Student s :list)
       {
          if(s.getName().equals(name))
          {
            return s ;
          }
       }
       return null ;
    }
    static public void deleteStudent(List<Student> list , String name)
    {
       for(int i = 0 ; i < list.size();i++)
       {
          if(list.get(i).getName().equals(name))
          {
              list.set(i, null);
          }
       }
       
    }
    static public void modifiyData(List<Student> list , String name ,Student newStudent)
    {
       for(int i = 0 ; i < list.size();i++)
       {
          if(list.get(i).getName().equals(name))
          {
              list.get(i).setAge(newStudent.getAge());
              list.get(i).setId(newStudent.getId());
              list.get(i).setName(newStudent.getName());
          }
       }
       
    }
    
}
