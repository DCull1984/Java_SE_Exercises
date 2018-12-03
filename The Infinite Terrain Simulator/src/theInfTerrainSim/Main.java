package theInfTerrainSim;


public class Main 
{

	public static void main(String[] args) 
	{
		boolean quit = true;
		
		while (quit != false)
		{
		
			Outputs.Start();
		
		
			
			Input look = new Input(); 
			if (look.getInput(look).equalsIgnoreCase("look"))
			{
				Outputs.Middle();
			}
		
			else
			{
				System.out.println("You fail to notice the yorkshire ripper, YOU DIED!");
				return;
			}
			
			//Input Compass = new Input();
		while(Outputs.find != 0)
		{
			System.out.println("");
			System.out.println("Try 'North', 'East', 'South', or 'West'");
		
			Input Compass = new Input();
			if(Compass.getInput(Compass).equalsIgnoreCase("North"))
			{
				Outputs.North();				
			}
		
			else if (Compass.getInput(Compass).equalsIgnoreCase("East"))
			{
				Outputs.East();				
			}
		
			else if (Compass.getInput(Compass).equalsIgnoreCase("South"))
			{
				Outputs.South();				
			}
		
			else if (Compass.getInput(Compass).equalsIgnoreCase("West"))
			{
				Outputs.West();				
			}
		
			else
			{
				System.out.println("You mill about, seriously what are you doing with your life??");				
			}
			//Compass.hInput.close();
		}
		
		Input carryOn = new Input();
		if (carryOn.getInput(carryOn).equalsIgnoreCase("yes") || carryOn.getInput(carryOn).equalsIgnoreCase("y"))
		{
			quit = false;
		}
		
		else
		{
			return;
		}
		
				
		
		
		}
	}
		
	}


