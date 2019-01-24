package the.inf.terrain.sim;

public class Main 
{

	public static void main(String[] args) 
	{
		
		boolean playGame = true;
				
		while (playGame != false)
		{			
			Outputs.start();
					
			look(playGame);
			
								
				while(Outputs.find != 0)
				{			
					Outputs.direction();
		
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
			Outputs.middle();
			return playGame = true;
		}
	
		else
		{
			Outputs.missInput();
			return playGame = false;
		}
		
	}
	
public static void compass()
	{
		Input iCompass = new Input();
			
		if(iCompass.getInput(iCompass).equalsIgnoreCase("North"))
		{
			Outputs.north();				
		}
			
		else if (iCompass.getInput(iCompass).equalsIgnoreCase("East"))
		{
			Outputs.east();				
		}
		
		else if (iCompass.getInput(iCompass).equalsIgnoreCase("South"))
		{
			Outputs.south();				
		}
	
		else if (iCompass.getInput(iCompass).equalsIgnoreCase("West"))
		{
			Outputs.west();				
		}
	
		else
		{
			Outputs.noDirection();
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


