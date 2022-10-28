import java.util.Scanner;
class Squarearea
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Length or Width of a Square");
  int a=sc.nextInt();
  int area=a*a;
  System.out.println("Area of a "+a+" = "+area);
 }
}