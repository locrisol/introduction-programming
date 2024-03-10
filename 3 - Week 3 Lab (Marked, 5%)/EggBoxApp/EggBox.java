/**
* <h1><b>EggBox<b></h1>
*
* This class defines the properties of the class EggBox,
* which contains variables to store the number of eggs
* given by the user, and the boxsize, calculating with that
+ information how many full boxe of eggs and how many left over eggs.
*
* author  Leandro Crisol Lo Presti
* version 1.0
* since   18/02/2024
*/

import java.lang.*;

public class EggBox{
	// variables declaration
	private int eggs;
	private int boxSize;
	private int numBoxes;
	private int leftOverEggs;

	/**
	* Initializes the object with default values of zero for everything
	*
	* @param    no params
	* @return   no return
    */
	public EggBox(){
		eggs = 0;
		boxSize = 0;
		numBoxes = 0;
		leftOverEggs = 0;
	}

	/**
	* Set the total amount of eggs into the class variable
	*
	* @param eggs    number of total eggs
	* @return        no return
    */
	public void setEggs(int eggs){
		this.eggs = eggs;
	}

	/**
	* Set the size of the boxes of eggs into the class variable
	*
	* @param boxSize    the size of the boxes that will store the eggs
	* @return           no return
    */
	public void setBoxSize(int boxSize){
		this.boxSize = boxSize;
	}

	/**
	* Calculates the maximum number of full boxes possible
	*
	* @param    no params
	* @return   no return
    */
	public void computeBoxes(){
		numBoxes = (int)Math.floor(eggs / boxSize); // gets the maximum number of egg boxes possible
	}

	/**
	* Calculates the leftover eggs that can't fill a full box
	*
	* @param    no params
	* @return   no return
    */
	public void computeLeftover(){
		leftOverEggs = eggs % boxSize; // gets the remaining eggs than can fill a box
	}

	/**
	* Returns the value of the number of boxes of eggs to the user
	*
	* @param              no params
	* @return numBoxes    number of full boxes of eggs
    */
	public int getBoxes(){ return numBoxes; }

	/**
	* Calculates the leftover eggs that can't fill a full box
	*
	* @param                  no params
	* @return leftOverEggs    number of eggs left over after filling the boxes
    */
	public int getLeftover(){ return leftOverEggs; }
}
