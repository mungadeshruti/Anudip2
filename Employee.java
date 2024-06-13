/**Write a Java program to create a class Employee with a method called calculateSalary(). 
 * Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() 
 * method to calculate and return the salary based on their specific roles.**/
package com.inheritance;

//Employee class represents an employee with a name and base salary
public class Employee 
{
	 protected String name;
	    protected double baseSalary;

	    // Constructor to initialize name and baseSalary
	    public Employee(String name, double baseSalary) {
	        this.name = name;
	        this.baseSalary = baseSalary;
	    }

	    // Method to calculate the salary of the employee
	    public double calculateSalary() {
	        return baseSalary;
	    }
	}

	// Manager class extends Employee and represents a manager with a bonus
	class Manager extends Employee {
	    private double bonus;

	    // Constructor to initialize name, baseSalary, and bonus
	    public Manager(String name, double baseSalary, double bonus) {
	        super(name, baseSalary);
	        this.bonus = bonus;
	    }

	    // Overridden method to calculate the salary of the manager including bonus
	    
	    public double calculateSalary() {
	        return baseSalary + bonus;
	    }
	}

	// Programmer class extends Employee and represents a programmer with lines of code and rate per line
	class Programmer extends Employee {
	    private int linesOfCode;
	    private double ratePerLine;

	    // Constructor to initialize name, baseSalary, linesOfCode, and ratePerLine
	    public Programmer(String name, double baseSalary, int linesOfCode, double ratePerLine) {
	        super(name, baseSalary);
	        this.linesOfCode = linesOfCode;
	        this.ratePerLine = ratePerLine;
	    }

	    // Overridden method to calculate the salary of the programmer based on lines of code
	   
	    public double calculateSalary() {
	        return baseSalary + (linesOfCode * ratePerLine);
	    }
	}

	// Main class to test the Employee hierarchy
	public class Employee2 {
	    public static void main(String[] args) {
	        Manager manager = new Manager("John", 50000, 10000);
	        Programmer programmer = new Programmer("Alice", 60000, 1000, 0.1);

	        System.out.println("Manager's salary: $" + manager.calculateSalary());
	        System.out.println("Programmer's salary: $" + programmer.calculateSalary());
	    }
	}



	/**
	 * DRY RUN
	 * 
	 * 
	 * Manager's salary: $60000.0
	 
	Programmer's salary: $61000.0
	**/


