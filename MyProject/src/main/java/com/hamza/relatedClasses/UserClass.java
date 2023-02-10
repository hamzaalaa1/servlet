package com.hamza.relatedClasses;

public class UserClass {
    private String emale;
    private String pass;
  

  public UserClass(String male,String pass)
  {
   this.emale = male;
   this.pass = pass ; 
  }
  public void setEmale(String male) {
      this.emale = male;
  }
  public void setPass(String pass) {
      this.pass = pass;
  }
  public String getEmale() {
      return emale;
  }
  public String getPass() {
      return pass;
  }
  @Override
  public String toString()
  {
    return String.format("Emain :%s\nPass :%s\n",getEmale(),getPass());
  }
}
