/**Write a Java program to compare a given string to the specified character sequence.**/
package com.lab21;
import java.util.Scanner;

public class CompareStringToSequence
{
	 public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the string
	        System.out.print("Enter the string: ");         
	        String inputString = scanner.nextLine();

	        // Prompt the user to enter the character sequence
	        System.out.print("Enter the character sequence to compare: ");    
	        String sequence = scanner.nextLine();

	        // Compare the string to the character sequence
	        boolean isEqual = inputString.equals(sequence);

	        // Print the result
	        if (isEqual) 
	        {
	            System.out.println("The string is equal to character sequence.");
	        } 
	        else 
	        {
	            System.out.println("The string is not equal to character sequence.");
	        }
	    }
	}



	/*
	 * DRY RUN
	 * 

	Input:
	Enter the string: Hello
	Enter the character sequence to compare: Hello

	Output:
	The string is equal to character sequence.
	*/


