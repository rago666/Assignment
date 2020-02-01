  import java.util.Scanner;
  public class Task4
  {
   public static void main(String[]args)
   {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the radius");
     double r = sc.nextDouble();
     double pie=3.1416;
     double circumference=2*pie*r;
     double area=pie*(Math.pow(r,2));
     System.out.println("Your circumference is "+circumference+" Your area is "+area);
     
       
     
   }
  }