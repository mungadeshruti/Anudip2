package com.demo;
import java.util.ArrayList;
import java.util.List;

// Interface defining common methods for all types of accounts
interface Account {
    void deposit(double amount);        // Method to deposit money
    void withdraw(double amount);       // Method to withdraw money
    double calculateInterest();         // Method to calculate interest
    double viewBalance();               // Method to view account balance
}

// Class representing a savings account, implementing the Account interface
class SavingsAccount implements Account {
    private double balance;             // Balance of the account
    private double interestRate;        // Interest rate for the account

    // Constructor to initialize balance and interest rate
    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method to calculate interest for the account
    public double calculateInterest() {
        return balance * interestRate;
    }

    // Method to view the current balance of the account
    public double viewBalance() {
        return balance;
    }

    // Method to apply interest to the account balance
    public void applyInterest() {
        balance += calculateInterest();
    }
}

// Class representing a current account, also implementing the Account interface
class CurrentAccount implements Account {
    private double balance;             // Balance of the account
    private double overdraftLimit;      // Overdraft limit for the account

    // Constructor to initialize balance and overdraft limit
    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Exceeds overdraft limit");
        }
    }

    // Current accounts usually don't have interest, so this method returns 0
    public double calculateInterest() {
        return 0;
    }

    // Method to view the current balance of the account
    public double viewBalance() {
        return balance;
    }

    // Method to set the overdraft limit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

// Class representing a bank, managing multiple accounts
class Bank {
    private List<Account> accounts;     // List to store all accounts

    // Constructor to initialize the list of accounts
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to add an account to the bank
    public void addAccount(Account account) {
        accounts.add(account);
    }
}

// Main class to demonstrate the banking system
public class BankMain
{
	 public static void main(String[] args) {
	        Bank bank = new Bank();     // Create a bank object

	        // Create a savings account with initial balance and interest rate
	        SavingsAccount savingsAccount = new SavingsAccount(5000, 0.07);
	        // Create a current account with initial balance and overdraft limit
	        CurrentAccount currentAccount = new CurrentAccount(900, 400);

	        // Add the accounts to the bank
	        bank.addAccount(savingsAccount);
	        bank.addAccount(currentAccount);

	        // Deposit money into the accounts
	        savingsAccount.deposit(300);
	        currentAccount.deposit(200);

	        // Apply interest to the savings account
	        savingsAccount.applyInterest();

	        // Print the balances of both accounts
	        System.out.println("Savings Account Balance: " + savingsAccount.viewBalance());
	        System.out.println("Current Account Balance: " + currentAccount.viewBalance());

	        // Withdraw money from the accounts
	        savingsAccount.withdraw(1200);
	        currentAccount.withdraw(800);

	        // Print the updated balances of both accounts
	        System.out.println("Savings Account Balance: " + savingsAccount.viewBalance());
	        System.out.println("Current Account Balance: " + currentAccount.viewBalance());
	    }
	}


	/***
	 * DRY RUN 
	 * 

	A SavingsAccount object savingsAccount is created with a balance of 5000 and an interest rate of 0.07.
	A CurrentAccount object currentAccount is created with a balance of 900 and an overdraft limit of 400.

	Deposits:

	savingsAccount.deposit(300);: 300 is deposited into the savings account.
	currentAccount.deposit(200);: 200 is deposited into the current account.
	Interest Calculation and Application:

	savingsAccount.applyInterest();: Interest is calculated and applied to the savings account balance.
	Printing Balances:

	System.out.println("Savings Account Balance: " + savingsAccount.viewBalance());: Prints the balance of the savings account.
	System.out.println("Current Account Balance: " + currentAccount.viewBalance());: Prints the balance of the current account.

	Withdrawals:

	savingsAccount.withdraw(1200);: Attempts to withdraw 1200 from the savings account.
	currentAccount.withdraw(800);: Attempts to withdraw 800 from the current account.

	Final Balance Printing:

	System.out.println("Savings Account Balance: " + savingsAccount.viewBalance());: Prints the updated balance of the savings account after withdrawal.
	System.out.println("Current Account Balance: " + currentAccount.viewBalance());: Prints the updated balance of the current account after withdrawal.
	 * 
	 * O/P 
	 * Savings Account Balance: 5300.0
	Current Account Balance: 1100.0
	Savings Account Balance: 4100.0
	Current Account Balance: 300.0
	 * 
	 * *
	 */



