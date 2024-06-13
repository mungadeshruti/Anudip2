/**Write a Java program to create a String object with a character array.**/
package com.lab21;

public class StringForCharArray 
{
	 public static void main(String[] args)
	    {
	        char[] charArray =  { 'A', 'N', 'U', 'D', 'I', 'P', ',', ' ', 
	            'F', 'O', 'U', 'N', 'D', 'A', 'T', 'I', 'O', 'N' 
	        };  // Character array


	        // Create String object from Character Array
	        String str = new String(charArray);    

	        // Print the String object
	        System.out.println("String created from character array: " + str);
	    }
	}

	/**
	 * DRY RUN
	 * 
	Output:
	String created from character array: Anudip Foundation
	*/



	 'A', 'N', 'U', 'D', 'I', 'P', ',', ' ', 
	            'F', 'O', 'U', 'N', 'D','A', 'T', 'I', 'O', 'N' 
	        };
}

