//Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.
package com.oops;

public class AnimalMove 
{
	 void move() {  // Method
	        System.out.println("Animal moves");
	    }
	}

	// Subclass extending Animal
	class Cheetah extends Animal {
	    
	    void move() {  // Overriding the move method
	        System.out.println("Cheetah runs");
	    }
	}

	// Main class
	public class Animal {
	    public static void main(String[] args) {
	        
	        Animal animal = new Animal();   // Create an instance of Animal
	        
	        animal.move();    // Move the animal

	        Cheetah cheetah = new Cheetah();    // Create an instance of Cheetah
	        
	        cheetah.move();   // Move the cheetah
	    }

	    void move() {  // Method in Animal class
	        // Intentionally left empty
	    }
	}



	/*
	 * DRY RUN *
	 
	Input: Animal animal = new Animal();

	Output: None
	Input: animal.move();

	Output: None
	Input: Cheetah cheetah = new Cheetah();

	Output: None
	Input: cheetah.move();

	Output: Cheetah runs


	*/


