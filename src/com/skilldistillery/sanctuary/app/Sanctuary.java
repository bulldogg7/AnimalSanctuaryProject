package com.skilldistillery.sanctuary.app;

public class Sanctuary {

	private Animal[] animals;
	private int numberOfAnimals = 0;

	final private static int MAX_ANIMALS = 10;

	public Sanctuary() {
	    animals = new Animal[MAX_ANIMALS];
	  }

	public void addAnimal(Car c) {
		animals[numberOfAnimals] = c;
		numberOfAnimals++; 
	}

	public Animal[] getAnimals() {
		Animal[] animalCopy;
		animalCopy = new Animal[numberOfAnimals];
		for (int i = 0; i < numberOfAnimals; i++) {
			animalCopy[i] = animals[i];
		}

		return animalCopy;
	}
}

package com.skilldistillery.sanctuary.entities;
public class Sanctuary {
	private Animal[] animals = new Animal[5];
	private Attendant attendant;
	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
}
	
	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}
	
	public void listAnimals() {
		
		System.out.println(“Heres all the animals in your sanctuary!“);
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println(animals[i].getName());
			}
			else {
			System.out.println(“This enclosure is empty..“);
		}
		}
		
	}
	
	public void addAnimal(Animal animal) {
		for (int i = 0; i <= animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = animal;
				System.out.println(“Thank you for adding the animal to the Sanctuary!“);
				return;
			}
			
		}
		
	}
}