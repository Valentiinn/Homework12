package com.Karayvansky.HomeWork12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Print the name of the figure: ");
		String input = sc.next();

		FigureFactory figureFactory = new FigureFactory();
		Figure figure = figureFactory.makeFigure(input);

		figure.makeSomeOfFigure();
	}
}