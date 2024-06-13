//Q. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

package com.classdemo;// Defines the package name for this class.

import java.util.Scanner;

public class Reactangle // Defines the Rectangle class.
{
	double width; // Member variable to store the width of the rectangle.
    double height; // Member variable to store the height of the rectangle.

    
    public void Rectangle(double width, double height) {  // Constructor to initialize width and height
        this.width = width;         // Assigns the width parameter to the instance variable width.
        this.height = height;       // Assigns the height parameter to the instance variable height.
    }

   
    public double calculateArea() {    // Method to calculate the area of the rectangle
        return width * height; // Returns the product of width and height.
    }

    
    
    public double calculatePerimeter() {   // Method to calculate the perimeter of the rectangle
        return 2 * (width + height); // Returns twice the sum of width and height.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble(); // Reads the width input from the user.

        System.out.print("Enter height of the rectangle: ");
        double height = sc.nextDouble(); // Reads the height input from the user.

        
        Reactangle rectangle = new  Reactangle();   // Creates a new Rectangle object with the provided width and height.

        
        double area = rectangle.calculateArea(); // Calculates the area of the rectangle.
        System.out.println("Area of the rectangle: " + area);      // Prints the calculated area.

        
        double perimeter = rectangle.calculatePerimeter(); // Calculates the perimeter of the rectangle.
        System.out.println("Perimeter of the rectangle: " + perimeter); // Prints the calculated perimeter.

        
       
    }
}


/*
Dry Run
Enter width of the rectangle: 
5.0
Enter height of the rectangle: 
10.0
Area of the rectangle: 50.0
Perimeter of the rectangle: 30.0
*/



