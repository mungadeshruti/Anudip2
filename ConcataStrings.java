/**Write a Java program to test if a given string contains the specified sequence of char values.**/
package com.lab21;
import java.util.Scanner;

public class ConcataStrings 
{
	 public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the first string
	        System.out.print("Enter the first string: ");     
	        String firstString = scanner.nextLine();

	        // Prompt the user to enter the string to concatenate
	        System.out.print("Enter the string to concatenate: ");     
	        String secondString = scanner.nextLine();

	        // Concatenate the strings
	        String concatenatedString = firstString.concat(secondString);   

	        // Print the concatenated string
	        System.out.println("Concatenated string: " + concatenatedString);
	    }
	}

	/*
	 * DRY RUN
	 
	Input:
	Enter the first string: Hello
	Enter the string to concatenate: World

	Output:
	Concatenated string: HelloWorld
	*/



