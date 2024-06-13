/**Write a Java program to check whether a given string ends with another string.**/
package com.lab21;
import java.util.Scanner;

public class EndsWithExample 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Prompt the user to enter the string to check if it's at the end
        System.out.print("Enter the string to check  it's at the end: ");
        String endString = scanner.nextLine();

        // Check if the main string ends with the specified string
        boolean endsWith = mainString.endsWith(endString);

        // Print the result
        if (endsWith)
        {
            System.out.println("The main string ends with the specified string.");
        } 
        else 
        {
            System.out.println("The main string does not end with the specified string.");
        }
    }
}

/*
 * DRY RUN

Input:
Enter the main string: Hello
Enter the string to check  it's at the end: lo

Output:
The main string ends with the specified string.
*/


