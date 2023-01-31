package com.aurionpro.model;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(20, 40);
		printRectangleDetails(rectangle);

		Rectangle rectangle2 = new Rectangle(40, 70);
		printRectangleDetails(rectangle2);

	}

	private static void printRectangleDetails(Rectangle rectangle) {
		System.out.println("Height :" + rectangle.getHeight());
		System.out.println("Width :" + rectangle.getWidth());
	}

}
