//Q .Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

// Defines the package name for this class
package com.classdemo;

//Declares the public class named Person
public class Person 
{
	// Declares a string variable to hold the name of the person
    String name;

//Declares an integer variable to hold the age of the person
    int age;

//Constructor for the Person class that takes name and age as parameters
   public Person(String name, int age) 
   {

//Initializes the name variable with the provided name
       this.name = name;

//Initializes the age variable with the provided age
       this.age = age;
   }

//Method to return the name of the person
   public String getName()
   {

// Returns the value of the name variable
       return name;
   }

//Method to return the age of the person
   public int getAge() 
   {

//Returns the value of the age variable
       return age;
   }

//Main method, the entry point of the program
   public static void main(String[] args)
   {
      
//Creates a new Person object with name "Shrutika" and age 20
       Person person1 = new Person("Shrutika", 20);

//Creates a new Person object with name "Manisha" and age 15
       Person person2 = new Person("Manisha", 15);

//Prints the name and age of person1
       System.out.println("Person 1: Name - " + person1.getName() + ", Age - " + person1.getAge());

// Prints the name and age of person2
       System.out.println("Person 2: Name - " + person2.getName() + ", Age - " + person2.getAge());
   
}
}

/*Dry Run

Creating person1:

The constructor Person("Shrutika", 20) is called.
person1's name is set to "Shrutika".
person1's age is set to 20.

Creating person2:

The constructor Person("Manisha", 15) is called.
person2's name is set to "Manisha".
person2's age is set to 15.
Printing person1 details:

System.out.println("Person 1: Name - " + person1.getName() + ", Age - " + person1.getAge()); is executed.
person1.getName() returns "Shrutika".
person1.getAge() returns 20.
The concatenated string "Person 1: Name - Shrutika, Age - 20" is printed to the console.
Printing person2 details:

System.out.println("Person 2: Name - " + person2.getName() + ", Age - " + person2.getAge()); is executed.
person2.getName() returns "Manisha".
person2.getAge() returns 15.
The concatenated string "Person 2: Name - Manisha, Age - 15" is printed to the console.

*/
/*Output
Person 1: Name - Shrutika, Age - 20
Person 2: Name - Manisha, Age - 15
*/


