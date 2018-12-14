package theInfTerrainSim;

public class Main 
{

	public static void main(String[] args) 
	{
		
		boolean playGame = true;
				
		while (playGame != false)
		{			
			Outputs.Start();
					
			look(playGame);
			
								
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
	
public static boolean look(boolean playGame)
	{
		Input look = new Input();
		
		if (look.getInput(look).equalsIgnoreCase("look"))
		{
			Outputs.Middle();
			return playGame = true;
		}
	
		else
		{
			Outputs.MissInput();
			return playGame = false;
		}
		
	}
	
public static void compass()
	{
		Input iCompass = new Input();
			
		if(iCompass.getInput(iCompass).equalsIgnoreCase("North"))
		{
			Outputs.North();				
		}
			
		else if (iCompass.getInput(iCompass).equalsIgnoreCase("East"))
		{
			Outputs.East();				
		}
		
		else if (iCompass.getInput(iCompass).equalsIgnoreCase("South"))
		{
			Outputs.South();				
		}
	
		else if (iCompass.getInput(iCompass).equalsIgnoreCase("West"))
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
			
		System.out.print("Do you want to play again? (Y/N): ");
		
		Input quitGame = new Input();
		
		if (quitGame.getInput(quitGame).equalsIgnoreCase("n") || quitGame.getInput(quitGame).equalsIgnoreCase("no"))
		{	
			return playGame = false;
		}
		
		else
		{
			return playGame = true;
		}
	}
}


