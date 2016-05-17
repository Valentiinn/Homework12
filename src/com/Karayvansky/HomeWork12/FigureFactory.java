package com.Karayvansky.HomeWork12;

public class FigureFactory {

	public Figure makeFigure(String type) {
		Figure figure;
		switch (type) {
		case "triangle":
			figure = new Triangle("triangle", "green", 25, 50);
			break;
		case "rectangle":
			figure = new Rectangle("tectangle", "black", 15, 40);
			break;
		case "circle":
			figure = new Circle("circle", "yellow", 65, 30);
			break;
		case "square":
			figure = new Square("square", "grey", 55, 70);
			break;
		default:
			figure = null;
		}

		return figure;
	}
}
