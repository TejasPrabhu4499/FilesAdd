package com.aurionpro.homework;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		public static String toBinaryString(int i) {
		System.out.println("*****Prime Number Identifier*****");
		int i,Count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
	int input = sc.nextInt();
	 for (i = 1; i <= input; i++)
			;
		{
			if (input % i == 0) 
			{
				Count++;
			}
		}
		if (Count == 2)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}