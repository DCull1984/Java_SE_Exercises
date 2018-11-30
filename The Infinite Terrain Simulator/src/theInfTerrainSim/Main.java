package theInfTerrainSim;


public class Main 
{

	public static void main(String[] args) 
	{
		Outputs.Start();
		/*Scanner hInput = new Scanner(System.in);
		
		String command = hInput.next();*/
		
		/*System.out.println("You awaken to find yourself in a barren moor (must be south yorkshire)");
		System.out.println("Try 'Look'");*/
		
		Input command = new Input();
		if (command.command.equalsIgnoreCase("Look"))
		{
			Outputs.Middle();
			/*System.out.print("Grey foggy clouds float oppersively overhead,");
			System.out.println("reflected in the murkey grey water which reaches upto your shins.");
			System.out.println("Some black plants barely poke out of the shallow water.");
			
			System.out.println("");
			
			System.out.println("You notice a small watch-like device in your left hand,");
			System.out.println("YUP! you guessed it, you have a COMPASS!");*/
			
		}
		
		else
		{
			System.out.println("You fail to notice the yorkshire ripper, YOU DIED!");
			return;
		}
		
		System.out.println("Try 'North', 'East', 'South', or 'West'");
		
		/*Input Command = new Input();
		if(Command.command.equalsIgnoreCase("North"))
		{
			Outputs.North();
			//System.out.println("You head North.");
		}
		
		else if (Command.command.equalsIgnoreCase("East"))
		{
			Outputs.East();
			//System.out.println("You head East.");
		}
		
		else if (Command.command.equalsIgnoreCase("South"))
		{
			Outputs.South();
			//System.out.println("You head South.");
		}
		
		else if (Command.command.equalsIgnoreCase("West"))
		{
			Outputs.West();
			//System.out.println("You head West.");
		}
		
		else
		{
			System.out.println("You mill about, seriously what are you doing with your life??");
			return;
		}*/
		
		//@test code
		Input compass = new Input();
		
		switch()
		{
			case "North":
			{
				System.out.println("You head North.");
				break;
			}
			
			case "East":
			{
				System.out.println("You head East.");
				break;
			}	
			
			case "South":
			{
				System.out.println("You head South.");
				break;
			}
			
			case "West":
			{
				System.out.println("You head West.");
				break;
			}
		}
		
		
		command.hInput.close();
		//Command.hInput.close();
		}
		
		
	}


