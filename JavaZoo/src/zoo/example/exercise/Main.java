package zoo.example.exercise;

import java.util.ArrayList; 

public class Main 
{

	public static void main(String[] args)
	{
		
		ArrayList <Animal> zoo = new ArrayList<>();
		
		Cat cat = new Cat("Tiger", "Bengal", 4);
		
		Dog dog = new Dog ("German Shepard", "Black", 4);
		
		Birds bird = new Birds("Budgie", "blue", "Polly");
		
		zoo.add(cat);
		zoo.add(dog);
		zoo.add(bird);
		
		zoo.forEach(creature->System.out.println(creature));
		
		
		
	}

}
