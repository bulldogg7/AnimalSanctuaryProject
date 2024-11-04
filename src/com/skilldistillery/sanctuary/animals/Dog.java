package com.skilldistillery.sanctuary.animals;

public class Dog extends Animal {

	// Fields
	private String noise = "Woof!";

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eatFood(int amount) {
		makeNoise();
		System.out.println("I love eating " + amountOfFood + "dog biscuits!");
	}
}