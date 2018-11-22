package streamLesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main 
{
	public static Stream <String> wordCap(List <String> strList)
	{
		//List <String> Caps = wordCap(strList);
		
		return strList.stream().map(name -> name.toUpperCase());
	}
	
	public static void main(String[] args) 
	{
				
		wordCap(Arrays.asList("Hello", "It's", "Dale"));
		//System.out.print(wordCap());
	}

}
