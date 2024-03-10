/**
* <h1><b>High Five<b></h1>
*
* This program checks if the input integer from the user
* is multiple of 5, in which case prints "HiFive", or if it's
* an even number, where it will print HiEven.
*
* author  Leandro Crisol Lo Presti
* version 1.0
* since   15/02/2024
*/

import java.util.Scanner;

public class HiFive {
	public static void main(String[] args){
		int number;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter an integer number: ");
		number = keyboard.nextInt();

		if(number % 5 == 0) // checks if the number is divisible by 5
			System.out.println("HiFive");
		else if (number % 2 == 0) // checks if the number is even
			System.out.println("HiEven");
		else
			System.out.println("That number is not divisible by 5 and it's not an even.");
	}
}
