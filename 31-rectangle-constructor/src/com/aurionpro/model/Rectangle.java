package com.aurionpro.model;

public class Rectangle {

	private int height;
	private int width;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
		width = 10;
		height = 20;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height=height;
	}
	public int getHeight()
	{
			return height;
	}
	public int getWidth() 
	{
		return width;
	}
}
