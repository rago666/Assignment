import java.util.Scanner;
public class Task6
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your first number");
    int num1=sc.nextInt();
    System.out.println("Enter your second number");
    int num2=sc.nextInt();
    if(num1>num2)
    {
      System.out.println("first is grater");
    }
    else
    {
      System.out.println("first is not grearter");
    }
  }
}
  
  