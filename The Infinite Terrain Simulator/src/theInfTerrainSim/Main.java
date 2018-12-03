package theInfTerrainSim;


public class Main 
{

	public static void main(String[] args) 
	{
		boolean playGame = true;
		
		while (playGame != false)
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
			
						
		while(Outputs.find != 0)
		{			
			System.out.println("");
			System.out.print("Try 'North', 'East', 'South', or 'West': ");
		
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
				
		}		
		
		}
		
		/*Input carryOn = new Input();
		
		while(carryOn.setPlayGame( || carryOn.setPlayGame(carryOn))
			{
												
				if (carryOn.setPlayGame(carryOn).equalsIgnoreCase("No"))		
				{
				playGame = false;
				System.out.println("Goodbye.");
				}*/
							
			//}		
		
	}
		
	}


