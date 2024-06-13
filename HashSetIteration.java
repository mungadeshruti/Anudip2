/* Write a Java program to iterate through all elements in a hash list.*/
package com.module43;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetIteration
{
	 public static void main(String[] args) 
	    {
	        // Create a HashSet of Strings
	        HashSet<String> hashSet = new HashSet<>();
	        
	        // Add elements to the HashSet
	        hashSet.add("Apple");
	        hashSet.add("Banana");
	        hashSet.add("Orange");
	        hashSet.add("Mango");
	        
	        // Get an iterator over the elements in the HashSet
	        Iterator<String> iterator = hashSet.iterator();
	        
	        // Iterate through the HashSet using the iterator
	        while (iterator.hasNext()) 
	        {
	            // Print each element
	            System.out.println(iterator.next());
	        }
	    }
	}


	/**
	 * 
	 * Dry Run:

	Create an empty HashSet hashSet to store Strings.
	Add the Strings "Apple", "Banana", "Orange", and "Mango" to the hashSet.
	Obtain an iterator for the hashSet using the iterator() method.
	 * 
	 * Output:
	Banana
	Orange
	Apple
	Mango
	 */



