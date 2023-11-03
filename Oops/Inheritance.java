class Teachers
  {
    String collegename="IIT";
    String designation="ComputerTeacher";
    public void work()
    {
    System.out.println("College name is "+collegename);
      System.out.println("Designation is "+designation);
    }
  }

class ComputerTeacher extends Teachers
  {
  
    
    public static void main(String[] args)
    {
      Teachers obj=new Teachers();
      obj.work();
      
    }
  }



