//Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car"
package com.oops;

public class Vehicle // Defines the Vehicle class.
{
	  public void drive() { // Method to drive the vehicle.
	        System.out.println("Repairing a vehicle"); // Prints message indicating a generic vehicle is being repaired.
	    }
	}

	class Car extends Vehicle { // Defines the Car class extending Vehicle.
	    @Override
	    public void drive() { // Overrides the drive method for Car.
	        System.out.println("Repairing a car"); // Prints message indicating a car is being repaired.
	    }
	}

	public class Main{ // Main class for program execution.
	    public static void main(String[] args) {
	        
	        Vehicle vehicle = new Vehicle(); // Creates an instance of Vehicle.
	        Car car = new Car(); // Creates an instance of Car.

	        vehicle.drive(); // Calls the drive method of Vehicle.
	        car.drive(); // Calls the overridden drive method of Car.
	    }
	}
	/*
	 * DRY RUN *
	 * 
	Input: Main vehicle = new Main();

	Output: None
	Input: vehicle.drive();

	Output: Driving the vehicle
	Input: Car car = new Car();

	Output: None
	Input: car.drive();

	Output: Repairing a car

	*/



