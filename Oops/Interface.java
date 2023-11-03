interface adittion
  {
    abstract public void adding(int x, int y);

    abstract public  void subtracting(int a, int b);
  }

 class calculations implements adittion
  {
    public void adding(int x,int y)
    {
      System.out.println("The adittion is :"+(x+y));
    }
      public void subtracting(int a,int b)
    {
      System.out.print("The adittion is :"+(a-b));
    }
  }
  class Interface
    {
      public static void main(String[] args)
      {
      calculations c=new calculations();
      c.adding(5,6);
      c.subtracting(23, 456);
    }
    }