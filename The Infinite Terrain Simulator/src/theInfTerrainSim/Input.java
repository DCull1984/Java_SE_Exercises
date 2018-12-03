package theInfTerrainSim;

import java.util.Scanner;


public class Input
{
	private Scanner hInput = new Scanner(System.in);
	private String command = hInput.next();
	//private Input game = hInput;	
		
	
	
	
	
	
	public String getInput(Input control)
	{		
		return this.command;
	}
	
	public void setPlayGame(String mGamePlay)
	{
		this.command = mGamePlay;
	}
}

