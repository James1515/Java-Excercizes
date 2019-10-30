/*
 *Author: James Anthony Ortiz 
 * File: Tabular.java
 * Description: Write a program that displays a tabular output of N multiplied by
 * 1, 10, 100, and 1000.
 * 
 */

public class Tabular {
	public static void main(String[] args) 
	{
	
		int counter = 1;
		
		System.out.print("N  10*N 100*N 1000*N\n");
		
		while (counter <= 5)
		{
			//Display Numbers:
			System.out.printf("%d %5d %5d %5d\n", counter, counter*10, counter*100, counter*1000);	
			//Increment counter:
			counter++;
		}

	}//end main 

}//end class Tabular


/*
Trial:
N  10*N 100*N 1000*N
1    10   100  1000
2    20   200  2000
3    30   300  3000
4    40   400  4000
5    50   500  5000

*/