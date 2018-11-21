package javaUnique;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input  = new Scanner(System.in);

		int numArray [] = new int [3];
		
		System.out.println("Welcome to the number checker");
		
		System.out.print("Please enter your first number: ");
		numArray[0] = input.nextInt();
		
		System.out.print("Please enter your second number: ");
		numArray[1] = input.nextInt();
		
		System.out.print("Please enter your final number: ");
		numArray[2] = input.nextInt();
		
		if (numArray[0] == numArray[1])
		{
			System.out.println(numArray[0] + numArray[2]);
		}
		
		else if (numArray[0] == numArray[2])
		{
			System.out.println(numArray[0] + numArray[1]);
		}
		
		else if (numArray[1] == numArray[2])
		{
			System.out.println(numArray[0] + numArray [1]);
		}
		
		else
		{
			System.out.println(numArray[0] + numArray[1] + numArray[2]);
		}
		
//		for (int i = 0; i < numArray.length; i++ )
//		{
//			
//			
//			//System.out.println(numArray[i]);
//		}
		
		
		input.close();
	}

}
