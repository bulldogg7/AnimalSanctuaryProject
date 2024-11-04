package com.skilldistillery.sanctuary.animals;

public class Sanctuary {

	// Fields
	private Animal animals[] = new Animal[5];
	private Attendant attendant;

	// Methods
	// Set Attendant
	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	// List Animals
	public void listAnimals() {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println(animals[i].getName());
			} else {
				System.out.println("There Are No Animals in this Enclosure!");
			}
		}
	}

	// Add An Animal
	public void addAnimal(Animal animal) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = animal;
				System.out.println("Your Animal Has Been Added!");
			} else {
				System.out.println("Animal Can't Be Added! The Sanctuary is Full!");
			}
		}
	}

	// Start Attendant Rounds
	public void startAttendantRounds() {
		Attendant.makeRounds(animals);
	}
}
