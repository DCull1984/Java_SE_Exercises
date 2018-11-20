package javaArrayIter2;

public class Main
{

	public static void main(String[] args) 
	{
		
		int arrayWork[] = new int [10];
		
		for (int i = 0; i < arrayWork.length; i++)
		{
			arrayWork[i] = i + 1;
			System.out.println(arrayWork[i]);
		
		}
		
		for (int j = 0; j < arrayWork.length; j++)
		{
			arrayWork[j] = j * 10;
			System.out.println(arrayWork[j]);
		}
		
		
	}

}
