
//
//Author: James Anthony Ortiz
//File: Employee.java
//Description: Employee Class. Includes three instance variables
//a firstname (string) a lastname (String) and a monthly salary(double).
//Provide a constructor that initlaizes the three instance variables. 
//Provide a set and get method for each instance variable.
//If the monthly salary is not positive, do not set it's value.
//


public class Employee
{
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String fName, String lName, double s)
	{
		firstName = fName;
		lastName = lName;
		salary = s;
	}//Constructor for Employee Class:
	
	//Getter Methods and Setter Methods:
	
	public String getFirstName()
	{
		
		return firstName;
		
	}
	
	public String getLastName()
	{
		
		return lastName;
		
	}//method getLastName()
	
	public double getSalary()
	{
		return salary;
		
	}//method getSalary()
	
	public void setFirstName(String name)
	{
		
		firstName = name;
	
	}//method setFirstName()
	
	public void setLastName(String name)
	{
		lastName = name;
	}//method setLastName()
	
	public void setSalary(double sal)
	{
		//Check if Salary > 0
		if(salary > 0.0)
		{
			salary = sal;
		}
			
	}// method setSalary()
	
}//class Employee
