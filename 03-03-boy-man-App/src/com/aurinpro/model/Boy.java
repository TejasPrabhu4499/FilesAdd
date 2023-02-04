package com.aurinpro.model;

public class Boy extends Man {

	
	 	
    public void reads(){
    	System.out.println("Boy is Reading");
    }
	@Override
    public void eats() {
    	System.out.println("Boy is Eating...");
    }
	@Override
	public void plays() {
		System.out.println("Boy is Playing");
	}
	}