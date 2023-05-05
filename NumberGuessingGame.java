package Games;

import java.util.Scanner;

public class NumberGussing {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Chose a number between 1 to 100");
		System.out.println("Guess the number within 5 tries");


		int randomNum = 1 + (int) (100* Math.random());
		//System.out.println(randomNum);
		int count=0;
		for(int i=1; i<=5; i++)
		{
			System.out.print("Guess the number : ");
			int userNum=sc.nextInt();
			if(userNum==randomNum)
			{
				System.out.println("Congratulations! you guessed the correct number :)");
				count++;
				break;
			}
			else if(userNum<randomNum)
			{
				System.out.println("The number is greater than "+userNum);
			}
			else if(userNum>randomNum)
			{
				System.out.println("The number is lesser than "+userNum);
			}
		}
		if(count==0)
		{
			System.out.println("Better luck next time :)");
			System.out.println("The number is "+randomNum);
		}
		
		sc.close();
	}

}
