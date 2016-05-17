package com.Karayvansky.Zoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Print the animal: ");
		String input = sc.next();

		AnimalsFactory animalsFactory = new AnimalsFactory();
		Animals animal = animalsFactory.makeAnimal(input);
		animal.makeSomeAnimal();
	}

}
