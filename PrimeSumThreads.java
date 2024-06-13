/*  Write a Java program that calculates the sum of all prime numbers up to a given limit using multiple threads. */

package com.thread;
//Thread class to compute sum of prime numbers up to a specified limit
class PrimeSumThread extends Thread {
 private int limit; // Upper limit for finding prime numbers
 private long primeSum; // Sum of prime numbers up to the limit

 // Constructor to initialize thread with a limit
 public PrimeSumThread(int limit) {
     this.limit = limit;
     this.primeSum = 0; // Initialize sum to 0
 }

 // Method to compute sum of prime numbers up to the limit
 public void run() {
     for (int i = 2; i <= limit; i++) {
         if (isPrime(i)) { // Check if current number is prime
             primeSum += i; // Add prime number to sum
         }
     }
 }

 // Getter method to retrieve the sum of prime numbers
 public long getPrimeSum() {
     return primeSum;
 }

 // Method to check if a number is prime
 private boolean isPrime(int n) {
     if (n <= 1)
         return false;
     for (int i = 2; i <= Math.sqrt(n); i++) {
         if (n % i == 0)
             return false; // Not a prime number
     }
     return true; // Prime number
 }
}


public class PrimeSumThreads 
{
	 public static void main(String[] args) {
	        int limit = 100; // Limit for finding prime numbers
	        PrimeSumThread thread1 = new PrimeSumThread(limit / 2); // Thread 1 finds prime numbers up to limit/2
	        PrimeSumThread thread2 = new PrimeSumThread(limit); // Thread 2 finds prime numbers up to limit

	        thread1.start(); // Start thread 1
	        thread2.start(); // Start thread 2

	        try {
	            thread1.join(); // Wait for thread 1 to complete
	            thread2.join(); // Wait for thread 2 to complete
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Compute total sum of prime numbers found by both threads
	        long totalSum = thread1.getPrimeSum() + thread2.getPrimeSum();
	        System.out.println("Sum of prime numbers up to " + limit + ": " + totalSum);
	    }
	}



	/**
	 * Dry Run
	 * 
	 * Sum of prime numbers up to 100: 1060

	 * 
	 * **/


