/*  Write a Java program to find numbers less than 7 in a tree set.*/
package com.module43;
import java.util.TreeSet;
public class TreeSetLessThanSeven
{

    public static void main(String[] args) 
    {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(3);
        
        // Get the subset of elements less than 7
        TreeSet<Integer> result = (TreeSet<Integer>) treeSet.headSet(7);
        
        // Print the numbers less than 7
        System.out.println("Numbers less than 7: " + result);
    }
}


/*DRY RUN  
 * 
 * 
 * Numbers less than 7: [1, 2, 3, 5]

 * 
 * 
 */


