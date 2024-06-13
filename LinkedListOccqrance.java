/* Write a Java program to get the first and last occurrence of the specified elements in a linked list. */
package com.lab41;
import java.util.LinkedList;
public class LinkedListOccqrance 
{

    public static void main(String[] args) 
    {
        // Create a LinkedList of Integers
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Add elements to the LinkedList
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        
        // Find the first occurrence of the value 5 in the LinkedList
        int firstIndex = linkedList.indexOf(5);
        
        // Find the last occurrence of the value 5 in the LinkedList
        int lastIndex = linkedList.lastIndexOf(5);
        
        // Print the index of the first occurrence of 5
        System.out.println("First occurrence of 5: " + firstIndex);
        
        // Print the index of the last occurrence of 5
        System.out.println("Last occurrence of 5: " + lastIndex);
    }
}


/*DRY RUN 
 * 
 * 
 * First occurrence of 5: 0
Last occurrence of 5: 5

 * 
 * 
 * */



