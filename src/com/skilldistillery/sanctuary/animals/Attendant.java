package com.skilldistillery.sanctuary.animals;

public class Attendant {

	// Methods
	public static void makeRounds(Animal[] sanctuary) {
		for (Animal animal : sanctuary) {
			if (animal != null) {
				System.out.println("Feeding " + animal.getName());
				animal.eatFood((int) ((Math.random() + 1) * 10));
			} else {
				System.out.println("There is No Animal Here to Feed.");
				System.out.println();
			}
		}
		System.out.println("All Animals are Fed! My Rounds are Done!");
	}
}