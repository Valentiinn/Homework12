package com.Karayvansky.HomeWork12;

public class Rectangle extends Shape {
	private int height;
	private int width;

	Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return height + width;
	}

	public void print() {
		System.out.println("The rectangle with a with a sides" + height + "; and" + width);
	}
}
