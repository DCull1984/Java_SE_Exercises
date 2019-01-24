package mine.sweep.exercise;

import java.util.Scanner;
import java.util.Random;

public class Main 
{
		
	public static void main(String[] args) 
	{
		Scanner control = new Scanner(System.in);
						
		System.out.print("Enter Grid Width: ");
		int gridX = control.nextInt();
		
		System.out.print("Enter Grid Height: ");
		int gridY = control.nextInt();
		
		 char[][] mineGrid = new char [gridX][gridY];
		 char[] bombs = {'X', '0'};
		 Random blast = new Random(System.currentTimeMillis());
		 
		for (int i = 0; i < mineGrid.length; i++ )
		{
			mineGrid[i][i] = bombs[blast.nextInt(bombs.length)];
			
			for (int j = 0; j < mineGrid[i].length; j++)
			{
				mineGrid[i][j] = bombs[blast.nextInt(bombs.length)];	
			
				System.out.print(mineGrid[i][j]);
			}
			
			System.out.println();			
		}
		
		control.close();
		
	}

	

}
