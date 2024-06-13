/*Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.*/
package com.thread;
//Thread class to print even numbers
class EvenThread extends Thread {
 // Run method to print even numbers from 2 to 20
 public void run() {
     for (int i = 2; i <= 20; i += 2) {
         System.out.println("Even: " + i);
     }
 }
}

//Thread class to print odd numbers
class OddThread extends Thread {
 // Run method to print odd numbers from 1 to 20
 public void run() {
     for (int i = 1; i <= 20; i += 2) {
         System.out.println("Odd: " + i);
     }
 }
}
public class EvenoddThread 
{
	public static void main(String[] args) {
        EvenThread evenThread = new EvenThread(); // Create an instance of EvenThread
        OddThread oddThread = new OddThread(); // Create an instance of OddThread

        evenThread.start(); // Start the EvenThread
        oddThread.start(); // Start the OddThread
    }
}


/**Dry run
 * 
 * Odd: 1
Even: 2
Odd: 3
Even: 4
Odd: 5
Even: 6
Odd: 7
Even: 8
Odd: 9
Even: 10
Odd: 11
Even: 12
Odd: 13
Even: 14
Odd: 15
Even: 16
Odd: 17
Even: 18
Odd: 19
Even: 20

 * 
 * 
 * 
 * **/



