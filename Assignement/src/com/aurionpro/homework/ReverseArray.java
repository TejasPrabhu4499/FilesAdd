package com.aurionpro.homework;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int res, i, j = 0;
		System.out.println("****Reversal of Array*****");
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
		int input = sc.nextInt();
		int array[] = new int[input];
		int rev[] = new int[input];
		System.out.println("Enter" +input+ " the Number:");
		for (i = 0; i < input; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Reverse of an array is:");
		for (i = input; i > 0; i--, j++) {
			rev[j] = array[i - 1];
			System.out.println(rev[j]);
		}
		sc.close();
	}
}