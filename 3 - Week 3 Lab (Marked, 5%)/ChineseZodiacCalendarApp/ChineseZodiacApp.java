/**
* <h1><b>Chinese Zodiac App<b></h1>
*
* This program prints the corresponding animal from the Chinese Zodiac.
*
* The user will enter a year to calculate what animal is represented by,
* and also if the program should be repeated giving the option to get information
* about the animals of multiple years without exiting the program each time.
*
* author           Leandro Crisol Lo Presti
* version          1.0
* since            07/03/2024
* module           Introduction to Programming (BSHCE1)
* student_number   23156503
*/

import java.util.Scanner;
public class ChineseZodiacApp {

	private static boolean repeatProgram = true; // shared variable for main method and for method to check if program should be repeated

	public static void main(String[] args){
		int year;
		int repeatYN = '1'; // default value is to repeat the program unless user specifies the oppose

		Scanner keyboard = new Scanner(System.in); // initiliazes a new Scanner
		ChineseZodiac mCZA = new ChineseZodiac(); // initialiazes a new object ChineseZodiac

		do{
			System.out.println("Please enter a year to know what animal it's represented by: ");
				year = keyboard.nextInt();

			mCZA.setYear(year); // sets the year given by the user as the year for the object
			mCZA.computeMyChineseZodiacAnimal(); // calculates what's the animal for the given year

			System.out.println(mCZA.getYear()+" is the year of the "+mCZA.getAnimal());

			shouldProgramBeRepeated(keyboard, repeatYN); // asks the user if the program should be repeated or not
		}while(repeatProgram); // will repeat the program until the user decides to exit
	}

	/**
	* This method determines if the user wants to repeat the program, or exit.
	*
	* @param keyboard   object of the class Scanner to get imput from the user
	* @param repeatYN   default value is "1", meaning program will be repeated unless user gives value 0 to it
	* @return           no return
        */
        
	public static void shouldProgramBeRepeated(Scanner keyboard, int repeatYN){
		do{
			System.out.println("\nDo you want to repeat this program? Type 1 for YES or 0 for NO please:");
				repeatYN = keyboard.nextInt();

			if(repeatYN != 0 && repeatYN != 1) // checks if the user has enter something different than 0 or 1
				System.out.println("\nSorry you have to type only 1 if you want to repet the program, or 0 if you don't want:");
			else if(repeatYN == 0)
				repeatProgram = false; // if the user entered a 0, the program won't be executed again
		}while(repeatYN != 0 && repeatYN != 1); // repeats the question to the user until the input is either a 0 or a 1
	}
}



