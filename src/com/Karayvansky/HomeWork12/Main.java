package com.Karayvansky.HomeWork12;

public class Main {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Square(7);
		shapes[1] = new Circle(6);
		shapes[2] = new Triangle(12, 12, 44);
		shapes[3] = new Rectangle(3, 5);
		shapes[0].print();
		System.out.println(shapes[0].getArea());
		System.out.println(shapes[0].getPerimeter());
		shapes[1].print();
		shapes[2].print();
		shapes[3].print();
	}

}
