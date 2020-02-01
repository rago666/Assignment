import java.util.Scanner;
public class Task7
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your first number");
    int num1=sc.nextInt();
    System.out.println("Enter your second number");
    int num2=sc.nextInt();
    if(num1>num2)
    {
      System.out.println("first is greater");
    }
    if(num2>num1)
    {
      System.out.println("second is greater");
    }
    if(num1==num2)
    {
      System.out.println("the numbers are equal");
    }
  }
}