package streamLesson;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main 
{
	public static List <String> wordCap(List <String> strList)
	{
		//List <String> Caps = wordCap(strList);
		
			List<String> capitalise = strList.stream()
				.map(name -> name.toUpperCase())
				.collect(Collectors.toList());
			
			return capitalise;
	}
	
	public static void main(String[] args) 
	{
				
		List<String> listOfStrings = Arrays.asList("Hello", "It's", "Dale");
		List<String> capitals = wordCap(listOfStrings); 
		System.out.print(capitals);
	}

}
