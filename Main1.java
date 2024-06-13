/** Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). 
 * Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop
 *  the engines for each vehicle type.**/

package com.demo;
//Abstract class representing a vehicle
abstract class Vehicle {
 // Abstract method to start the engine, to be implemented by subclasses
 abstract void startEngine();
 
 // Abstract method to stop the engine, to be implemented by subclasses
 abstract void stopEngine();
}

//Concrete class representing a Car, extending Vehicle
class Car extends Vehicle {
 // Implementation of starting the engine for a car
 
 void startEngine() {
     System.out.println("Car engine started.");
 }

 // Implementation of stopping the engine for a car

 void stopEngine() {
     System.out.println("Car engine stopped.");
 }
}

//Concrete class representing a Motorcycle, extending Vehicle
class Motorcycle extends Vehicle {
 // Implementation of starting the engine for a motorcycle
 
 void startEngine() {
     System.out.println("Motorcycle engine started.");
 }

 // Implementation of stopping the engine for a motorcycle

 void stopEngine() {
     System.out.println("Motorcycle engine stopped.");
 }
}

//Main class to demonstrate vehicle functionalities
public class Main1 
{
	public static void main(String[] args) {
        Car car = new Car(); // Create a Car object
        car.startEngine();   // Start the car engine
        car.stopEngine();    // Stop the car engine

        System.out.println(); // Print an empty line for clarity

        Motorcycle motorcycle = new Motorcycle(); // Create a Motorcycle object
        motorcycle.startEngine();  // Start the motorcycle engine
        motorcycle.stopEngine();   // Stop the motorcycle engine
    }
}


/***
 * 
 * DRY RUN
 * 
 * Car engine started.
   Car engine stopped.

Motorcycle engine started.
Motorcycle engine stopped.

 * 
 * 
 * 
 * 
 */





