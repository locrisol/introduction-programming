/*
*   <h1><b>Rock, Paper, Scissors game<b></h1>
*
*   Program that allows the user to play versus the computer
*	to Rock, Paper, Scissors, and displays the result.
*
* @author           Leandro Crisol Lo Presti
* @version          1.0
* @since            10/03/2024
* @module           Introduction to Programming (BSHCE1)
* @student_number   23156503
*/

import java.util.Scanner;

public class RockPaperScissors_Scanner{
	public static void main(String[] args){
		int menuOption;
		int result;
		String userOption = "";
		String computerOption = "";
		String options[] = new String[]{"Rock", "Paper", "Scissors"};
		Scanner keyboard = new Scanner(System.in);

		do{
			computerOption = generateComputerRandomOption(options); // random pick for computer
			userOption = pickUserOption(options, keyboard); // user picks Rock, Paper or Scissors

			result = computeWinner(userOption, computerOption, options); // Result gets stored

			displayResult(result, userOption, computerOption); // Display result
		}while(repeatProgram(keyboard)); // repeat until user decides to exit
	}

	/**
	* Assign a random option for the computer from Rock, Paper or Scissor.
	*
	* @param  options[]                     String array with the 3 options for the game
	* @return options[computerOption]       Returns de specific option from the array for the computer
	*/
	private static String generateComputerRandomOption(String[] options){
		int computerOption = (int)(Math.random()*(3-1)) + 1; // range between 1 and 3 (without +1 would be from 0 to 2).
		return options[computerOption];
	}

	/**
	* Assign the option chosen for the user from Rock, Paper or Scissor.
	*
	* @param  options[]                     String array with the 3 options for the game
	* @param  keyboard                      Scanner object to read input from user
	* @return options[userOption-1]       	Returns the specific option of the user from the array
	*/
	private static String pickUserOption(String[] options, Scanner keyboard){
		int userOption;

		do{
			System.out.println("Please pick one of the following options, inserting the option number:");
			System.out.println("1 - Rock");
			System.out.println("2 - Paper");
			System.out.println("3 - Scissors");
			System.out.println("The computer has already chosen an option!!");
			userOption = keyboard.nextInt();

			if(!checkIfInRangeInclusive(userOption, 1, 3)) // checks if the option is an existing option
				System.out.println("Sorry, you have to choose an option from 1, 2 or 3.");
		}while(!checkIfInRangeInclusive(userOption, 1, 3)); // repeats until the option is an existing option

		return options[userOption-1];
	}

	/**
	* Determines if a given number is in the desired range.
	*
	* @param  number      number we want to check if it's in range
	* @param  min         minimum value for the range
	* @param  max         maximum value for the range
	* @return inRange     boolean value, true if is in range, false if is not in range
	*/
	private static boolean checkIfInRangeInclusive(int number, int min, int max){
		boolean inRange = false;

		if(number >= min && number <= max) // if the given number is between the minimun and maximum specified
			inRange = true;
		return inRange;
	}

	/**
	* Determines if the user or the computer wins the game.
	*
	* @param  userOption                The option for the user from Rock, Paper, Scissors
	* @param  computerOption            The option for the computer from Rock, Paper, Scissors
	* @param  options[]                 The array with the 3 options for the game
	* @return userWins       			0 if user loses, 1 if user wins, 2 if it's a draw
	*/
	private static int computeWinner(String userOption, String computerOption, String[] options){
		int userWins = 2;

		if(userOption.equalsIgnoreCase(options[0])){ // if USER has Rock
			if(computerOption.equalsIgnoreCase(options[1])) // if computer has Paper
				userWins = 0; // user lose
			else if(computerOption.equalsIgnoreCase(options[2])) // if computer has Scissors
				userWins = 1; // user wins
			else if(computerOption.equalsIgnoreCase(userOption)) // if user and computer both have Rock
				userWins = 2; // draw
		}
		else if(userOption.equalsIgnoreCase(options[1])){ // if USER has Paper
			if(computerOption.equalsIgnoreCase(options[0])) // if computer has Rock
				userWins = 1; // user wins
			else if(computerOption.equalsIgnoreCase(options[2])) // if computer has Scissors
				userWins = 0; // user loses
			else if(computerOption.equalsIgnoreCase(userOption)) // if user and computer both have Paper
				userWins = 2;// draw
		}
		else if(userOption.equalsIgnoreCase(options[2])){ // if USER has Scissors
			if(computerOption.equalsIgnoreCase(options[0])) // if computer has Rock
				userWins = 0; // user loses
			else if(computerOption.equalsIgnoreCase(options[1])) // if computer has Paper
				userWins = 1; // user wins
			else if(computerOption.equalsIgnoreCase(userOption)) // if user and computer both have Scissors
				userWins = 2; // draw
		}
		return userWins;
	}

	/**
	* Determines if the user or the computer wins the game.
	*
	* @param  result                0 if user loses, 1 if user wins, 2 if it's a draw
	* @param  userOption            The option for the user from Rock, Paper, Scissors
	* @param  computerOption        The option for the computer from Rock, Paper, Scissors
	* @return 						no return
	*/
	private static void displayResult(int result, String userOption, String computerOption){
		System.out.println("You chose "+userOption+", the computer chose "+computerOption+".");
		if(result == 0)
			System.out.println("You lose!");
		else if(result == 1)
			System.out.println("You win!");
		else if(result == 2)
			System.out.println("Both chose the same, it's a draw!");
	}


   /**
   * Determines if the user wants to repeat the program or exit.
   *
   * @param  no params               input year from user to check if it's Leap Year or not.
   * @return userWantsToRepeat       boolean value, true if program has to be repeated, false if not.
   */
	private static boolean repeatProgram(Scanner keyboard){
		boolean userWantsToRepeat = false;
		int userOption;

		do{
			System.out.println("\nDo you want to repeat this program? Type 0 to exit, or 1 to repeat the program.");
				userOption = keyboard.nextInt();
			if(userOption == 1) // if user choosed to repeat the program
				userWantsToRepeat = true;
			else if(userOption == 0) // if user choosed to close the program
				System.out.println("Thanks for using my program!");
			else if(!checkIfInRangeInclusive(userOption, 0, 1)) // checks if the number is not a 0 or a 1
				System.out.println("Sorry, you have to type 0 to exit the program, or 1 to repeat it.\n");
		}while(!checkIfInRangeInclusive(userOption, 0, 1)); // repeats the loop until the user enters a valid option, 1 or 0.
		return userWantsToRepeat;
	}
}
