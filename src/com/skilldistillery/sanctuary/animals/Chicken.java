package com.skilldistillery.sanctuary.animals;

public class Chicken extends Animal {

	// Fields
	private String noise = "Buk Buk Ba-gawk!";

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eatFood(int amountOfFood) {
		makeNoise();
		System.out.println("I love eating " + amountOfFood + " meal worms!");
	}
}