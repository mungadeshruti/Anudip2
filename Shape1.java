/**Write a Java program to create a base class Shape with methods draw() and calculateArea(). 
 * Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each 
 * subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.**/

package com.inheritance;

//Shape abstract class represents a generic shape
public abstract class Shape1
{
	// Abstract method to draw a shape
    public abstract void draw();

    // Abstract method to calculate the area of a shape
    public abstract double calculateArea();
}

// Circle class extends Shape and represents a circle shape
class Circle extends Shape1 {
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden method to draw a circle
   
    public void draw() {
        System.out.println("Drawing Circle");
    }

    // Overridden method to calculate the area of a circle
   
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Square class extends Shape and represents a square shape
class Square extends Shape1 {
    private double side;

    // Constructor to initialize the side of the square
    public Square(double side) {
        this.side = side;
    }

    // Overridden method to draw a square
   
    public void draw() {
        System.out.println("Drawing Square");
    }

    // Overridden method to calculate the area of a square
    
    public double calculateArea() {
        return side * side;
    }
}

// Triangle class extends Shape and represents a triangle shape
class Triangle extends Shape1 {
    private double base;
    private double height;

    // Constructor to initialize the base and height of the triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overridden method to draw a triangle
    
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    // Overridden method to calculate the area of a triangle
    
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class to test different shapes and their areas
public class Shape1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 6);

        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}


/**DRY RUN  
 * 
 * Drawing Circle
Area of Circle: 78.53981633974483
Drawing Square
Area of Square: 16.0
Drawing Triangle
Area of Triangle: 9.0

 * 
 * 
 * **/


