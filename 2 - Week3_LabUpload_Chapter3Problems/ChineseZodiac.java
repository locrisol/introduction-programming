/**
* <h1><b>Chinese Zodiac<b></h1>
*
* This program prints the corresponding animal from the Chinese
*
*
* author  Leandro Crisol Lo Presti
* version 1.0
* since   15/02/2024
*/

import java.util.Scanner;

public class ChineseZodiac {
	public static void main(String[] args){
		int year;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter a year to know what animal it's represented by: ");
			year = keyboard.nextInt();

		year = year % 12; // stores the remainder of diving the year by 12

		switch(year) { // displays one message depending on the number of the year
			case 0: System.out.println("That is the Year of the Monkey"); break;
			case 1: System.out.println("That is the Year of the Rooster"); break;
			case 2: System.out.println("That is the Year of the Dog"); break;
			case 3: System.out.println("That is the Year of the Pig"); break;
			case 4: System.out.println("That is the Year of the Rat"); break;
			case 5: System.out.println("That is the Year of the Ox"); break;
			case 6: System.out.println("That is the Year of the Tiger"); break;
			case 7: System.out.println("That is the Year of the Rabbit"); break;
			case 8: System.out.println("That is the Year of the Dragon"); break;
			case 9: System.out.println("That is the Year of the Snake"); break;
			case 10: System.out.println("That is the Year of the Horse"); break;
			case 11: System.out.println("That is the Year of the Sheep"); break;
		}
	}
}
