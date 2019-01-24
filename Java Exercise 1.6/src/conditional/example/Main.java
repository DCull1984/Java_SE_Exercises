package conditional.example;

public class Main 
{

	static int testNumbers(int a, int b)
	{
		
		if (a == 3 && b ==5)
		{
			return a + b;
		}
						
		else
		{
			return a * b;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(testNumbers(3, 3));
		
	}

}
