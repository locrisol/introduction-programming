/**
* <h1><b>Guess The Number game<b></h1>
*
* This game displays to the user a menu with predefined options
* for ranges of integers to generate a random number in them, or to create your
* own range.
*
* Once the number is generated, the user has to guess the number.
*
* @author  Leandro Crisol Lo Presti
* @version 1.0
* @since   10/03/2024
*/

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber{
   // global variables declaration
   private static int menu_option = 0;
   private static int random_number;
   private static int user_number;
   private static int numberFrom;
   private static int numberTo;
   private static Scanner keyboard = new Scanner(System.in);

   // main method
   public static void main(String[] args){
      do{
         menuDisplay(); // displays a program menu for the user
	do{
           menu_option = keyboard.nextInt(); // stores the menu option choosen by the user

           if(checkIfInRangeInclusive(menu_option, 0, 7)) //checks if the menu option chosen is between 0 and 7
              menuAction(menu_option); // generates random number following the specified range
           else
              System.out.println("\nSorry, the value has to be a number between 1 to 7 for the given options, or 0 to exit.");
	}while(!checkIfInRangeInclusive(menu_option, 0, 7)); // repeats the menu until the menu option chosen is between 0 and 7

	if(menu_option !=0) // only if the user doesn't wants to exit
	guessTheNumber(); // it asks the user to try to guess the random number generated
      }while(menu_option != 0); // repeates all the program until the user decides to exit
   }

   /**
   * Displays to the user the menu with the different options
   *
   * @param     no param
   * @return    no return
   */
   private static void menuDisplay() {
      System.out.println("----- Please choose one of the following option numbers -----");
      System.out.println("| 1 - Guess a random number between 1 - 10                  |");
      System.out.println("| 2 - Guess a random number between 1 - 20                  |");
      System.out.println("| 3 - Guess a random number between 1 - 30                  |");
      System.out.println("| 4 - Guess a random number between 1 - 40                  |");
      System.out.println("| 5 - Guess a random number between 1 - 50                  |");
      System.out.println("| 6 - Guess a random number between 1 - 60                  |");
      System.out.println("| 7 - Guess a random number in a custom interval            |");
      System.out.println("| 0 - Exit the program                                      |");
      System.out.println("-------------------------------------------------------------");
   }

   /**
   * Assign different values to the range, or to the starting and ending value,
   * that will be used to generate a random number.
   *
   * @param menu_option    stores the option number from the menu the user entered
   * @return               no return
   */
   private static void menuAction(int menu_option){
      switch(menu_option) {
         case 1:
	   numberFrom = 1;
	   numberTo = 10;
	   generateRandomNumberInIntervalInclusive(numberFrom, numberTo);
	   break;
	case 2:
	   numberFrom = 1;
	   numberTo = 20;
	   generateRandomNumberInIntervalInclusive(numberFrom, numberTo);
	   break;
	case 3:
	   numberFrom = 1;
	   numberTo = 30;
	   generateRandomNumberInIntervalInclusive(numberFrom, numberTo);
	   break;
	case 4:
	   numberFrom = 1;
	   numberTo = 40;
	   generateRandomNumberInIntervalInclusive(numberFrom, numberTo);
	   break;
	case 5:
	   numberFrom = 1;
	   numberTo = 50;
	   generateRandomNumberInIntervalInclusive(numberFrom, numberTo);
	   break;
	case 6:
	   numberFrom = 1;
	   numberTo = 60;
	   generateRandomNumberInIntervalInclusive(numberFrom, numberTo);
	   break;
	case 7:
	   customRange(); // launches the code to generate a custom interval
	   generateRandomNumberInIntervalInclusive(numberFrom, numberTo);
	   break;
	case 0:
	   System.out.println("\nThanks for using my program!");
	   break;
	}
   }

   /**
   * Sets the range to generate a random number to a custome one,
   * asking the user to introduce what will be the initial and ending numbers
   * for the range.
   *
   * @param     no params
   * @return    no return
   */
   private static void customRange(){
      System.out.println("\nFrom what number should I start?");
         numberFrom = keyboard.nextInt();
      System.out.println("So, you want to guess a random number from "+numberFrom+". What is the limit number?");
         numberTo = keyboard.nextInt();
      if(numberFrom > numberTo) { // if minimum number is greater than maximum number, then flips the values to avoid errors
	int temp = numberFrom;
	numberFrom = numberTo;
	numberTo = temp;
      }
      generateRandomNumberInIntervalInclusive(numberFrom, numberTo);
   }

   /**
   * Generates a random number based on the interval given by the user.
   *
   * @param numberFrom    minimum number for the interval to generate a random number
   * @param numberTo      maximum number for the interval to generate a random number
   * @return              no return
   */
   private static void generateRandomNumberInIntervalInclusive(int numberFrom, int numberTo){
      random_number = (int)(Math.random() * (numberTo - numberFrom)) + numberFrom; // generates a random number integer in the given range
   }


   /**
   * Method to check if the given number is between the min and max number, both inclusive.
   *
   * @param numberToCheck    the number we want to check if it's contained in the range
   * @param min              initial number for the range
   * @param max              ending number for the range
   * @return                 no return
   */
   private static boolean checkIfInRangeInclusive(int numberToCheck, int min, int max){
      if(numberToCheck <= max && numberToCheck >= min) // checks if the number is between the minimun and maximum parsed
         return true;
      else
         return false;
   }

   /**
   * Launches the process to ask the user to guess the random generated number.
   *
   * @param     no params
   * @return    no return
   */
   private static void guessTheNumber(){
      System.out.println("Time to play! What number do you think I have generated from "+numberFrom+ " to "+numberTo+" (both inclusive)?");
         user_number = keyboard.nextInt();
      try { // try to print dots with a delay of 1 second between them to make it look better
         System.out.print("."); // prints one dot in the same line
         Thread.sleep(1000); // waits one second before printing the next one
         System.out.print("."); // prints one dot in the same line
         Thread.sleep(1000); // waits one second before printing the next one
         System.out.print("."); // prints one dot in the same line
         Thread.sleep(1000); // waits one second before printing the next one
         System.out.print("."); // prints one dot in the same line
         Thread.sleep(1000); // waits one second before resuming the program
      } catch (InterruptedException x) {
         System.out.println("...."); // if there was a problem with sleep it will print all dots at the same time
            x.printStackTrace(); // will print the exception catched, in case there is any during execution
      }
      if(user_number == random_number) // checks if the user guessed the number
         System.out.println("\nAmazing! You are right, the number I have is "+random_number+".\n");
      else
         System.out.println("\nI'm sorry, the number I have is "+random_number+" but your answer is "+user_number+".\n");
      }
}

