package com.aurionpro.homework;

import java.util.Scanner;

public class FirstProblem {

	public static void main(String[] args) {
		int i,fact=1;
		System.out.println("*****Factorial Finder*****");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int input = sc.nextInt();
		for(i=1;i<=input;i++){
			fact=fact*i;
		}
			System.out.println("Factorial of the Given Number is:"+fact);
		}
}