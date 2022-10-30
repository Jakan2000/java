import java.util.Scanner;
class Multiple 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			int product=i*n;
			System.out.println(i+" x "+n+" = "+product);
		}
	}
}
