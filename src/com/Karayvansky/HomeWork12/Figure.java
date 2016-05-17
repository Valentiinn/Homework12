package com.Karayvansky.HomeWork12;

public abstract class Figure {

	private String typeOfFigure;
	private String color;
	private int area;
	private int perimetr;

	public String getName() {
		return typeOfFigure;
	}

	public void setName(String name) {
		this.typeOfFigure = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPerimetr() {
		return perimetr;
	}

	public void setPerimetr(int perimetr) {
		this.perimetr = perimetr;
	}

	public void makeSomeOfFigure() {
		System.out.println("The type of figure is " + typeOfFigure + " with color " + color + "." + " Area = " + area
				+ "," + " perimetr = " + perimetr);
	}
}
