 /*Write a Java program to sort a given array list.*/
package com.module43;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSort 
{
	 public static void main(String[] args) 
	    {
	        // Create an ArrayList of Integers
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        
	        // Add elements to the ArrayList
	        arrayList.add(5);
	        arrayList.add(2);
	        arrayList.add(8);
	        arrayList.add(1);
	        arrayList.add(3);
	        
	        // Sort the ArrayList in ascending order
	        Collections.sort(arrayList);
	        
	        // Print the sorted ArrayList
	        System.out.println("Sorted ArrayList: " + arrayList);
	    }
	}
	/*
	Dry Run:

	Initialize an empty ArrayList arrayList.
	Add integers 5, 2, 8, 1, and 3 to the arrayList.
	Sort the elements of the arrayList using Collections.sort() method, which sorts the ArrayList in ascending order.
	Print the sorted ArrayList.

	Output:
	Sorted ArrayList: [1, 2, 3, 5, 8]


	*/


