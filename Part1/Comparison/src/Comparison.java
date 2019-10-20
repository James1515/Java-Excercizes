
/**
 * @author James Anthony Ortiz
 * @file   Comparison.java
 */

import java.util.Scanner;

public class Comparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create Scanner to obtain input from command line:
		Scanner input  = new Scanner(System.in);
		
		int number1;
		int	number2;
		
		System.out.print("Enter first integer: ");
		
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		
		number2 = input.nextInt();
		
		if(number1 == number2)
			System.out.printf("%d == %d\n", number1, number2);
		if(number1 != number2)
			System.out.printf("%d != %d\n", number1, number2);
		if(number1 < number2)
			System.out.printf("%d < %d\n", number1, number2);
		if(number1 > number2)
			System.out.printf("%d > %d\n", number1, number2);
		if(number1 <= number2)
			System.out.printf("%d <= %d\n", number1, number2);
		if(number1 >= number2)
			System.out.printf("%d >= %d\n", number1, number2);
		
		input.close();
		
	}// end main

}//end class Comparison



/*Trials
Enter first integer: 777
Enter second integer: 777
777 == 777
777 <= 777
777 >= 777

Enter first integer: 1000
Enter second integer: 2000
1000 != 2000
1000 < 2000
1000 <= 2000

Enter first integer: 2000
Enter second integer: 1000
2000 != 1000
2000 > 1000
2000 >= 1000
 */
