package com.skilldistillery.sanctuary.animals;

public class Animal extends Sanctuary{

	// Fields
	private String name;

	// Constructors
	public void animalName(String name) {
		this.name = name;
	}

	// Getters & Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void makeNoise(String noise) { 
		System.out.println(noise);
	}

	public void eatFood(int amountOfFood) {
		System.out.println("I'm eating " + amountOfFood + "foods!");
	}
}