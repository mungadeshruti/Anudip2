/**Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). 
 * Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method 
 * in each subclass to impose different withdrawal limits and fees.**/

package com.inheritance;

public class BankAccount12// Base class representing a generic bank account
{
	protected double balance;

    // Constructor to initialize the initial balance of the bank account
    public BankAccount12(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money into the bank account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to withdraw money from the bank account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method to get the balance of the bank account
    public double getBalance() {
        return balance;
    }
}

// Subclass representing a savings account with a withdrawal limit
class SavingsAccount1 extends BankAccount12 {
    private static final double WITHDRAWAL_LIMIT = 500;

    // Constructor to initialize the savings account with an initial balance
    public SavingsAccount1(double initialBalance) {
        super(initialBalance);
    }

    // Overridden method to withdraw money from the savings account
    
    public void withdraw(double amount) {
        if (amount <= balance && amount <= WITHDRAWAL_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Withdrawal limit exceeded or insufficient funds");
        }
    }
}



