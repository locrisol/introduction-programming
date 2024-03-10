/*
*   <h1><b>Leap Year checker<b></h1>
*
*   Program that takes a year from user and print whether that year is a leap year or not.
*
*   ------------- Leap Year Rules: How to Calculate Leap Years -------------
*
*   In the Gregorian calendar, three criteria must be taken into account to identify leap years:
*		1) The year must be evenly divisible by 4.
*		2) If the year is ALSO evenly divided by 100, is NOT a leap year.
*		3) If the year is ALSO evenly divided by 400, IT IS a leap year.
*   According to these rules, year 2000 and 2400 are leap years, but the years
*   1800, 1900, 2100, 2200, 2300 and 2500 are not leap years
*
* @author           Leandro Crisol Lo Presti
* @version          1.0
* @since            10/03/2024
* @module           Introduction to Programming (BSHCE1)
* @student_number   23156503
*/

import java.util.Scanner;

public class LeapYear{
	// class variable declaration
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args){
		int year;

		do{
			System.out.println("Please enter a year to determine if it's a Leap Year or not.");
				year = keyboard.nextInt();

			if(isLeapYear(year)) // if the year is a Leap Year
				System.out.println("\nThe year "+year+" is a Leap Year.\n");
			else // if the year is NOT a Leap Year
				System.out.println("\nThe year "+year+" is NOT a Leap Year.\n");
		}while(repeatProgram()); // will repeat the loop until the user decides to stop the program
	}

  	/**
  	* Displays to the user a message depending on if the given year is a Leap Year or not.
 	*
  	* @param  year                  input year from user to check if it's Leap Year or not.
  	* @return givenYearIsLeap       boolean value, true if it's a Leap Year, false if it's not.
  	*/
	private static boolean isLeapYear(int year){
		boolean givenYearIsLeap = false; // default condition, as the returned variable has to be initialized
		boolean isNegative = false;

		if(year % 4 == 0) { // if the year is evenly divisible by 4
			if(year % 100 == 0){ // if the year is ALSO evenly divided by 100
				givenYearIsLeap = false;
				if(year % 400 == 0) // if the year is ALSO evenly divided by 400
					givenYearIsLeap = true;
			}
		}
		else // any other condition
			givenYearIsLeap = false;

		return givenYearIsLeap;
	}

 	/**
  	* Determines if the user wants to repeat the program or exit.
 	*
  	* @param  no params               input year from user to check if it's Leap Year or not.
  	* @return userWantsToRepeat       boolean value, true if program has to be repeated, false if not.
   	*/
	private static boolean repeatProgram(){
		boolean userWantsToRepeat = false;
		int userOption;

		do{
			System.out.println("Do you want to repeat this program? Type 0 to exit, or 1 to repeat the program.");
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

	/**
	* Determines if a number is between an interval of min and max number, both inclusive.
	*
	* @param  number        number to be checked if it's included in the range.
	* @param  min           starting number for the range (inclusive).
	* @param  max           ending number for the range (inclusive).
	* @return inRange       boolean value, true if the number it's in the range, false if not.
   	*/
	private static boolean checkIfInRangeInclusive(int number, int min, int max){
		boolean inRange = false;

		if(number >= min && number <= max) // if the given number is between the minimun and maximum specified
			inRange = true;
		return inRange;
	}
}
