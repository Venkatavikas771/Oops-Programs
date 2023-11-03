package Package1;
  public class Demo
    {
      protected void msg()         
      {
        System.out.println("Hello world");
      }
    }








import Package1.Demo;

class ProtectedMethod extends Demo
  {
    public static void main(String args[])
    {
      ProtectedMethod ob=new ProtectedMethod();
      ob.msg();
    }
  } 