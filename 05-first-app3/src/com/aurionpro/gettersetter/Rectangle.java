package com.aurionpro.gettersetter;

public class Rectangle {

	private int height;
	public void setHeight(int ht)
	{
	if(height>1) {
		this.height=1;
	}
	else if()
	}
	public int getHeight()
	{
		return height;
	}
	correctedValues(int num)
	{
		if (num<1)
		return 1;
		if(num>100)
		return 100;
		return num;
	}
}
