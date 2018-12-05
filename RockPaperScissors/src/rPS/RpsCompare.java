package rPS;

import java.util.Comparator;

public class RpsCompare implements Comparator<Main>
{

	@Override
	public int compare(Main Comp, Main Player) 
	{
		int Rock = 1;
		int Paper = 2;
		int Scissors = 3;
		
		if (Player.equals(Comp))
		{
			System.out.println("Tie");
		}
		 
		if(Player.equals(1) && Comp.equals(2)) 
		{
			System.out.println("Computer wins!");
		}
		
		if(Player.equals(obj))
		
		return 0;
	
	}

}
