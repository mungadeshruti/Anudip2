/**Write a Java program to get the character at the given index within the string.**/
package com.lab21;
import java.util.Scanner;

public class CharacterAtIndex
{
	 public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
	        System.out.print("Enter a string: ");        
	        String inputString = scanner.nextLine();

	        // Prompt the user to enter the index
	        System.out.print("Enter the index to get the character from: ");     
	        int index = scanner.nextInt();

	        // Check if the index is valid and print the character at that index
	        if (index >= 0 && index < inputString.length())    
	        {
	            char character = inputString.charAt(index);
	            System.out.println("Character at index " + index + " is: " + character);
	        }
	        else 
	        {
	            System.out.println("Invalid index. Please enter an index within string length.");
	        }
	    }
	}

	/*
	 *DRY RUN
	 * 
	 
	Input:
	Enter a string: Hello
	Enter the index to get the character from: 2

	Output:
	Character at index 2 is: l
	*/


