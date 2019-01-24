package people.example;

public class Person 
{
	
	
	String name;
	String Age;
	String jobTitle;
	
	
	Person(String vName, String vAge, String vJobTitle)
	{
		this.name = vName;
		this.Age = vAge;
		this.jobTitle = vJobTitle;
	}
	
	
	public String toString()
	{
		return "Name: " + this.name 
				+ " |Age: " + this.Age
				+ " |Job Title: " + this.jobTitle;
	}

}
