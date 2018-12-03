package theInfTerrainSim;


public class Main 
{

	public static void main(String[] args) 
	{
		Outputs.Start();
		
		
		Input look = new Input();
		if (look.command.equalsIgnoreCase("Look"))
		{
			Outputs.Middle();
		}
		
		else
		{
			System.out.println("You fail to notice the yorkshire ripper, YOU DIED!");
			return;
		}
		
		
		System.out.println("Try 'North', 'East', 'South', or 'West'");
		
		Input Compass = new Input();
		if(Compass.command.equalsIgnoreCase("North"))
		{
			Outputs.North();			
		}
		
		else if (Compass.command.equalsIgnoreCase("East"))
		{
			Outputs.East();			
		}
		
		else if (Compass.command.equalsIgnoreCase("South"))
		{
			Outputs.South();			
		}
		
		else if (Compass.command.equalsIgnoreCase("West"))
		{
			Outputs.West();			
		}
		
		else
		{
			System.out.println("You mill about, seriously what are you doing with your life??");
			return;
		}
		
		//test code
		/*Input compass = new Input();
		
		switch()
		{
			case "North":
			{
				Outputs.North();
				break;
			}
			
			case "East":
			{
				Outputs.East();
				break;
			}	
			
			case "South":
			{
				Outputs.South();
				break;
			}
			
			case "West":
			{
				Outputs.West();
				break;
			}
		}*/
		
		
		look.hInput.close();
		Compass.hInput.close();
		}
		
		
	}


