class parent
  {
    public void parentsAre()
    {
      System.out.println("My mother name  is : leela");
    }
    public void parentsAre(String father)
    {
      System.out.println("Father name is :"+father);
    }
  }
class MethodOvload
  {
    public static void  main(String[] args)
    {
      parent p1=new parent();
      p1.parentsAre();
       parent p2=new parent();
      p2.parentsAre("krishna");
    }
  }