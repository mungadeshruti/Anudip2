//Q. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.
// Defines the package name for this class.
package com.classdemo;// Defines the package name for this class.

public class Circle // Defines the Circle class.
{
	 double radius; // Member variable to store the radius of the circle.

	    // Constructor
	    public Circle(double radius) { // Constructor for the Circle class.
	        this.radius = radius; // Assigns the radius parameter to the instance variable radius.
	    }

	    // Getter for radius
	    public double getRadius() { // Getter method for the radius.
	        return radius; // Returns the value of radius.
	    }

	    // Setter for radius
	    public void setRadius(double radius) { // Setter method for the radius.
	        this.radius = radius; // Sets the instance variable radius to the provided value.
	    }

	    // Method to calculate area
	    public double calculateArea() { // Method to calculate the area of the circle.
	        return Math.PI * radius * radius; // Returns the area of the circle using the formula πr².
	    }

	    // Method to calculate circumference
	    public double calculateCircumference() { // Method to calculate the circumference of the circle.
	        return 2 * Math.PI * radius; // Returns the circumference of the circle using the formula 2πr.
	    }

	    public static void main(String[] args) { // Main method to run the program.
	        Circle circle = new Circle(5); // Creates a new Circle object with radius 5.

	        System.out.println("Radius: " + circle.getRadius()); // Prints the radius of the circle.
	        System.out.println("Area: " + circle.calculateArea()); // Prints the area of the circle.
	        System.out.println("Circumference: " + circle.calculateCircumference()); // Prints the circumference of the circle.
	    }
}
	
	/*Dry run
	Package Declaration:
	package com.classdemo;

	Class Declaration:
	public class Circle

	Member Variable:
	double radius;

	Constructor:
	public Circle(double radius)
	Sets this.radius = radius;

	Getter and Setter Methods:
	public double getRadius()
	Returns radius
	public void setRadius(double radius)
	Sets this.radius = radius;

	Calculation Methods:
	public double calculateArea()
	Returns Math.PI * radius * radius
	public double calculateCircumference()
	Returns 2 * Math.PI * radius

	Main Method Execution:
	Circle circle = new Circle(5);
	Creates a Circle object with radius 5.
	System.out.println("Radius: " + circle.getRadius());

	Prints Radius: 5
	System.out.println("Area: " + circle.calculateArea());
	Prints Area: 78.53981633974483
	System.out.println("Circumference: " + circle.calculateCircumference());
	Prints Circumference: 31.41592653589793
	*/
	/*Output
	Radius: 5
	Area: 78.53981633974483
	Circumference: 31.41592653589793*/




