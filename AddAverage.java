//6)Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

    // Declaring the package name
    package com.demo;

    //Importing the Scanner class to read input from the user
    import java.util.Scanner;

    //Declaring the class AddAverage
    public class AddAverage
    {

	 // Main method - entry point of the program
	public static void main(String[] args) 
	{

	  // Declaring and initializing variables
	int i,n=0,s=0;
	double avg;
	{

	      // Printing a message to prompt the user to input 5 numbers
	System.out.println("Input the 5 numbers:");
	}

	   // Loop to read 5 numbers from the user
	for(i=0;i<5;i++)
	{

	  // Creating a Scanner object to take input from the user
	Scanner in=new Scanner(System.in);

	   // Reading the integer input from the user and storing it in variable n
	n=in.nextInt();
	s+=n;
	}
	avg=s/5;

	        
	        // Printing the sum and average of the 5 numbers
	System.out.println("The sum of 5 no is:"+s+"\nThe Average is:"+avg);
	}
	}

	/*dry run
	Initialization:

	int i, n = 0, s = 0;
	double avg;
	Prompt:

	The program prints: Input the 5 numbers:
	Loop Execution:

	The for loop iterates from i = 0 to i < 5 (i.e., 5 times).

	First Iteration (i = 0):

	User inputs: 4
	n = 4
	s = s + n = 0 + 4 = 4
	Second Iteration (i = 1):

	User inputs: 5
	n = 5
	s = s + n = 4 + 5 = 9
	Third Iteration (i = 2):

	User inputs: 6
	n = 6
	s = s + n = 9 + 6 = 15
	Fourth Iteration (i = 3):

	User inputs: 7
	n = 7
	s = s + n = 15 + 7 = 22
	Fifth Iteration (i = 4):

	User inputs: 8
	n = 8
	s = s + n = 22 + 8 = 30
	Close Scanner:

	in.close(); (Scanner object is closed to free up resources)
	Calculate Average:

	avg = s / 5.0 = 30 / 5.0 = 6.0
	Output:

	The program prints: The sum of 5 numbers is: 30
	The program prints: The Average is: 6.0
	/*
	Output
	Input the 5 numbers:
	5
	6
	7
	8
	9
	The sum of 5 no is:35
	The Average is:7.0
*/



