class Parent{
  String name;
  Parent(){
    System.out.println("Parent class default condtructor");
  }
  Parent(String name){
    this.name=name;
    System.out.println("Parent class one argumented constructor");
  }
}
class Child extends Parent{
  Child(){
    System.out.println("Child class default constructor");
  }
  Child(String name){
    super(name);
    System.out.println("Child class one argumented constructor");
    
    
  }
}
class ConstructorChaining {
  public static void main(String[] args){
    
    Child obj=new Child();
    Child obj1=new Child("name");
  }



}



