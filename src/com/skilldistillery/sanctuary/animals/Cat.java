package com.skilldistillery.sanctuary.animals;

public class Cat extends Animal {

	// Fields
	private String noise = "Meow!";

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eatFood(int amountOfFood) {
		makeNoise();
		System.out.println("I love eating " + amountOfFood + " fish sticks!");
	}
}