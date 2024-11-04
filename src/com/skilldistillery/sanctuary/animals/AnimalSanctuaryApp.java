package com.skilldistillery.sanctuary.animals;

import java.util.Scanner;

public class AnimalSanctuaryApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Fields
		Sanctuary sanctuary = new Sanctuary();
		
		do {
			launchApp();
			int selection1 = input.nextInt();

			if (selection1 == 1) {
				System.out.println();
				System.out.println("The Animal Sanctuary Currently Includes: ");
				sanctuary.listAnimals();
				System.out.println();
				} if (selection1 == 2) {
				System.out.println();
				System.out.println("****************");
				System.out.println("|| 1) Dog     ||");
				System.out.println("|| 2) Cat     ||");
				System.out.println("|| 3) Chicken ||");
				System.out.println("****************");
				System.out.println("Which Animal Would You Like to Add?");
				int animalType = input.nextInt();
				System.out.println();
				System.out.println("Give the Animal a Name: ");
				String animalName = input.next();
				System.out.println();
				System.out.println(animalName + " Has Entered the Sanctuary!");
				System.out.println();
				sanctuary.addAnimal(null);
			}
			if (selection1 == 3) {
				System.out.println();
				System.out.println("It's Feeding Time!");
				// makeRounds
				break;
			}
			if (selection1 == 4) {
				System.out.println();
				System.out.println("Y'all Come Back Now Ya' Hear?!");
				break;
			} if (selection1 > 4) {
				System.out.println();
				System.out.println("Selection Invalid.");
				System.out.println();
			}
		} while (true);
	}
	private static void launchApp() {
		System.out.println("*********************************************");
		System.out.println("|| 1) List All Animals in the Sanctuary    ||");
		System.out.println("|| 2) Add a New Animal to the Sanctuary    ||");
		System.out.println("|| 3) Have the Attendant Feed the Animals  ||");
		System.out.println("|| 4) Exit the Program                     ||");
		System.out.println("*********************************************");
		System.out.println("         What Would You Like To Do?");
	}
}