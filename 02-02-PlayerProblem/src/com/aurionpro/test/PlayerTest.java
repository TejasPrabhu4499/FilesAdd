package com.aurionpro.test;

import com.aurionpro.model.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player players[] = { new Player("Tejas", 23, "India"), new Player("Rishabh", 24, "India"),
				new Player("Sankalp", 22, "India"), new Player("Akshay", 21, "India") };
		for (Player x : players)
			System.out.println(x);

		System.out.println();
		System.out.println("Eldest Player is:"+Player.getElderPlayer(players));

		
	}
}