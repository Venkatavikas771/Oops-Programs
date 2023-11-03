import java.util.*;
abstract class shape
  {
    
    abstract void rectangle();
    
    abstract void  equiTriangle ();
    abstract void circle();
  }
class Implementation extends shape
  {
    public void rectangle(double lr,double br)
    {
      System.out.println("Area of rectangle :"+(lr*lb));
       System.out.println("Perimeterof rectangle :"+(lr*br)*2);
    }
    public void  equiTriangle(double ae)
    {
   
      System.out.println("Area of EquilateralTriangle :"+(0.433)*ae*2);
       System.out.println("Perimeterof EquilateralTriangle :"+(3*ae));
    }

    public void circle(double radius)
    {
      System.out.println("Area of circle:"+(3.14*radius*radius));
       System.out.println("Perimeterof circle :"+(2*3.14*radius));
    }

    
  }
class  AreaPerimeter
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
      double lr=sc.nextDouble();
    System.out.priSntln("Enter the breadth of rectangle :");
        double  br=sc.nextDouble();

         System.out.println("Enter the length of sides of EquilateralTriangle ");
 double  ae=sc.nextDouble();
System.out.println("Enter the radius of circle");
 double  radius=sc.nextDouble();


      
    }
  }