class  Sports { 

String sport1;
  String sport2;
  Sports(String sport1,String sport2)
    {
      this.sport1=sport1;
      this.sport2=sport2;
    }
    public void sp()
    {
      System.out.println("The sport name is :"+sport1);
      System.out.println("The sport name is :"+sport2);
    }
  }
class Sport
  {
    public static void main(String[] agrs)
    {
      Sports obj=new Sports("cricket","volleyball");
      obj.sp();
        
    
  }


} 