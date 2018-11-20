package javaItieration1;

public class Main 
{

	static int testNumbers(int a, int b)
	{
		
		if (a == 3 && b ==5)
		{
			return a + b;
		}
		
		else if (a == 0)
		{			
			return b;
		}
		
		else if (b == 0)
		{
			return a;
		}
		
		else
		{
			return a * b;
		}
		
	}
	
	public static void main(String[] args) 
	{
	
		for (int i = 0; i < 10; ++i)
		{
			System.out.println(testNumbers(i, 5));
		}

	}

}
