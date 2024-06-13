/**Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). 
 * Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective 
 * methods to handle deposits and withdrawals for each account type.**/

package com.demo;
abstract class BankAccount {
    protected double balance; // Balance of the bank account

    // Constructor to initialize the balance
    public BankAccount(double balance) {
        this.balance = balance; // Initialize the balance
    }

    // Abstract method to deposit money into the account
    abstract void deposit(double amount);

    // Abstract method to withdraw money from the account
    abstract void withdraw(double amount);
}

// Concrete class representing a Savings Account, inheriting from BankAccount
class SavingsAccount1 extends BankAccount {
    private double interestRate; // Interest rate for the savings account

    // Constructor to initialize balance and interest rate
    public SavingsAccount1(double balance, double interestRate) {
        super(balance); // Call the constructor of the superclass
        this.interestRate = interestRate; // Initialize the interest rate
    }

    // Method to deposit money into the savings account
   
    void deposit(double amount) {
        balance += amount; // Increase the balance by the deposited amount
    }

    // Method to withdraw money from the savings account
    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount; // Decrease the balance by the withdrawn amount if sufficient funds are available
        } else {
            System.out.println("Insufficient funds!"); // Print a message if there are insufficient funds
        }
    }

    // Method to add interest to the savings account balance
    public void addInterest() {
        balance += balance * interestRate; // Add interest to the balance
    }
}

// Concrete class representing a Current Account, inheriting from BankAccount
class CurrentAccount1 extends BankAccount {
    private double overdraftLimit; // Overdraft limit for the current account

    // Constructor to initialize balance and overdraft limit
    public CurrentAccount1(double balance, double overdraftLimit) {
        super(balance); // Call the constructor of the superclass
        this.overdraftLimit = overdraftLimit; // Initialize the overdraft limit
    }

    // Method to deposit money into the current account
   
    void deposit(double amount) {
        balance += amount; // Increase the balance by the deposited amount
    }

    // Method to withdraw money from the current account
    
    void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount; // Decrease the balance by the withdrawn amount if within overdraft limit
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit!"); // Print a message if withdrawal exceeds overdraft limit
        }
    }
}

// Main class to test the BankAccount, SavingsAccount1, and CurrentAccount1 classes
public class Main3 
{
	 public static void main(String[] args) {
	        // Create a SavingsAccount1 object
	        SavingsAccount1 savingsAccount = new SavingsAccount1(1000, 0.05);
	        savingsAccount.deposit(500); // Deposit 500 into the savings account
	        System.out.println("Savings Account Balance after deposit: " + savingsAccount.balance); // Display the balance

	        savingsAccount.withdraw(200); // Withdraw 200 from the savings account
	        System.out.println("Savings Account Balance after withdrawal: " + savingsAccount.balance); // Display the balance

	        savingsAccount.addInterest(); // Add interest to the savings account balance
	        System.out.println("Savings Account Balance after interest: " + savingsAccount.balance); // Display the balance

	        System.out.println(); // Print an empty line for readability

	        // Create a CurrentAccount1 object
	        CurrentAccount1 currentAccount = new CurrentAccount1(2000, 1000);
	        currentAccount.deposit(300); // Deposit 300 into the current account
	        System.out.println("Current Account Balance after deposit: " + currentAccount.balance); // Display the balance

	        currentAccount.withdraw(2500); // Withdraw 2500 from the current account
	        System.out.println("Current Account Balance after withdrawal: " + currentAccount.balance); // Display the balance
	    }
	}


	/**
	 * DRY RUN 
	 * 
	 * Savings Account Balance after deposit: 1500.0
	Savings Account Balance after withdrawal: 1300.0
	Savings Account Balance after interest: 1365.0

	Current Account Balance after deposit: 2300.0
	Withdrawal amount exceeds overdraft limit!
	Current Account Balance after withdrawal: 2300.0
	**/



