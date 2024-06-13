/**Write a Java program to create a base class Shape with methods draw() and calculateArea(). 
 * Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to 
 * draw the respective shape. In addition, override the calculateArea() method in the Cylinder subclass 
 * to calculate and return the total surface area of the cylinder.**/

package com.inheritance;

//Base class representing a generic shape
public class Shape2 {
	// Method to draw the shape
    public void draw() {
        System.out.println("Drawing generic shape");
    }

    // Method to calculate the area of the shape
    public double calculateArea() {
        return 0; // Default implementation for unknown shape
    }
}

// Subclass representing a circle
class Circle1 extends Shape2 {
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle1(double radius) {
        this.radius = radius;
    }

    // Overridden method to draw the circle
    public void draw() {
        System.out.println("Drawing Circle");
    }

    // Overridden method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass representing a cylinder
class Cylinder extends Circle {
    private double height;

    // Constructor to initialize the radius and height of the cylinder
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Overridden method to draw the cylinder
    public void draw() {
        System.out.println("Drawing Cylinder");
    }

    // Overridden method to calculate the total surface area of the cylinder
    public double calculateArea(int radius) {
        return (2 * Math.PI * radius * height) + (2 * super.calculateArea());
    }
}

// Main class to test the Shape hierarchy
public class Shape2 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(5);
        Cylinder cylinder = new Cylinder(3, 7);

        circle1.draw();
        System.out.println("Area of Circle: " + circle1.calculateArea());

        cylinder.draw();
        System.out.println("Total Surface Area of Cylinder: " + cylinder.calculateArea());
    }
}



/**DRY RUN   
 * 
 * Radius of the circle: 5
Radius and height of the cylinder: 3, 7

Output:
Drawing Circle
Area of Circle: 78.53981633974483
Drawing Cylinder
Total Surface Area of Cylinder: 263.8937829015427
 * **/


