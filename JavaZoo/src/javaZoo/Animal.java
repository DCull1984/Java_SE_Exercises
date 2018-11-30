package javaZoo;

public abstract class Animal 
{
	//////////////Attributes//////////
	int numberOfLegs;
	String name;
	
	//////////Constructors///////////
	Animal(int vNoOfLegs)
	{
		this.numberOfLegs = vNoOfLegs;
	}
	
	Animal(String vName)
	{
		this.name = setName(vName);
	}

	/////////Methods/////////////
	
	public String setName(String vName)
	{
		return name = vName;
	}

}