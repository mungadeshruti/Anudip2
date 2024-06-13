/*Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.  */
package com.thread;
//Class representing a bank account
class BankAccount {
 private double balance; // Balance of the bank account

 // Constructor to initialize the bank account with an initial balance
 public BankAccount(double initialBalance) {
     balance = initialBalance;
 }

 // Method to deposit money into the bank account (synchronized to ensure thread safety)
 public synchronized void deposit(double amount) {
     balance += amount; // Add the deposited amount to the balance
     System.out.println("Deposit: " + amount); // Print the deposit amount
 }

 // Method to withdraw money from the bank account (synchronized to ensure thread safety)
 public synchronized void withdraw(double amount) {
     if (balance >= amount) { // Check if there are sufficient funds for withdrawal
         balance -= amount; // Subtract the withdrawn amount from the balance
         System.out.println("Withdrawal: " + amount); // Print the withdrawal amount
     } else {
         System.out.println("Insufficient funds for withdrawal: " + amount); // Print insufficient funds message
     }
 }

 // Method to get the current balance of the bank account
 public double getBalance() {
     return balance; // Return the current balance
 }
}
public class BankAccountThreads
{
	 public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000); // Create a bank account with an initial balance of 1000

	        // Thread for depositing money into the bank account
	        Thread depositThread = new Thread(() -> {
	            for (int i = 0; i < 5; i++) { // Perform 5 deposit transactions
	                account.deposit(100); // Deposit 100 into the account
	            }
	        });

	        // Thread for withdrawing money from the bank account
	        Thread withdrawThread = new Thread(() -> {
	            for (int i = 0; i < 3; i++) { // Perform 3 withdrawal transactions
	                account.withdraw(200); // Withdraw 200 from the account
	            }
	        });

	        depositThread.start(); // Start the deposit thread
	        withdrawThread.start(); // Start the withdrawal thread
	    }
	}


	/**DRY Run*
	 * 
	 * Deposit: 100
	Deposit: 100
	Deposit: 100
	Deposit: 100
	Deposit: 100
	Withdrawal: 200
	Withdrawal: 200
	Withdrawal: 200

	 * 
	 * 
	 * 
	 * 
	 * **/



