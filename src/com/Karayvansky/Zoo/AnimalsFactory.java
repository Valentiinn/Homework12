package com.Karayvansky.Zoo;

public class AnimalsFactory {

	public Animals makeAnimal(String type) {
		Animals animal;
		switch (type) {
		case "cat":
			animal = new Cat("cat", "Marsik", "grey", 5);
			break;
		case "dog":
			animal = new Dog("dog", "Busya", "white", 2);
			break;
		case "parrot":
			animal = new Parrot("parrot", "Kesha", "red", 3);
			break;
		case "bear":
			animal = new Bear("bear", "Misha", "black", 10);
			break;
		default:
			animal = null;
		}
		return animal;
	}
}
