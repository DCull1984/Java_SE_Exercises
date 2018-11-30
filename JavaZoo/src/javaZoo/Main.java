package javaZoo;

import java.util.ArrayList; 

public class Main 
{

	public static void main(String[] args)
	{
		
		ArrayList <Animal> Zoo = new ArrayList<Animal>();
		
		Cat cat = new Cat("Tiger", "Bengal", 4);
		Dog dog = new Dog ("German Shepard", "Black", 4);
		Birds bird = new Birds("Budgie", "blue", "Polly");
		Zoo.add(cat);
		Zoo.add(dog);
		Zoo.add(bird);
		
		Zoo.forEach((creature)->System.out.println(creature));
		
		/*for (String myZoo: Zoo)
		{
			
		System.out.println(Zoo.toString());
		}*/
		
	}

}
