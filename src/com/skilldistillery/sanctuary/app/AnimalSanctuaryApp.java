package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

public class AnimalSanctuaryApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String repeat = "";
		do {
			getMenu();
			int selection = input.nextInt();

			if (selection == 1) {
				System.out.println("The Animal Sanctuary Currently Includes: ");
//					System.out.println(listAnimals);
				break;
			}
			if (selection == 2) {
				System.out.println("****************");
				System.out.println("|| 1) Cow     ||");
				System.out.println("|| 2) Horse   ||");
				System.out.println("|| 3) Pig     ||");
				System.out.println("****************");
				System.out.println("Which Animal Would You Like to Add?");
				int selection2 = input.nextInt();
				System.out.println("Give the Animal a Name: ");
				String animalName = input.next();
				System.out.println(animalName + " Has Entered the Sanctuary!");
				System.out.println();
				getMenu();
				break;
			}
			if (selection == 3) {
				System.out.println("It's Feeding Time!");
				break;
			}
			if (selection == 4) {
				System.out.println("See Ya!");
				break;
			} else {
				System.out.println("Selection Invalid.");
			}
		} while (repeat.equalsIgnoreCase("Yes"));
	}
	public static void getMenu() {
		System.out.println("*********************************************");
		System.out.println("|| 1) List All Animals in the Sanctuary    ||");
		System.out.println("|| 2) Add a New Animal to the Sanctuary    ||");
		System.out.println("|| 3) Have the Attendant Feed the Animals  ||");
		System.out.println("|| 4) Exit the Program                     ||");
		System.out.println("*********************************************");
		System.out.println("         What Would You Like To Do?");
	}
}