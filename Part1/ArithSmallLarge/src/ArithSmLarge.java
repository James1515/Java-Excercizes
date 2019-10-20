
/**
 * @author James Anthony Ortiz
 * @file   ArithSmLarge.java
 * @Description Receives inputs of three integer values from the user and finds the sum,
 * average, product, smallest and largest value of them all.
 * *
 */

import java.util.Scanner;

public class ArithSmLarge {

	public static void main(String[] args) {
		
		// Create scanner to obtain input from command window
	      Scanner input = new Scanner(System.in);

	      int x; // first number input by user
	      int y; // second number input by user
	      int z; // third number input by user
	      int result; 	//product of numbers
	      int sum; 		//sum of numbers
	      int average;	//avg of numbers
	      
	      //Hold largest, smallest numbers
	      int largest = 0, smallest = 0;
	      
	      
	      System.out.print( "Enter first integer: " ); // prompt for input
	      x = input.nextInt(); // read first integer

	      System.out.print( "Enter second integer: " ); // prompt for input
	      y = input.nextInt(); // read second integer
	      
	      System.out.print( "Enter third integer: " ); // prompt for input
	      z = input.nextInt(); // read third integer

	      result = x * y * z; // calculate product of numbers
	      
	      sum = x + y + z;	//Calculate sum of numbers
	      
	      average = (x + y + z) / 3; //Calculate average of numbers

	      System.out.printf("Product is %d\n", result);
	      System.out.printf("Sum is %d\n", sum);
	      System.out.printf("Average is %d\n", average);
	      
	      //Find smallest value:
	      if(x < y && x < z)
	    	  //X is smallest:
	    	  smallest = x;
	      if(y < x && y < z)
	    	  smallest = y;
	      if(z < x && z < y)
	    	  smallest = z;
	      
	      
	      //Display smallest number:
	      System.out.printf("Smallest number is %d\n", smallest);
	      
	      //Find largest value:
	      if(x > y && x > z)
	    	  largest = x;
	      if(y > x && y > z)
	    	  largest = y;
	      if(z > x && z > y)
	    	  largest = z;
	      
	      //Display largest number:
	      System.out.printf("Largest number is %d\n", largest);

	      //Close input:
	      input.close();
	      
	}// end main

}//end class ArithSmLarge

/* 
 * Trial:
 	Enter first integer: 50
	Enter second integer: 70
	Enter third integer: 100
	Product is 350000
	Sum is 220
	Average is 73
	Smallest number is 50
	Largest number is 100
 */
