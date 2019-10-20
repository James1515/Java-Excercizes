//
// File: Permuation.java
// Author: James Anthony Ortiz
// Description: Given two strings, write a method to decide if one is a permutation 
// of the other.
//



public class Permutation
{
	
	static String sort(String s)
	{
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
		
	}
	
	static boolean permutation(String s, String t)
	{
		if(s.length() != t.length())
		{
			return false;
		}
	
		return sort(s).equals(sort(t));
			
	}

	public static void main(String[] args)
	{
		// An example:
		
		String s = "god";
		String t = "dog";
		
		if(permutation(s, t) == true)
		{
			System.out.println("This is a permutation!");
		}
		else
		{
			System.out.println("This is not a permutation.");
		}
			
	}

}//end Class Permutation.java
