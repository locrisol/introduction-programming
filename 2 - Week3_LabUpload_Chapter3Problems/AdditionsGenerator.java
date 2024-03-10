/**
* <h1><b>Additions Generator<b></h1>
*
* The Additions Generator program stores two integers values into two different
* variables and display a message asking the user what is the result of the addition of both.
*
* Then, it checks if the answer given by the user is equal to the actual addition of both
* random generated numbers, displaying a message depending wether the answer was right or not.
*
* author  Leandro Crisol Lo Presti
* version 1.0
* since   15/02/2024
*/

import java.lang.Math;
import java.util.Scanner;

public class AdditionsGenerator {
	public static void main (String[] args){
	int number1 = (int)(Math.random() * 10);  // stores a random number from 0 to 9, forcing it to be integer.
	int number2 = (int)(Math.random() * 10);  // stores a random number from 0 to 9, forcing it to be integer.
	int user_answer;

	Scanner keyboard = new Scanner(System.in);

	System.out.println("What is "+number1+" + "+number2+"?");
	user_answer = keyboard.nextInt(); // stores the answer given by the user to the previous question

	if(number1 + number2 == user_answer) // check if the answer given by the user is true
		System.out.println("That's true! "+number1+" + "+number2+" = "+user_answer);
	else // if the answer given by the user is false
		System.out.println("That's false! "+number1+" + "+number2+" is not equal to "+user_answer+" as the correct answer is "+(number1+number2));
	}
}
