package javaArray;

public class Main {
	
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
		
		int arrayWork[] = {12, 32, 18, 43, 29,
				52, 35, 84, 71, 69};
		
		System.out.println(testNumbers(arrayWork[2], 0));

	}

}
