package theInfTerrainSim;


public class Main 
{

	public static void main(String[] args) 
	{
		
		boolean playGame = true;
		
		
		while (playGame != false)
		{
		
			
			Outputs.Start();
			
		
			look();
								
						
			while(Outputs.find != 0)
			{			
				Outputs.Direction();
		
				compass();
				
			}		
		
		}
					
		
	}
	
	

	public static void look()
	{
		Input look = new Input();
		
		if (look.getInput(look).equalsIgnoreCase("look"))
		{
			Outputs.Middle();
		}
	
		else
		{
			Outputs.MissInput();
		}
	}
	
	public static void compass()
	{
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
			Outputs.NoDirection();
		}				
	}
	
}


