class adittion
  {
    public  void addingTwoNum(int x,int y)
  {
  System.out.println("adittion is :"+(x+y));
  }
    class adittion1 extends adittion{
      public void addingTwoNum(int x,int y)
      {
          System.out.println("adittion is :"+(x+y));
      }
    }
  }
class MethodOverriding
  {
     public static void  main(String[] args)
    {
      adittion a1=new adittion();
      a1.addingTwoNum(5, 6);
      adittion a2=new adittion();
      a2.addingTwoNum(5, 8);
    }
  }