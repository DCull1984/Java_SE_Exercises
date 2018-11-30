package theInfTerrainSim;

import java.util.Scanner;

public class Input
{
	Scanner hInput = new Scanner(System.in);
	
	String command = hInput.next();
		
	enum Direction {North, East, South,	West};
	Direction Compass;
	
	Input(String mCompass)
	{
		this.Compass = Direction.valueOf(mCompass);
	}
	
	Input()
	{
	
	}	
	
	/*Input(direction Compass)
	{
		return;
	}*/
	
	/*public void setDirection (direction mCompass)
	{
		this. = mCompass
	}*/

}

