import java.util.Scanner;
public class Task3
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first number");
    float num1=sc.nextFloat();
    System.out.println("Enter your second number");
    float num2 = sc.nextFloat();
    float sum=num1+num2;
    float difference;
    if(num1>=num2)
    {
      difference=num1-num2;
    }
    else
    {
      difference=num2-num1;
    }
   
    float product=num1*num2;
    System.out.println("Your sum is "+sum+" Your difference is "+difference+" Your Product is "+product);
  }
}