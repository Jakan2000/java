import java.util.Scanner;
class  Rectanglearea
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the Rectangle");
		int l=sc.nextInt();
		System.out.println("Enter the Breath of the Rectangle");
		int b=sc.nextInt();
		int peri=2*(l+b);
		System.out.println("Area of Rectangle is "+(l*b));
		System.out.println("Perimeter of rectangle is "+peri);
	}
}
