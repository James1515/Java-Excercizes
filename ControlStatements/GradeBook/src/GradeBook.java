
// Author: James Anthony Ortiz
// File: GradeBook.java
// Date: 10/21/2019
// Description: GradeBook class used to demonstrate the basic useage of a class.

public class GradeBook {

	//Grade course for this GradeBook:
	private String courseName;
	
	public GradeBook(String name)
	{
		courseName = name;
	}//end method GradeBook(String n)
	
	public void setCourseName(String name)
	{
		courseName = name;
	}//end method setCourseName(String n)
	
	public String getCourseName()
	{
		return courseName;
	}//end method getCourseName():
	
	public void displayMessage()
	{
		// this statement calls getCourseName to get the name 
		// of the course that this GradeBook represents:
		System.out.printf("Welcome to the gradebook for \n%s!", courseName);
	}//end method displayMessage():
	
}//end Class GradeBook
