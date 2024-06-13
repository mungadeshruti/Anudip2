//Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

package com.oops;//// Defines the package name for the classes.

public class Shape  // Defines the Shape class.
{
	 public double getArea() { // Method to get the area of the shape.
	        return 0.0; // Returns 0.0 as a default area.
	    }
	}

	class Rectangle extends Shape { // Defines the Rectangle class extending Shape.
	    private double length; // Private member variable for the length of the rectangle.
	    private double width; // Private member variable for the width of the rectangle.

	    public Rectangle(double length, double width) { // Constructor for the Rectangle class.
	        this.length = length; // Assigns the length parameter to the instance variable length.
	        this.width = width; // Assigns the width parameter to the instance variable width.
	    }

	    @Override // Indicates that this method overrides the superclass method.
	    public double getArea() { // Method to get the area of the rectangle.
	        return length * width; // Returns the area calculated as length multiplied by width.
	    }
	}

	public class Main { // Main class for program execution.
	    public static void main(String[] args) { // Main method - entry point of the program.
	        Rectangle rectangle = new Rectangle(5.0, 4.0); // Creates an instance of Rectangle with length 5.0 and width 4.0.
	        
	        System.out.println("Area of the rectangle: " + rectangle.getArea()); // Prints the area of the rectangle.
	    }
	}
	/*
	 * DRY RUN *
	 * 
	Input: Rectangle rectangle = new Rectangle(5.0 4.0);

	Output: None

	Input: double area = rectangle.getArea();
	Output: None (but area is calculated as 50)

	Input: System.out.println("Area of the rectangle: " + area);
	Output: Area of the rectangle: 40
	 * 
	 */







