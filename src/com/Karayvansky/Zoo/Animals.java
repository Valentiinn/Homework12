package com.Karayvansky.Zoo;

public abstract class Animals {
	private String type;
	private String name;
	private String color;
	private int age;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void makeSomeAnimal() {
		System.out.println(
				"Created animal: " + type 
				+ ". Named " 
				+ name + " with color " 
				+ color + ". " 
				+ age 
				+ " old");
	}

}
