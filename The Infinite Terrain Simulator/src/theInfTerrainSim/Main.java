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
			
			endGame(playGame);	
			/*System.out.print("Do you want to play again? (Y/N): ");
			
			Input quitGame = new Input();
			
			if (quitGame.getInput(quitGame).equalsIgnoreCase("n") || quitGame.getInput(quitGame).equalsIgnoreCase("no"))
			{
				playGame = false;
			}
			
			else
			{
				playGame = true;
			}*/
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
		
public static boolean endGame(boolean playGame)
	{				
		//this.playGame = playGame;
	
		System.out.print("Do you want to play again? (Y/N): ");
		
		Input quitGame = new Input();
		
		if (quitGame.getInput(quitGame).equalsIgnoreCase("n") || quitGame.getInput(quitGame).equalsIgnoreCase("no"))
		{
			
			return playGame = false;
		}
		
		else
		{
			//playGame = true;
			return playGame = true;
		}
	}
}


