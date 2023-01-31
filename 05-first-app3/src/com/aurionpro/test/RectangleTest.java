package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		System.out.println(obj.height);
		System.out.println(obj.width);
		System.out.println(obj.Color);
		obj.height = 10;
		obj.width = 15;
		System.out.println(obj.height);
		System.out.println(obj.width);
		System.out.println(obj.Color);
	}
}