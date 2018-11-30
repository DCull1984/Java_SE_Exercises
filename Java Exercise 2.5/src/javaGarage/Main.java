package javaGarage;

import java.util.ArrayList;

public class Main 
{

	/*public static ArrayList <String> Garage()
	{
		ArrayList objInput = new ArrayList();
	}*/
	
	public static void main(String[] args) 
	{
		ArrayList<Vehicle> garage = new ArrayList<Vehicle> ();
		
		Car daihatsu = new Car(4, 680, "Daihatsu", "Midget", "Black");
		Motorbike yam = new Motorbike(1000, 2, 175, "Yamaha", "R1", "Blue & White");
		Van trans = new Van(4, 2500, "Ford", "Transit", "White", "Long-Wheelbase");
		
		garage.add(daihatsu);
		garage.add(yam);
		garage.add(trans);
		
		/*public String toString()
		{
			return ("Contents of the garage: " + );
		}*/
		
		System.out.println("Contents of the garage: " + garage);
		
		
	}


}
