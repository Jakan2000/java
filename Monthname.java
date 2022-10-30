import java.util.Scanner;
class  Monthname
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to get coresponding month name");
		String[]a={".","JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTUMBER","OCTOBER","NOVEMBER","DECEMBER"};
		int i=sc.nextInt();
		System.out.println(a[i]);
	}
}
