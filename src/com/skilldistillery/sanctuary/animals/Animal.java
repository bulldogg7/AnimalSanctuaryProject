package com.skilldistillery.sanctuary.animals;

public class Animal {

	// Fields
	private String animalName;

	// Getters & Setters
	public String getName() {
		return animalName;
	}
	public void setName(String animalName) {
		this.animalName = animalName;
	}
	
	// Methods
	public void makeNoise() { 
	}
	
	public void eatFood(int amountOfFood) {
		System.out.println("I'm eating " + amountOfFood + "foods!");
	}
}