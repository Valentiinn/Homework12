package com.Karayvansky.HomeWork12;

public class Triangle extends Shape {
	private int a;
	private int b;
	private int c;

	Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getArea() {
		return Math.sqrt(
				(getPerimeter() / 2) * (getPerimeter() / 2 - a) * (getPerimeter() / 2 - b) * (getPerimeter() / 2 - c));
	}

	public double getPerimeter() {
		return a + b + c;
	}

	public void print() {
		System.out.println("The rectangle with a sides " + a + "; " + b + "; " + c);
	}
}
