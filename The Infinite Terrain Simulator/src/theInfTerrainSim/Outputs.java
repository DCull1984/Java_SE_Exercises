package theInfTerrainSim;

import java.util.Random;

public class Outputs 
{
	private static Random distance = new Random(System.currentTimeMillis());
	
	private static int find = distance.nextInt(6);
	
	
	public static void Start()
	{
		System.out.println("You awaken to find yourself in a barren moor (must be south yorkshire)");
		System.out.println("Try 'Look'");
	}
	
	public static void Middle()
	{
		System.out.print("Grey foggy clouds float oppersively overhead,");
		System.out.println("reflected in the murkey grey water which reaches upto your shins.");
		System.out.println("Some black plants barely poke out of the shallow water.");
		
		System.out.println("");
		
		System.out.println("You notice a small watch-like device in your left hand,");
		System.out.println("YUP! you guessed it, you have a COMPASS!");
		
		System.out.println("");
	}
	
	public static void North()
	{
		System.out.println("You head North.");
		found();
	}
	
	public static void East()
	{
		System.out.println("You head East.");
		found();
	}
	
	public static void South()
	{
		System.out.println("You head South.");
		found();
	}
	
	public static void West()
	{
		System.out.println("You head West.");
		found();
	}
	
	public static void found()
	{
				
		switch(find)
		{
			case 0:
			System.out.println("You found a means to survive!");
			System.out.println("***CONGRATULATIONS!!***");
			break;
		
			case 1:
				System.out.println("You travel for 1 mile and find nothing of value.");
				break;
				
			case 2:
				System.out.println("You travel for 2 miles and find nothing of value, you feel mildly tired.");
				break;
				
			case 3:
				System.out.println("You travel for 3 miles and find more wasteland, you feel moderately tired.");
				break;
				
			case 4:
				System.out.println("You travel 4 miles, you begin to feel really tired with nothing to show.");
				break;
				
			case 5:
			System.out.println("You travel 5 miles, you're really nuts you know that?");
			break;			
		}
		
	}

}
