package theInfTerrainSim;

import java.util.Random;

public class Outputs 
{
	Random distance = new Random(System.currentTimeMillis()+5);
	
	
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
	}
	
	public static void East()
	{
		System.out.println("You head East.");
	}
	
	public static void South()
	{
		System.out.println("You head South.");
	}
	
	public static void West()
	{
		System.out.println("You head West.");
	}

}
