// Declaring the package name
package com.demo;

//Declaring the class GreatestN
public class GreatestN 
{
	// Main method - entry point of the program
	public static void main(String[] args) 
	{

	 // Declaring and initializing three integer variables
	int a=10,b=20,c=30; 

	// Checking if a is greater than b
	if(a>b)
	{

	// If a is greater than b, check if a is also greater than c
	if(a>c)

	  // If a is greater than both b and c, print a
	System.out.print(a);
	else

	  // If a is greater than b but less than or equal to c, print c
	System.out.print(c);
	}
	else
	{

	   // If a is not greater than b, check if b is greater than c
	if(b>c)

	  // If b is greater than both a and c, print b
	System.out.print(b); 
	else

	// If b is less than or equal to c, print c
	System.out.print(c);
	}
	}
	
	//* dry run

	//"Enter the 3 numbers"
	//10 20 30
	//a=10
	//b=20
	//c=30
	//10>20 is false
	//10>30 is false
	//Output: greatest number is 30




}
