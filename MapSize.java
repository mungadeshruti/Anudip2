/*  Write a Java program to count the number of key-value (size) mappings in a map. */

package com.module43;

import java.util.HashMap;
import java.util.Map;
public class MapSize
{
	 public static void main(String[] args) 
	    {
	        // Create a HashMap
	        Map<String, Integer> map = new HashMap<>();
	        
	        // Add key-value pairs to the map
	        map.put("A", 1);
	        map.put("B", 2);
	        map.put("C", 3);
	        
	        // Get the size of the map
	        int size = map.size();
	        
	        // Print the size of the map
	        System.out.println("Size of the map: " + size);
	    }
	}


	/*DRY RUN   
	 * 
	 * 
	 * Size of the map: 3

	 * 
	 * 
	 * 
	 */


