import java.util.Scanner;
public class Task2
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first number");
    int num1=sc.nextInt();
    System.out.println("Enter your second number");
    int num2=sc.nextInt();
    int sum=num1+num2;
    int difference;
    if(num1>=num2)
    {
      difference=num1-num2;
    }
    else
    {
      difference=num2-num1;
    }
   
    int product=num1*num2;
    System.out.println("Your sum is "+sum+" Your difference is "+difference+" Your Product is "+product);
      
      
  }
}