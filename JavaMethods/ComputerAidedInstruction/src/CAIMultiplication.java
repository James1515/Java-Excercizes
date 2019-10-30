
//
//Author: James Anthony Ortiz
//File: CAIMultiplication.java
//Description: A program that allows students to learn multiplication 
//useing a random number generator to help functionality.
//


import java.util.Random;
import java.util.Scanner;
public class CAIMultiplication
{

	public static void main(String[] args) 
	{
		Random randomNumber = new Random();
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		int guess;
		int decision;
		
		
		while(counter != -1)
		{
			
			int range1 = 1 + randomNumber.nextInt(10);
			int range2 = 1 + randomNumber.nextInt(10);
			
			System.out.printf("What is %d times %d? ", range1, range2);
			guess = input.nextInt();
			
			//If the user got it right:
			if(guess == range1*range2)
			{
				//Ask if the user wants to play again:
				System.out.printf("Congratualations, you have answered correctly!\n");
				System.out.printf("Would you like to play again (Yes = 0, No = -1): ");
				decision = input.nextInt();
				if(decision == -1)
				{
					System.out.printf("Thanks for playing!\n");
					counter = -1;
				}
			}
			
			
			//If the user got the answer wrong:
			if(guess != range1*range2)
			{
				//Ask if the user wants to play again:
				System.out.printf("Sorry, you got your answer wrong!\n");
				System.out.printf("Would you like to play again (Yes = 0, No = -1): ");
				decision = input.nextInt();
				if(decision == -1)
				{
					System.out.printf("Thanks for playing!");
					counter = -1;
				}
				
			}
			
		}//end while loop:
		
		input.close();

	}//end main

}
