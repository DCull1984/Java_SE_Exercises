package the.inf.terrain.sim;

import java.util.Scanner;


public class Input
{
	private static Scanner hInput = new Scanner(System.in);
	private  String command = hInput.next();
		
		
	
	public String getInput(Input control)
	{		
		return this.command;
	}
	
		
	
}

