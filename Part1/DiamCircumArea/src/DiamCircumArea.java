import java.util.Scanner;


/**
 * @author James Anthony Ortiz	
 * @file	DiamCircimArea.java
 * @Description This program calculates the diameter 
 * the circumference and the area with a given radius.
 */
public class DiamCircumArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int radius;
		
		System.out.print("Please enter the radius (r): ");
		
		radius = input.nextInt();
		
		//Calculate diameter
		System.out.printf("Diameter is %d\n", (radius*2));
		
		//Calculate circumference
		System.out.printf("Circumference is %f\n", 2*3.14159*radius);
		
		
		//Calculate area
		System.out.printf("Area is %f\n", 3.14159*radius*radius);
		
		input.close(); //close input

	}//end main

}//end DiamCircumArea


/* Trial:
Please enter the radius (r): 3
Diameter is 6
Circumference is 18.849540
Area is 28.274310

Please enter the radius (r): 5
Diameter is 10
Circumference is 31.415900
Area is 78.539750

 */