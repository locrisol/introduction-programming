/**
* <h1><b>EggBoxApp<b></h1>
*
* This program allows the user to interact and create objects
* of the class EggBox. The user can enter the numbers of eggs,
* and the size of the boxes of eggs, to calculate how many
* full boxes can be filled as maximum, and how many leftover
* eggs would we be left with.
*
* @author           Leandro Crisol Lo Presti
* @version          1.0
* @since            18/02/2024
* @module           Introduction to Programming (BSHCE1)
* @student_number   23156503
*/

import javax.swing.JOptionPane;

public class EggBoxApp{
	public static void main(String[] args){
		// variables declaration
		int eggs;
		int boxSize;
		int numBoxes;
		int leftOverEggs;
		// object initialization
		EggBox egg;
		egg = new EggBox();
		// inputs from user to get the number of eggs, and the size of the boxes
		eggs = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number of eggs"));
		boxSize = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the size of the boxes"));
		// the new number of eggs and the size of the boxes for the object egg
		egg.setEggs(eggs);
		egg.setBoxSize(boxSize);
		// compute in the object egg how many boxes can we get with those eggs, and how many are left over
		egg.computeBoxes();
		egg.computeLeftover();
		// store the number of boxes and the leftover eggs in two different variables
		numBoxes = egg.getBoxes();
		leftOverEggs = egg.getLeftover();
		// output the boxes needed and the leftover eggs to the user
		JOptionPane.showMessageDialog(null,"Number of boxes needed "+numBoxes);
		JOptionPane.showMessageDialog(null,"Number of eggs left over "+leftOverEggs);
	}
}
