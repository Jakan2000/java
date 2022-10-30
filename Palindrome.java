import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check whether it's a palendrome number");
		int n=sc.nextInt();
		int n1=n;
		int product=1;
		int value=0;
		while(n>0)
		{
	       value=value*10+n%10;
		   n=n/10;
		}
		if(value==n1)
		{
			System.out.println(n1+" is a Palendrome number");
		}
		else
		{
			System.out.println(n1+" is not a Palendrome number");
		}
	}
}
