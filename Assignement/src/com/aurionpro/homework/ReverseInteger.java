package com.aurionpro.homework;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int input = sc.nextInt();
		
		while (input>0)
		{
			n=input%10;
			System.out.print(n);
			input=input/10;
		}
	}

}
