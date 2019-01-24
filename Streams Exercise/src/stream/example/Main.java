package stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main 
{
	public static List <String> wordCap(List <String> strList)
	{
			return strList.stream()
				.map(name -> name.toUpperCase())
				.collect(Collectors.toList());
			
	}
	
	public static void main(String[] args) 
	{
				
		List<String> listOfStrings = Arrays.asList("Hello", "It's", "Dale");
		List<String> capitals = wordCap(listOfStrings); 
		System.out.print(capitals);
	}

}
