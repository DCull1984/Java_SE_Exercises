package garage.example.j;

import java.util.ArrayList;

public class Main 
{
	
	public static void main(String[] args) 
	{
		ArrayList<Vehicle> garage = new ArrayList<> ();
		
		Car daihatsu = new Car(4, 680, " Daihatsu", " Midget", " Black");
		Motorbike yam = new Motorbike(1000, 2, 175, " Yamaha", " R1", " Blue & White");
		Van trans = new Van(4, 2500, " Ford", " Transit", " White", " Long-Wheelbase");
		
		garage.add(daihatsu);
		garage.add(yam);
		garage.add(trans);
		
		for(Vehicle i : garage)
		{	//current issue values adding together
			System.out.println("Contents of the garage: " + i);
		}
	}


}
