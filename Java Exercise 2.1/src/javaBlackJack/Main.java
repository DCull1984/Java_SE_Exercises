package javaBlackJack;

public class Main 
{

	public static int BlackJack(int a, int b)
	{
		
		if (a > b && a <= 21)
		{
			return a;
		}
		
		if (a < b && b <= 21)
		{
			return b;
		}
		
		if (a == b)
		{
			return 0;
		}
		
		
				
	}
	
	public static void main(String[] args) 
	{
		System.out.println(BlackJack(22, 18));
	}

}
