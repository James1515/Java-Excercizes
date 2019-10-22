//Author: James Anthony Ortiz
//File: Account.java
//Description: Accrount class with a constructor to validate and
//initialize instance variable balance of type double.
//

public class Account 
{
	//Variables:
	private double balance;
	
	//constructor:
	public Account(double initialBalance)
	{
		//Validate that initialBalance is grater than 0.0,
		//if it isn't balance is intialized at 0.0.
		if(initialBalance > 0.0)
		{
			balance = initialBalance;
		}
	}//end Account constructor
	
	//credit (add) an amount to the account:
	public void credit(double amount)
	{
		//Increment balance by amount.
		balance = balance + amount;
	}//end method credit
	
	//Obtain (return) the balance 
	public double getBalance()
	{
		return balance;
	}//end method getBalance()
	
}//end class Account
