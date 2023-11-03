import java.util.*;
class Person { 

  private int age;

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

  
}  

class PersonEncapsulation { 

public static void main(String args[]) { 

  Scanner sc=new Scanner(System.in);

  System.out.println("Enter the age");
  int age=sc.nextInt();

Person p=new Person();
  p.setAge(age);
  System.out.println("The age is :"+p.getAge());

}   

} 