package com.skilldistillery.sanctuary.attendant;

public class Attendant {

	// Fields
	


	// Constructors
	
	// Methods
	public static void makeRounds(Animal[] animals) {
	 System.out.println("Feeding Time!");
	}

	for(int i = 0; i < animals.length; i++) {
		if(animals[i] != null) {
			int amountOfFood = (int) (Math.random() * 10) + 0;
 System.out.println("I need to feed " + animals.length + " " + amountOfFood + "foods.")
 
 animals[i].eat(amountOfFood);
 return;
		}
		else {
			System.out.println("There is no animal here to feed.");
		}
	}
 // toString Last
	

	}

	// Display
	

	}
}