// 
//Author: James Anthony Ortiz
//File: AccountTest.java
//Description: Client testing account for Account.java
//Date: 10/21/2019

import java.util.Scanner;

public class AccountTest 
{

	public static void main(String[] args)
	{
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.53);
		
		//Display initial balance of the account:
		System.out.printf("account1 balance: %.2f\n", account1.getBalance());
		System.out.printf("account2 balance: %.2f\n", account2.getBalance());
		
		//Create Scanner to get input from the command window:
		Scanner input = new Scanner(System.in);
		
		double depositAmount;
		
		System.out.print("Enter deposit amount for account1: ");
		depositAmount = input.nextDouble();
		
		System.out.printf("\nadding %.2f to account1 balance: \n\n", depositAmount);
		
		account1.credit(depositAmount);

		//Display balances 
		
		System.out.printf("account1 balance $%.2f\n", account1.getBalance());
		
		System.out.printf("account2 balance $%.2f\n", account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		
		System.out.printf("\nadding %.2f to account2 balance\n\n", depositAmount);
		
		account2.credit(depositAmount);
		
		//Display Balances:
		
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		
		System.out.printf("account2 balance $%.2f\n", account2.getBalance());
		
		
		input.close();
	}//end main

}//end class AccountTest


/*
 * 
 Trial:
account1 balance: 50.00
account2 balance: 0.00
Enter deposit amount for account1: 25.53

adding 25.53 to account1 balance: 

account1 balance $75.53
account2 balance $0.00
Enter deposit amount for account2: 123.45

adding 123.45 to account2 balance

account1 balance: $75.53
account2 balance $123.45
 * 
 */
