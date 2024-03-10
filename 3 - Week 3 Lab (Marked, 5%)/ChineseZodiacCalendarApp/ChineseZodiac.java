/**
* <h1><b>Chinese Zodiac<b></h1>
*
* This class defines the properties of the class Chinese Zodiac,
* which calculates what is the corresponding animal in the Chinese
* Zodiac for a given year.
*
* author           Leandro Crisol Lo Presti
* version          1.0
* since            07/03/2024
* module           Introduction to Programming (BSHCE1)
* student_number   23156503
*/

import java.util.Arrays;

public class ChineseZodiac{
	// variables declaration
	private int year;
	private String chineseZodiacAnimals[] = new String[12];
	private String myChineseZodiacAnimal;

	/**
	* Initializes the current object with default values
	* for the year and the Chinese Zodiac Animal. It also
	* creates a new array to store the 12 animals of the
	* Chinese Zodiac, so the chineseZodiacAnimals array can
	* be initiliazed with a copy of the first one after
	* declaring it as a class variable.
	*
	* @param year    number of total eggs
	* @return        no return
        */
	public ChineseZodiac(){
        	year = 0;
		String copy[] = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
		chineseZodiacAnimals = Arrays.copyOf(copy, 12); // copies the content of the array "copy" into chineseZodiacAnimals
		copy = null; // gets rid of the array "copy" as we only needed it to make a copy of it into the class array variable
		myChineseZodiacAnimal = "";
	}

	/**
	* Set the year the user has entered into the object variable
	*
	* @param year    year to calculate the Chinese Zodiac Animal for
	* @return        no return
        */
	public void setYear(int year){
		this.year = year;
	}

	/**
	* Calculates the corresponding Chinese Zodiac Animal using the given formula "year % 12"
	*
	* @param year    no params
	* @return        no return
        */
	public void computeMyChineseZodiacAnimal(){
		myChineseZodiacAnimal = chineseZodiacAnimals[year % 12];
	}

	/**
	* Returns the name of the animal that represents the year given by the user
	*
	* @param                           no params
	* @return myChineseZodiacAnimal    name of your Chinese Zodiac Animal
        */
	public String getAnimal(){ return myChineseZodiacAnimal; }

	/**
	* Returns the year the user introduced as input
	*
	* @param          no params
	* @return year    the year given by the user, used to calculate the corresponding animal
        */
	public int getYear(){ return year; }
}
