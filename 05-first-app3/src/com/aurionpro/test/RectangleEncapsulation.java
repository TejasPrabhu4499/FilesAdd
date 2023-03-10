package com.aurionpro.test;

public class RectangleEncapsulation {

	private int height;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = getCorrectedValues(height);
	}

	private int getCorrectedValues(int height2) {
		if (height2 < 1) {
			return 1;
		}
		if (height2 > 100) {
			return 100;
		}
		return height2;
	}

	private String color;

	private String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = getcolorCorrectedValue(color);
	}

	private String getcolorCorrectedValue(String color2) {	
		if(color2.equalsIgnoreCase("blue") || color2.equalsIgnoreCase("green")){
			return color2.toLowerCase();
		}
		return "red";
	}
}