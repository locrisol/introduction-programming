/**
* <h1><b>Positive or Negative number checker<b></h1>
*
* This program checks if the number given by the user is
* positive, negative or neutral (0).
*
* @author  Leandro Crisol Lo Presti
* @version 1.0
* @since   10/03/2024
*/

import java.util.Scanner;
public class PositiveOrNegative{
	public static void main(String[] args){
		int number;
		int repeat = 1;
		Scanner keyboard = new Scanner(System.in);

		do{
			System.out.println("Please insert a number to determine if it's positive or negative");
				number = keyboard.nextInt();

			if(number > 0) // checks if the number is positive
				System.out.println(number+" is a positive number.");
			else if(number < 0) // checks if the number is negative
				System.out.println(number+" is a negative number.");
			else // last condition, if number is 0
				System.out.println(number+" is a neutral number, not positive neither negative.");
			do{
				System.out.println("\nDo you want to check another number? Type 0 if not, type 1 if you want to repeat it");
					repeat = keyboard.nextInt(); // user should introduce a 1 or 0 depending if the program has to be repeated
				if(repeat != 0 && repeat != 1) // checks if the user introduced a value of 1 or 0, if not display error
					System.out.println("Sorry, the value has to be a 0 to exit, or a 1 to run the program again.");
			}while(repeat != 0 && repeat != 1); // repeat the loop until the user input is valid to decide if exit or not
		}while(repeat != 0); // repeates all the program until the user decides to exit
	}
}
