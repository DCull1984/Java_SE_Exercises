package javaPeople;

// Yes this is a mess....
public class Main 
{

	public static void main(String[] args) 
	{
		String arrayPeople[][] = new String [3][3];
		
		Person a; //= new Person();
		Person b; //= new Person();
		Person c; //= new Person();
		
		arrayPeople[0][0] = a.name = ("David");
		arrayPeople[0][1] = a.Age = ("34");
		arrayPeople[0][2] = a.jobTitle = ("Hasn't decided");
		
		arrayPeople[1][0] = b.name = ("Amy");
		arrayPeople[1][1] = b.Age = ("22");
		arrayPeople[1][2] = b.jobTitle = ("Clown");
		
		arrayPeople[2][0] = c.name = ("Freddie");
		arrayPeople[2][1] = c.Age = ("55");
		arrayPeople[2][2] = c.jobTitle = ("Singer");
		
		for(String t[]: arrayPeople)
		{
			System.out.println(t.toString());
		}
		
	}

}
