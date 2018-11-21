package javaTooHot;

import java.util.Scanner;

public class Main 
{
	

	public static void main(String[] args) 
	{
		int temperature = 0;
		boolean isSummer = false;
				
		Scanner tempInput = new Scanner(System.in);
		
		System.out.print("Please enter the tempertaure: ");
		temperature = tempInput.nextInt();
		
		if (temperature >60 && temperature <90)
		{
			System.out.println("Summer is here!! ");
			 isSummer = true;
		}
		
		else if (temperature >= 90)
		{
			System.out.println("Heatwave today, time for short shorts. (seriously please don't )");
			isSummer = true;
		}
		
		else
		{
			System.out.println("better wrap up warm!! ");
			isSummer = false;
		}
		
		System.out.printf("Condition is: " + isSummer);
		tempInput.close();
	}

}
