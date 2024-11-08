package com.skilldistillery.sanctuary.animals;

import java.util.Scanner;

public class AnimalSanctuaryApp {
	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}

	public void launchApp() {
			
		Scanner input = new Scanner(System.in);
		Sanctuary sanctuary = new Sanctuary(5);
		
		boolean exit = false;

		do {
			menuOptions();
			String selection = input.next();
			
			switch(selection) {
			case "1":
				System.out.println();
				System.out.println("The Current Animals in the Sanctuary Are: ");
				sanctuary.listAnimals();
				break;
			case "2":
				if (sanctuary.isFull()) {
					System.out.println("The Sanctuary is Full!");
					break;
				}
				System.out.println();
				System.out.println("****************");
				System.out.println("|| 1) Dog     ||");
				System.out.println("|| 2) Cat     ||");
				System.out.println("|| 3) Chicken ||");
				System.out.println("****************");
				System.out.println("Which Animal Would You Like to Add?");
				String type = input.next();
				
				switch(type) {
				case "1":
					System.out.println("Give the Dog a Name: ");
					String typeName1 = input.next();
					Dog dog = new Dog();
					dog.setName(typeName1);
					sanctuary.addAnimal(dog);
					System.out.println("Your Dog Has Been Added to the Sanctuary!");
					break;
				case "2": 
					System.out.println("Give the Cat a Name: ");
					String typeName2 = input.next();
					Cat cat = new Cat();
					cat.setName(typeName2);
					sanctuary.addAnimal(cat);
					System.out.println("Your Cat Has Been Added to the Sanctuary!");

					break;
				case "3": 
					System.out.println("Give the Chicken a Name: ");
					String typeName3 = input.next();
					Chicken chicken = new Chicken();
					chicken.setName(typeName3);
					sanctuary.addAnimal(chicken);
					System.out.println("Your Chicken Has Been Added to the Sanctuary!");

					break;
				default: System.out.println("Invalid Choice; Try Again");
				}
				break;
				
			case "3": 
				sanctuary.startAttendantRounds();
				break;
			case "4":
				exit = true;
				break;
			default: System.out.println("Invalid Choice; Try Again");

			} 
		}	while (exit == false);
				System.out.println("Y'all Come Back Now Ya' Hear?!");
				input.close();
				
}

	public static void menuOptions() {
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("|| 1) List All Animals in the Sanctuary    ||");
		System.out.println("|| 2) Add a New Animal to the Sanctuary    ||");
		System.out.println("|| 3) Have the Attendant Feed the Animals  ||");
		System.out.println("|| 4) Exit the Program                     ||");
		System.out.println("*********************************************");
		System.out.println("         What Would You Like To Do?");
	}
}