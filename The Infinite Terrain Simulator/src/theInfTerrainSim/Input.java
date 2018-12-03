package theInfTerrainSim;

import java.util.Scanner;


public class Input
{
	private Scanner hInput = new Scanner(System.in);
	private String command = hInput.nextLine();
		
	/*Input(String mControl)
	{
		getInput(mControl);
	}*/
	
	
	public String getInput(Input control)
	{
		
		return this.command;
		
	}
}

