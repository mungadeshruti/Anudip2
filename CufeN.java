//5 Write a Java program to display the cube of the given number up to an integer.

// Declaring the package name
package com.demo;

//Importing the Scanner class to read input from the user
import java.util.Scanner;

//Declaring the class CufeOfN
public class CufeN 
{
	 // Main method - entry point of the program
	public static void main(String[] args) { 

	 // Creating a Scanner object to take input from the user
	Scanner in =new Scanner(System.in);

	// Print the number 5 to the console
	System.out.println("5");

	// Read an integer input from the user
	int n=in.nextInt();


	 // Loop from 1 to n (this loop has an issue, explained below)
	for(int i=1;i>=n;i++) {

	 // Print the cube of the current value of i
	System.out.println("The cube of "+i+" is ="+i*i*i);
	}
	}
	}
	/*Dry run

	enter the number:
	10
	10*10*10
	cube of the number is:1000
	*/


