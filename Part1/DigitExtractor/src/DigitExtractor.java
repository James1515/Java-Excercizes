
//===========================================================
// Author: James Anthony Ortiz
// File: DigitExtractor.java
// Description: This program extracts digits from a given 
// 5 digit number through the useage of modulo 10.
//===========================================================

import java.util.Scanner;
public class DigitExtractor {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); //Create an instance of the Scanner class:
		
		//A variable to hold input:
		int x;
		//Prompt:
		System.out.print("Please enter a 5-digit integer: ");
		//Scan input from user
		x = input.nextInt();
		
		int intr1, intr2, intr3, intr4, intr5;
		
		//Extract the nth digit with the formula (int)(K/ 10^(N - 1)) % (modulo) 10
		
		intr5 = (int)(x / Math.pow(10, 0)) % 10;
		
		intr4 = (int)(x / Math.pow(10, 1)) % 10;
		
		intr3 = (int)(x / Math.pow(10, 2)) % 10;
		
		intr2 = (int)(x / Math.pow(10, 3)) % 10;
		
		intr1 = (int)(x / Math.pow(10, 4)) % 10;
	
		//Display the result:
		System.out.printf("The Extracted digits are: %d %d %d %d %d", intr1, intr2, intr3, intr4, intr5);
		input.close(); //Close input
	}//end main

}// class DigitExtractor


/*
 * Demo:
Please enter a 5-digit integer: 12345
The Extracted digits are: 1 2 3 4 5
 * 
 */
