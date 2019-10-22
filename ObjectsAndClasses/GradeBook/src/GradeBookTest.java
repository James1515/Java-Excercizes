//======================================================
// Author: James Anthony Ortiz
// File: GradeBookTest.java
// Description: Test client for GradeBook class.
//======================================================

public class GradeBookTest 
{

	public static void main(String[] args)
	{
		
		//Create an instance of two GradeBooks:
		GradeBook gradebook1 = new GradeBook ("CS101 Introduction to Java Programming");
		GradeBook gradebook2 = new GradeBook("CS102 Data Structures in Java");
		
		// Display initial value of courseName for each GradeBook:
		System.out.printf("gradebook1 course name is: %s\n", gradebook1.getCourseName());
		
		System.out.printf("gradebook2 course name is: %s\n", gradebook2.getCourseName());
		
		

	}//end main

}//end GradeBookTest client
