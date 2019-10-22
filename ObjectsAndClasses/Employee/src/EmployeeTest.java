//Author: James Anthony Ortiz
//File: EmployeeTest.java
//Description: Test client for the Employee Class.
//Date: 10/21/2019

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		//Variables:
		String newFirstName, newLastName;
		double newSalary;
		
		System.out.println("An example of a few employees:");
		Employee emp1 = new Employee("John", "Sullivan", 40000.00);
		Employee emp2 = new Employee("Cindy", "Murphy", 57000.00);
		
		
		System.out.printf("The salary of %s %s is $%.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getSalary());
		System.out.printf("The salary of %s %s is $%.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getSalary());
		
		System.out.println("Now we will try entering information into a class via input: ");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first name: ");
		newFirstName = input.next();
		System.out.print("Please enter the last name: ");
		newLastName = input.next();
		System.out.print("Please enter the salary (annual USD$): ");
		newSalary = input.nextDouble();
		
		Employee emp3 = new Employee(newFirstName, newLastName, newSalary);
		
		System.out.printf("The salary of %s %s is $%.2f\n", emp3.getFirstName(), emp3.getLastName(), emp3.getSalary());
		
		
		//Close Scanner:
		input.close();
		
		
	}//end main

}//end client Class EmployeeTest


/*
 * 
Trial:
An example of a few employees:
The salary of John Sullivan is $40000.00
The salary of Cindy Murphy is $57000.00
Now we will try entering information into a class via input: 
Please enter the first name: James
Please enter the last name: Gilbert
Please enter the salary (annual USD$): 100000.00
The salary of James Gilbert is $100000.00
 * 
 * 
 */
