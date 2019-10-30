//
//Author: James Anthony Ortiz
//File: GuessNumber
//Description: An application that plays "Guess the Number"
//that allows the user to enter a number between 1 and 1000.
//If the user enters the wrong value it will display a prompt
//mentioning that the guess was incorrect. 
//
//
//

import java.util.Random;
import java.util.Scanner;


public class GuessNumber
{

	public static void main(String[] args)
	{
		
		//Create an instance of the Random class
		Random randomNumbers = new Random();
		
		//Create an instance of the Scanner class
		Scanner input= new Scanner(System.in);
		
		//Guessing range is 1 - 1000
		int range = 1 + randomNumbers.nextInt(1000);
		
		int sentinel = 0;
		int guess, decision;
		
		while(sentinel != 1)
		{
			System.out.printf("Please enter a number: ");
			guess = input.nextInt();
			
			if(guess == range)
			{
				System.out.printf("Congratulations! You Won!\n");
				System.out.printf("Would you like to play again? (0 == yes, 1 == no): ");
				decision = input.nextInt();
				
				
				
				
				if(decision == 1)
				{
					System.out.println("Thanks for playing!\n");
					sentinel = 1;
				}
				
				
				
			}
			else if(guess < range)
			{
				System.out.printf("Your guess was too low!\n");
				System.out.printf("Would you like to play again? (0 == yes, 1 == no): ");
				decision = input.nextInt();
				
				if(decision == 1)
				{
					System.out.printf("Thanks for playing!\n");
					sentinel = 1;
				}
				
			}
			else if(guess > range)
			{
				System.out.printf("Your guess was too high!\n");
				System.out.printf("Would you like to try again? (0 == yes, 1 == no): ");
				decision = input.nextInt();
				
				
				if(decision == 1)
				{
					System.out.println("Thanks for playing!\n");
					sentinel = 1;
				}
				
			}

			
		}
		
		input.close();
		

	}//end main

}//class GuessNumber


/*
Please enter a number:50
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:100
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:300
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:370
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:970
Your guess was too high!
Would you like to try again? (0 == yes, 1 == no):  0
Please enter a number:670
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:700
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:0
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:870
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:900
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:950
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:0
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:980
Your guess was too high!
Would you like to try again? (0 == yes, 1 == no): 0
Please enter a number:970
Your guess was too high!
Would you like to try again? (0 == yes, 1 == no): 0
Please enter a number:960
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:965
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:966
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:967
Your guess was too low!
Would you like to play again? (0 == yes, 1 == no): 0
Please enter a number:968
Congratulations! You Won!
Would you like to play again? (0 == yes, 1 == no): 1
Thanks for playing!

*/
