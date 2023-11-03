interface selfDescription
  {
     String name="vikas";
    int id=0443;
    String clgname="priyadarshini";

    public void details();
    
  }
class Interfaces implements selfDescription
  {
  
   public void details()
     {
  System.out.println("Name is :"+name);
   System.out.println("id is :"+id);
  System.out.println("clgName is :"+clgname);
  }
  }
class interfaces
  {
  public static void main(String[] args)
    {
      Interfaces obj=new Interfaces();
      obj.details();
    }
  }
  
