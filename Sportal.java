/**Write a Java program to create a base class Sports with a method called play(). 
 * Create three subclasses: Football, Basketball, and Rugby. Override the play() method 
 * in each subclass to play a specific statement for each sport.**/
package com.inheritance;

//Sports class represents a generic sports activity
public class Sportal 
{
	 // Method to play generic sports
    public void play() {
        System.out.println("Playing generic sports");
    }
}

// Football class extends Sports and represents playing football
class Football extends Sportal {
    // Overridden method to play football
  
    public void play() {
        System.out.println("Playing football");
    }
}

// Basketball class extends Sports and represents playing basketball
class Basketball extends Sportal {
    // Overridden method to play basketball
    
    public void play() {
        System.out.println("Playing basketball");
    }
}

// Rugby class extends Sports and represents playing rugby
class Rugby extends Sportal {
    // Overridden method to play rugby
   
    public void play() {
        System.out.println("Playing rugby");
    }
}

// Main class to test different sports activities
public class Sportal {
    public static void main(String[] args) {
        Sports sports = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        sports.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}


/** DRY RUN   
 * 
 * Playing generic sports
Playing football
Playing basketball
Playing rugby

 * 
 * 
 * **/





