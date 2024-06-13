/**Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
 * Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate 
 * the area and perimeter of each shape.**/
package com.demo;
//Abstract class representing a shape
abstract class Shape {
// Abstract method to calculate the area of the shape
abstract double calculateArea();

// Abstract method to calculate the perimeter of the shape
abstract double calculatePerimeter();
}

//Concrete class representing a circle
class Circle extends Shape {
private double radius; // Radius of the circle

// Constructor to initialize the radius of the circle
public Circle(double radius) {
   this.radius = radius;
}

// Method to calculate the area of the circle
@Override
double calculateArea() {
   return Math.PI * radius * radius; // Area = π * r^2
}

// Method to calculate the perimeter of the circle
@Override
double calculatePerimeter() {
   return 2 * Math.PI * radius; // Perimeter = 2 * π * r
}
}

//Concrete class representing a triangle
class Triangle extends Shape {
private double side1, side2, side3; // Lengths of the sides of the triangle

// Constructor to initialize the lengths of the sides of the triangle
public Triangle(double side1, double side2, double side3) {
   this.side1 = side1;
   this.side2 = side2;
   this.side3 = side3;
}

// Method to calculate the area of the triangle using Heron's formula
@Override
double calculateArea() {
   double s = (side1 + side2 + side3) / 2; // Semi-perimeter
   return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Area = √(s * (s - side1) * (s - side2) * (s - side3))
}

// Method to calculate the perimeter of the triangle
@Override
double calculatePerimeter() {
   return side1 + side2 + side3; // Perimeter = sum of all sides
}
}

//Main class to test the Shape, Circle, and Triangle classes
public class main4
{
	public static void main(String[] args) {
	     // Create a Circle object with radius 5
	     Circle circle = new Circle(5);
	     System.out.println("Area of Circle: " + circle.calculateArea()); // Print the area of the circle
	     System.out.println("Perimeter of Circle: " + circle.calculatePerimeter()); // Print the perimeter of the circle

	     System.out.println(); // Print an empty line for readability

	     // Create a Triangle object with side lengths 3, 4, and 5
	     Triangle triangle = new Triangle(3, 4, 5);
	     System.out.println("Area of Triangle: " + triangle.calculateArea()); // Print the area of the triangle
	     System.out.println("Perimeter of Triangle: " + triangle.calculatePerimeter()); // Print the perimeter of the triangle
	 }
	}


	/**
	 * DRY RUN 
	 * 
	 * Area of Circle: 78.53981633974483
	Perimeter of Circle: 31.41592653589793

	Area of Triangle: 6.0
	Perimeter of Triangle: 12.0

	 *
	 */

}
