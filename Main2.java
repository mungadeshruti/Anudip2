/**Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
 *  Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to 
 *  calculate salary and display information for each role.**/
package com.demo;
//Abstract class representing an employee
abstract class Employee {
 protected String name; // Name of the employee
 protected int employeeId; // Employee ID

 // Constructor to initialize name and employeeId
 public Employee(String name, int employeeId) {
     this.name = name; // Initialize the name
     this.employeeId = employeeId; // Initialize the employee ID
 }

 // Abstract method to calculate the salary of an employee
 abstract double calculateSalary();

 // Abstract method to display information of an employee
 abstract void displayInfo();
}

//Concrete class representing a Manager, inheriting from Employee
class Manager extends Employee {
 private double baseSalary; // Base salary of the manager
 private double bonus; // Bonus amount for the manager

 // Constructor to initialize name, employeeId, baseSalary, and bonus
 public Manager(String name, int employeeId, double baseSalary, double bonus) {
     super(name, employeeId); // Call the constructor of the superclass
     this.baseSalary = baseSalary; // Initialize the base salary
     this.bonus = bonus; // Initialize the bonus amount
 }

 // Method to calculate the total salary of the manager
 double calculateSalary() {
     return baseSalary + bonus; // Calculate total salary by adding base salary and bonus
 }

 // Method to display information of the manager
 void displayInfo() {
     System.out.println("Manager Name: " + name); // Display the name of the manager
     System.out.println("Employee ID: " + employeeId); // Display the employee ID
     System.out.println("Salary: " + calculateSalary()); // Display the total salary
 }
}

//Concrete class representing a Programmer, inheriting from Employee
class Programmer extends Employee {
 private double hourlyRate; // Hourly rate of the programmer
 private int hoursWorked; // Total hours worked by the programmer

 // Constructor to initialize name, employeeId, hourlyRate, and hoursWorked
 public Programmer(String name, int employeeId, double hourlyRate, int hoursWorked) {
     super(name, employeeId); // Call the constructor of the superclass
     this.hourlyRate = hourlyRate; // Initialize the hourly rate
     this.hoursWorked = hoursWorked; // Initialize the total hours worked
 }

 // Method to calculate the total salary of the programmer
 double calculateSalary() {
     return hourlyRate * hoursWorked; // Calculate total salary by multiplying hourly rate and hours worked
 }

 // Method to display information of the programmer
 void displayInfo() {
     System.out.println("Programmer Name: " + name); // Display the name of the programmer
     System.out.println("Employee ID: " + employeeId); // Display the employee ID
     System.out.println("Salary: " + calculateSalary()); // Display the total salary
 }
}

//Main class to test the Employee, Manager, and Programmer classes
public class Main2 
{
	public static void main(String[] args) {
        // Create a Manager object
        Manager manager = new Manager("kunal kadam", 1001, 5000, 1000);
        manager.displayInfo(); // Display information of the manager

        System.out.println(); // Print an empty line for readability

        // Create a Programmer object
        Programmer programmer = new Programmer("Shri kadam", 1002, 50, 160);
        programmer.displayInfo(); // Display information of the programmer
    }
}

/*****
 * DRY RUN  
 * 
 * A Manager object manager is created with name "kunal kadam", employee ID 1001, base salary 5000, and bonus 1000.
   A Programmer object programmer is created with name "shri kadam", employee ID 1002, hourly rate 50, and hours worked 160.

 * manager.displayInfo():

Calls the displayInfo() method of the manager object.
Prints:
"Manager Name: Kunal kadam"
"Employee ID: 1001"
"Salary: 6000.0" (5000 base salary + 1000 bonus)


programmer.displayInfo():

Calls the displayInfo() method of the programmer object.
Prints:
"Programmer Name: Shri Kadam"
"Employee ID: 1002"
"Salary: 8000.0" (50 hourly rate * 160 hours worked)
 */


