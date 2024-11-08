package com.skilldistillery.sanctuary.animals;

public class Sanctuary {

	// Fields
	private Animal animalEnclosures[] = new Animal[5];
	public Sanctuary(int numberOfEnclosures) {
		animalEnclosures = new Animal[numberOfEnclosures];
	}

	// Methods
	// Set Attendant
	public void setAttendant(Attendant attendant) {
	}

	// List Animals
	public void listAnimals() {
		for (Animal animal : animalEnclosures) {
			if (animal != null) {
				System.out.println("This Enclosure has: " + animal.getName() + " the " + animal.getClass().getSimpleName());
			} else {
				System.out.println("There Are No Animals in this Enclosure!");
			}
		}
	}

	// Add An Animal
	public void addAnimal(Animal newAnimal) {
		for (int i = 0; i < animalEnclosures.length; i++) {
			if (animalEnclosures[i] == null) {
				animalEnclosures[i] = newAnimal;
				return;
			}
		}
		System.out.println("Animal Can't Be Added! The Sanctuary is Full!");
		animalEnclosures = addToSanctuary();
		addAnimal(newAnimal);
	}
	
	public boolean isFull() {
		for (int i = 0; i < animalEnclosures.length; i++) {
			if (animalEnclosures[i] == null) {
				return false;
			}
		}
		return true;
	}

	private Animal[] addToSanctuary() {
		Animal[] addToSanctuary = new Animal[animalEnclosures.length * 2];
		System.out.println("New Enclosure Added!");

		for (int i = 0; i < animalEnclosures.length; i++) {
			addToSanctuary[i] = animalEnclosures[i];
		}
		return addToSanctuary;
	}

	// Start Attendant Rounds
	public void startAttendantRounds() {
		Attendant.makeRounds(animalEnclosures);
	}
}
