package Mypack;  

public class Myclass {
public void demo()
   {
     System.out.println("Welcome to packages");
   }
}

import Mypack.Myclass;          
class MyPackage
  {
    public static void main(String args[])
    {
      Myclass obj=new Myclass();
      obj.demo();
    }
  }