import java.util.Scanner; //Using Class Scanner:

/**
 * @author James Anthony Ortiz
 * @file   Addition.java
 */
public class Addition
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a Scanner to obtain input from the command window:
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("Sum is %d\n", sum);
		
		
		input.close();
	}// end main

}//end Class Addition.java



/* Output results:
 * Enter first integer: 50
 * Enter second integer: 50
 * Sum is 100
 */


