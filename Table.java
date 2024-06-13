// Declaring the package name
package com.demo;

//Importing the Scanner class to read input from the user
import java.util.Scanner;

//Declaring the class Table
public class Table 
{
	// Main method - entry point of the program
	public static void main(String[] args)
	{

	// Declaring the variable num to store the user input number
	int num;

	  // Prompting the user to enter a number
	System.out.print("Enter any Number");

	    // Creating a Scanner object to take input from the user
	Scanner r=new Scanner(System.in);

	    // Reading the integer input from the user and storing it in variable num
	num=r.nextInt();

	      // Loop to print the multiplication table of the entered number
	for(int i=1; i<=10; i++)
	{

	 // Printing the multiplication result in the format num * i = result
	System.out.println(num+"*"+i+"="+num*i); 
	}
	}
	}
	/*    

	Dry Run


	Initialization
	The program starts, and the main method is invoked.
	Print Header Message:

	Output: Natural Numbers are:
	For Loop Iterations:

	First Iteration (i = 1)

	System.out.println(i); -> Output: 1
	Second Iteration (i = 2)

	System.out.println(i); -> Output: 2
	Third Iteration (i = 3)

	System.out.println(i); -> Output: 3
	Fourth Iteration (i = 4)

	System.out.println(i); -> Output: 4
	Fifth Iteration (i = 5)

	System.out.println(i); -> Output: 5
	Sixth Iteration (i = 6)

	System.out.println(i); -> Output: 6
	Seventh Iteration (i = 7)

	System.out.println(i); -> Output: 7
	Eighth Iteration (i = 8)

	System.out.println(i); -> Output: 8
	Ninth Iteration (i = 9)

	System.out.println(i); -> Output: 9
	Tenth Iteration (i = 10)

	System.out.println(i); -> Output: 10

	*/







