package com.pu.week3.lab1;

import java.security.SecureRandom;

public class DiceGame {

	static SecureRandom randomNumber = new SecureRandom();
	
	static int rollFourDice() {
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += randomNumber.nextInt(6) + 1;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Dice Game!");
		
		int roll = rollFourDice();
		
		if (roll == 7 || roll == 11 || roll == 15 || roll == 21) {
			System.out.println("YOU WIN! With a roll of " + roll);
			return;
		}
		
		if (roll == 10 || roll == 12 || roll == 19 || roll == 20 || roll == 22 || roll == 23 || roll == 24) {
			System.out.println("YOU LOSE! You rolled a " + roll);
			return;
		}
		
		if (roll == 13) {
			System.out.println("YOU LOSE! You rolled the unlucky 13");
			return;
		}
		

		
		while (true) {
			
			int newRoll = rollFourDice();
			System.out.println("You rolled " + newRoll);
			
			if (newRoll == 7 || newRoll == 11 || newRoll == 15 || newRoll == 21) {
				System.out.println("You rolled a winning number! CONGRATULATIONS!");
				break;
			}
			
			else if (newRoll == 10 || newRoll == 12 || newRoll == 19 || newRoll == 20 || newRoll == 22 || newRoll == 23 || newRoll == 24) {
				System.out.println("You rolled a losing number! Better lick next time!");
				break;
			}
			else if (newRoll == 13) {
				System.out.println("You rolled an unlucky 13! Try again next time!");
				break;
			}
			else {
				System.out.println("Roll again");
			}
		}
	}
}
