/**Write a Java program to create a producer-consumer scenario using the wait() and notify() methods for thread synchronization.**/
package com.thread;
import java.util.LinkedList;

//ProducerConsumer class to demonstrate producer-consumer problem
class ProducerConsumer {
 private LinkedList<Integer> buffer = new LinkedList<>(); // Shared buffer
 private final int capacity = 5; // Maximum capacity of the buffer

 // Producer method to produce items
 public void produce() throws InterruptedException {
     int value = 0;
     while (true) {
         synchronized (this) {
             // If buffer is full, wait for consumer to consume items
             while (buffer.size() == capacity) {
                 wait();
             }
             System.out.println("Producer produced: " + value);
             buffer.add(value++); // Add item to buffer
             notify(); // Notify consumer that an item is produced
             Thread.sleep(1000); // Simulate some processing time
         }
     }
 }

 // Consumer method to consume items
 public void consume() throws InterruptedException {
     while (true) {
         synchronized (this) {
             // If buffer is empty, wait for producer to produce items
             while (buffer.isEmpty()) {
                 wait();
             }
             int val = buffer.removeFirst(); // Remove item from buffer
             System.out.println("Consumer consumed: " + val);
             notify(); // Notify producer that an item is consumed
             Thread.sleep(1000); // Simulate some processing time
         }
     }
 }
}
public class ProduserConsumerExample 
{
	 public static void main(String[] args) {
	        ProducerConsumer pc = new ProducerConsumer(); // Create an instance of ProducerConsumer

	        // Create producer thread
	        Thread producerThread = new Thread(() -> {
	            try {
	                pc.produce(); // Start producer
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        // Create consumer thread
	        Thread consumerThread = new Thread(() -> {
	            try {
	                pc.consume(); // Start consumer
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        producerThread.start(); // Start producer thread
	        consumerThread.start(); // Start consumer thread
	    }
	}




	/**Dry run 
	 * 
	 * Producer produced: 0
	Consumer consumed: 0
	Producer produced: 1
	Consumer consumed: 1
	Producer produced: 2
	Consumer consumed: 2
	Producer produced: 3
	Consumer consumed: 3
	Producer produced: 4
	Consumer consumed: 4
	Producer produced: 5
	Consumer consumed: 5
	 * 
	 * 
	 * **/


