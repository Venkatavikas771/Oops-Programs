import java.util.Scanner;

 class Operation {

  public float mean(int num1, int num2, int num3) {
  float  mn = (num1 + num2 + num3) / 3;
  return mn;
  }
}

class Mean {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Operation obj = new Operation();
    System.out.println("Enter the num 1");
    int num1 = sc.nextInt();
    System.out.println("Enter the num 2");
    int num2 = sc.nextInt();
    System.out.println("Enter the num 3");
    int num3 = sc.nextInt();

    float m = obj.mean(num1, num2, num3);
    System.out.println("Mean is :" + m);
  }
}