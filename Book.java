//* Q. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection. *

// Defines the package name for this class
package com.classdemo;
//import the scaaner class
import java.util.Scanner;

public class Book 
{
	 String title; // Member variable to store the title of the book.
	    String author; // Member variable to store the author of the book.
	    String isbn; // Member variable to store the ISBN of the book.

	    
	    public Book(String title, String author, String isbn) {  // Constructor to initialize title, author, and isbn.
	        this.title = title; // Assigns the title parameter to the instance variable title.
	        this.author = author; // Assigns the author parameter to the instance variable author.
	        this.isbn = isbn; // Assigns the isbn parameter to the instance variable isbn.
	    }

	    
	    public String getTitle() {     // Getter method to retrieve the title of the book.
	        return title; // Returns the value of title.
	    }

	    public String getAuthor() {    // Getter method to retrieve the author of the book.
	        return author; // Returns the value of author.
	    }

	    public String getIsbn() {    // Getter method to retrieve the ISBN of the book.
	        return isbn; // Returns the value of isbn.
	    }

	    
	    public static void addBook(Book[] collection, Book book, int index) {       // Method to add a book to the collection.
	        collection[index] = book; // Adds the book to the specified index of the collection array.
	        System.out.println("Book added: " + book.getTitle()); // Prints a message indicating that the book was added.
	    }

	    public static void removeBook(Book[] collection, String isbn, int index) {     // Method to remove a book from the collection.
	        for (int i = 0; i < index; i++) { // Iterates through the collection array.
	            if (collection[i].getIsbn().equals(isbn)) { // Checks if the ISBN of the current book matches the specified ISBN.
	                System.out.println("Book removed: " + collection[i].getTitle()); // Prints a message indicating that the book was removed.
	                
	                // Effectively removes the book with the specified ISBN from the collection.
	                for (int j = i; j < index - 1; j++) { // Shifts elements to the left to fill the gap.
	                    collection[j] = collection[j + 1]; // Moves the next book to the current position.
	                }
	                collection[index - 1] = null; // Sets the last element of the array to null to remove the reference.
	                return; // Exits the method after removing the book.
	            }
	        }
	        System.out.println("Book with ISBN " + isbn + " not found."); // Prints a message if the book with the specified ISBN was not found.
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // Creates a Scanner object to read user input.

	        Book[] collection = new Book[10]; // Creates an array to store books with a capacity of 10.
	        int bookCount = 0; // Initializes a variable to track the number of books in the collection.

	        while (true) { // Runs an infinite loop for user interaction.
	            System.out.println("\nMenu:");
	            System.out.println("1. Add a book");
	            System.out.println("2. Remove a book");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt(); // Reads the user's choice from the console.

	            switch (choice) { // Executes different actions based on the user's choice.
	                case 1:
	                    if (bookCount < collection.length) { // Checks if the collection has space to add more books.
	                        scanner.nextLine(); // Consumes the newline character after reading an integer.
	                        System.out.print("Enter book title: ");
	                        String title = scanner.nextLine(); // Reads the title of the book from the console.
	                        System.out.print("Enter author name: ");
	                        String author = scanner.nextLine(); // Reads the author's name from the console.
	                        System.out.print("Enter ISBN: ");
	                        String isbn = scanner.nextLine(); // Reads the ISBN of the book from the console.
	                        addBook(collection, new Book(title, author, isbn), bookCount++); // Adds the new book to the collection.
	                    } else {
	                        System.out.println("The collection is full. Cannot add more books."); // Prints a message if the collection is full.
	                    }
	                    break;
	                case 2:
	                    scanner.nextLine(); // Consumes the newline character after reading an integer.
	                    System.out.print("Enter ISBN of the book to remove: ");
	                    String isbnToRemove = scanner.nextLine(); // Reads the ISBN of the book to remove from the collection.
	                    removeBook(collection, isbnToRemove, bookCount--); // Removes the book with the specified ISBN from the collection.
	                    break;
	                case 3:
	                    System.out.println("Exiting..."); // Prints a message indicating program termination.
	                    scanner.close(); // Closes the Scanner object.
	                    System.exit(0); // Exits the program.
	                default:
	                    System.out.println("Invalid choice. Please enter a number from the menu."); // Prints a message for an invalid choice.
	            }
	        }
	    }
	}



	/*
	Dry Run
	select menu:
	1. Add a book
	2. Remove a book
	3. Exit

	Enter your choice:
	Enter book title: Book1
	Enter author name: Author1
	Enter ISBN: 12345
	*/


