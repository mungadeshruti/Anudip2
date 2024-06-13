package com.demo;
//Importing the Scanner class to read input from the use
import java.util.Scanner;

//Declaring the class PositiveN
public class PositiveN
{

//Main method - entry point of the program
public static void main(String[] args) 
{

// Creating a Scanner object to take input from the user
Scanner sc = new Scanner(System.in);


  // Prompting the user to input a number
System.out.print("Input any anumber:");

// Reading the integer input from the user and storing it in variable n
int n = sc.nextInt();

// Checking if the number is greater than or equal to 0
if(n>=0)
{

// If the condition is true, printing that the number is positive
System.out.println(" number is positive");
}
else
{

// If the condition is false, printing that the number is negative
System.out.println(" number is negative"); 
}
}
}

//Output
//Input any anumber:5
/* dry run
* enter the number
* 5
* input=5
* if(5>0)
* the no is positive
* 
* enter the number
* -5
* input=5
* if(5>0)
* the no is positive
* 
* enter the number
* 0
* input=5
* if(5>0)
* the no is positive
* */
