/**Write a Java program to compare a given string to the specified character sequence.**/

package com.lab21;

import java.util.Scanner;

public class StringContainSequence 
{
	 public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the string
	        System.out.print("Enter the string: ");     
	        String inputString = scanner.nextLine();

	        // Prompt the user to enter the sequence of characters
	        System.out.print("Enter the sequence of characters : ");   
	        String sequence = scanner.nextLine();

	        // Check if the string contains the specified sequence
	        boolean containsSequence = inputString.contains(sequence);

	        // Print the result
	        if (containsSequence) 
	        {
	            System.out.println("The string contains sequence of characters.");
	        } 
	        else 
	        {
	            System.out.println("The string does not contain sequence of characters.");
	        }
	    }
	}

	/*
	 * 
	 * DRY RUN
	 
	Input:
	Enter the string: Hello
	Enter the sequence of characters : ell

	Output:
	The string contains sequence of characters.
	*/


