/**
* <h1><b>Calculate loans payments<b></h1>
*
* This program lets the user enter the interest rate, number of years,
* and loan amount, and computes monthly payments and total payment.
*
* author  Leandro Crisol Lo Presti
* version 1.0
* since   18/02/2024
*/

import java.util.Scanner;
public class LoanCalculator {
	public static void main (String args[]){
		double interest_rate;
		int years;
		double loan_amount;
		double monthly_payment;
		double loan_repayment;
		double loan_left;
		int payment_number;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the total amount of the loan:");
			loan_amount = keyboard.nextDouble(); // reads the total amount for the loan

		System.out.println("For how many years the repayments will be extended?");
			years = keyboard.nextInt(); // reads the numbers of years for the repayments

		System.out.println("What is the interest rate for this loan?");
			interest_rate = keyboard.nextDouble() / 12; // reads the interest rate

		monthly_payment = (loan_amount * interest_rate) / (1 - (1 / Math.pow(1 + interest_rate, years*12))); // implements the given formula for the monthly payments
		loan_repayment = monthly_payment * years * 12; // calculates how much is the total repayment for the loan, multiplying the monthly repayment by the number of total months

		System.out.println("Please check below payment plan with the information provided:\n");
		payment_number = 1; // tracks the number of payments needed to complete the repayment
		loan_left = loan_amount; // keeps the total loan amount into a new variable to not modify the original value
		/*
		* This loop will print in a table format all the monthly payments needed to pay the total amount for the loan.
		* It will only stop printing only when there is nothing left to be paid.
		*/
		do{
			if(loan_repayment != 0) // only prints a new monthly payment if there is something left to pay
				System.out.printf("Payment Number %05d | Quantity: %.2f\n", payment_number, monthly_payment);
			loan_repayment = loan_repayment - monthly_payment; // reduces the total left to pay by one monthly payment
			payment_number++; // increments by 1 the payment number
		}while(loan_repayment > 0); // keeps the loop running until there is nothing left to pay

		System.out.printf("Total payment is = %.02f\n\n", (monthly_payment * years * 12));
	}
}
