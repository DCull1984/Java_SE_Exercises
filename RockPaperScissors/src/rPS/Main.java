package rPS;

//original code by Sonia & Charlotte.

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		 /*int playerPicks = Player();
		 int HandPlays = Comp();  */
		// WhoWins(playerPicks, HandPlays);
	
		 int rock = 1 ;
		 int paper = 2;
		 int scissors = 3;
	}

		
	public int Player() 
	{
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 1 for Rock, 2 for Paper or 3 for Scissors: ");
			int playerPicks = scanner.nextInt();
			//System.out.println("Player picks: " + playerPicks);
			scanner.close();
			return playerPicks;
	}
		 
	/*public static boolean Validation(String inString) 
	{
		 return(inString == "rock") || (inString == "scissors") || (inString == "paper");
	}*/

	public int Comp() 
	{		 
		 int HandPlays;

		 Random r = new Random();
		 HandPlays = r.nextInt(3) + 1;
		 System.out.println(HandPlays);
		 		 
		 return HandPlays;
	}
}

	/*
	public int compare(playerPicks, HandPlays)
	{
		
	}*/
	/*public int WhoWins(int playerPicks, int handPlays) 
	{
		 
	
						
		 if(player.equals(computer)) {
		  System.out.println("Its a tie");
		 }

		 else{
		  if(player == "rock") {
		   if(computer == "paper") {
		    System.out.println("Computer wins!");
		   }
		   else {
		    System.out.println("Player wins!");
		   }
		  }
		  else if(player == "paper") {
		   if(computer == "rock") {
		    System.out.println("Player wins!");
		   }
		   else {
		    System.out.println("Computer wins!");
		   }
		  }
		  else {
		   if(computer == "rock") {
		    System.out.println("Computer wins!");
		   }
		   else {
		    System.out.println("Player wins!");
		   }
		  }
		// }

	}*/


