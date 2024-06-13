//Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
package com.oops;

public class AnimalSound//Class created animal Sound
{
	 void makeSound() { // Method to make sound
	        System.out.println("Animal makes a sound");
	    }
	}

	// Subclass extending Animal
	class Cat extends Animal {
	    void makeSound() { // Overriding the makeSound method
	        System.out.println("Cat Meow");
	    }
	}

	public class AnimalSound {
	    public static void main(String[] args) {
	        A2 a = new A2(); // Create an instance of A2
	        a.makeSound(); // Call makeSound on A2 instance

	        AnimalSound as = new AnimalSound(); // Create an instance of AnimalSound
	        as.makeSound("cat Meow"); // Call makeSound with a string argument

	        Cat cat = new Cat(); // Create an instance of Cat
	        cat.makeSound(); // Call makeSound on Cat instance
	    }

	    private void makeSound(String string) { // Private method to make sound
	        // Method intentionally left empty
	    }
	}

	/*
	 * DRY RUN *

	Input: A2 a = new A2();

	Output: None
	Input: a.makeSound();

	Output: Animal makes a sound
	Input: AnimalSound as = new AnimalSound();

	Output: None
	Input: as.makeSound("cat Meow");

	Output: None
	Input: cat.makeSound();

	Output: Cat Meow


	*/


