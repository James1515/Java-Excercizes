import java.util.Scanner;

/**
 * @author James Anthony Ortiz
 * @file	Multiples.java
 *
 */
public class Multiples {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		//Receive input from user:
		
		System.out.print("Enter first number: ");
		
		x = input.nextInt();
		
		System.out.print("Enter second number: ");
		y = input.nextInt();
		
		//Check to see if number is a multiple of another number:
		
		if(x % y == 0)
			System.out.printf("%d is a multiple of %d", x , y);
		else
			System.out.printf("%d is not a multiple of %d", x, y);
		
		input.close(); //closes input
		
	}//end main

}//end class Multiples




/*
 * Trial
	Enter first number: 5
	Enter second number: 3
	5 is not a multiple of 3
	-------------------------
	Enter first number: 12
	Enter second number: 4
	12 is a multiple of 4
 */