package parameterOperations;

public class Main {
	
	static int Sum(int x, int y)
	{
		return x + y;		 
	}

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

	/*static int testNumbers(int array[], int b)
	{
		
		if (array[] == 0)
		{			
			return b;
		}
		
		else 
		{
			return array[];
		}*/
		
	//}
	
	
	public static void main(String[] args) 
	{
		
		System.out.println(Sum(2, 5));
		System.out.println("End of Sum");
				
		System.out.println(testNumbers(3, 0));
		System.out.println("End of Test");
				
		for (int i = 0; i < 10; ++i)
		{
			System.out.println(testNumbers(i, 5));
		}
		
		System.out.println("End of For Loop");
				
		int arrayWork[] = {12, 32, 18, 43, 29,
							52, 35, 84, 71, 69};

		System.out.println(testNumbers(arrayWork[2], 0));
		System.out.println("End of Array Test");
		
		for (int j = 0; j < arrayWork.length; j++)
		{
			
		}
		
	}

}
