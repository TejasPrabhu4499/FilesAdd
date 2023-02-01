package com.aurionpro.model;

public class Rectangle {

	private int height;
	private int width;
	private Color color;

	public Rectangle(int width, int height,Color color) {
		this.width = width;
		this.height = height;
		this.color=color;
	}

	public Rectangle(int width,int height) {
		this.width = 10;
		this.height = 20;
		this.color=color.green;
	}
	public Rectangle() {
		this.width=10;
		this.height=20;
		color=Color.green;
	}
    public Color getcolor()
    {
    return color;
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
