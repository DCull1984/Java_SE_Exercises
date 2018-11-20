package mineSweep;

import java.util.Scanner;
import java.util.Random;

public class Main 
{
	/*public static void input()
	{
		Scanner control = new Scanner(System.in);
		
	}
	
	public static int gridSizeX()
	{
		
		System.out.print("Enter Grid Width: ");
		int gridX = control.nextInt();
		
		return gridX;		
	}
	
	public static int gridSizeY()
	{
		
		System.out.print("Enter Grid Height: ");
		int gridY = control.nextInt();
		
	}*/
	
	
	public static void main(String[] args) 
	{
		Scanner control = new Scanner(System.in);
						
		System.out.print("Enter Grid Width: ");
		int gridX = control.nextInt();
		
		System.out.print("Enter Grid Height: ");
		int gridY = control.nextInt();
		
		 char mineGrid [][] = new char [gridX][gridY];
		 char bombs [] = {'X', '0'};
		 Random Blast = new Random(System.currentTimeMillis());
		 
		for (int i = 0; i < mineGrid.length; i++ )
		{
			mineGrid[i][i] = bombs[Blast.nextInt(bombs.length)];
			
			for (int j = 0; j < mineGrid[i].length; j++)
			{
				mineGrid[i][j] = bombs[Blast.nextInt(bombs.length)];	
			
				System.out.print(mineGrid[i][j]);
			}
			
			System.out.println();			
		}
		
		control.close();
		
	}

	

}
