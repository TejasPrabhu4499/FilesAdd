package com.aurionpro.model;

import static java.lang.System.*;
import java.util.*;

public class PigDiceGame {

	public static Scanner scan = new Scanner(in);
	public static Random rand = new Random();

	public static int Score = 0;
	public static int counter = 0;
	public static boolean isGameComplete = false;

	public static void main(String args[]) {
		System.out.println("Welcome to Pig dice game!");
		System.out.println("Game Starts!!!");
		player();
	}

	public static int Roll() {
		int Low = 1;
		int High = 7;
		int Roll = rand.nextInt(High - Low) + Low;
		return Roll;
	}

	public static void player() {

		System.out.println("Do you want to play this Game? (Y/N)");
		String answer = scan.nextLine();
		if (answer.equalsIgnoreCase("N")) {
			System.out.println("Game Over!! Player  Score is :" + counter);
		} else if (answer.equalsIgnoreCase("Y")) {
			boolean isGameOver=false;
			while(!isGameOver) {
				System.out.println("Roll The Dice ? (Y/N)");
				answer = scan.nextLine();
				if (answer.equalsIgnoreCase("N")) {
				 isGameComplete = false;
				 break;
				}
				int Roll = Roll();
				Score += Roll;
				if (Score < 21) {
					if (Roll == 1) {
						System.out.println("Game Over Your Total Score is " + Score);
						isGameOver=true;
						isGameComplete=false;
					}
					System.out.println("You Rolled: "+Roll+"\n Your score is:"+Score);

				}
				else {
					System.out.println("You Rolled: "+Roll+"\n Your score is:"+Score);
					isGameComplete=true;
					break;
				}
			}
			if (isGameComplete) {
				System.out.println("You Won Your Score is :" + Score);
			} else {
				System.out.println("Game Over Your Total Score is " + Score);
			}
		}
	}
}
