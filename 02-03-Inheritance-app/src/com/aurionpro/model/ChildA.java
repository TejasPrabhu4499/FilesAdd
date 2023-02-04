package com.aurionpro.model;

public class ChildA extends Parent{

	public ChildA() {
		super("Hello Child Here ");
	}
	static {
		System.out.println("You are in Child Static Block:");
	}
}