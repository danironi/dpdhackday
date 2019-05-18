import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class MyClass {
  public static void main(String[] args) {
	System.out.println("Enter a letter to start the game");
    Scanner myObj = new Scanner(System.in);
    
    String[] computerchoices = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
    
    String name = myObj.next();
    
    do {
    	
    	System.out.println("Enter your desired gesture");

        // String input
        name = myObj.next();
        
        if(Arrays.asList(computerchoices).contains(name)) {
        	
        	Random random = new Random();
            int index = random.nextInt(computerchoices.length);
            String comp;
            comp = computerchoices[index];
            System.out.println("The computer chose " + comp);
            
            
            if (name.equals("Rock") & comp.equals("Paper")) { 
            	System.out.println("Your choice is" + name);
            	System.out.println("Computer's choice is" + comp);
            	System.out.println("You win");
            }
            if (name.equals("Rock") & comp.equals("Rock")) {
            	System.out.println("It is draw");
            }
            if (name.equals("Rock") & comp.equals("Scissors")) {
            	System.out.println("You win");
            }
            if (name.equals("Rock") & comp.equals("Lizard")) {
            	System.out.println("You win");
            }
            if (name.equals("Rock") & comp.equals("Spock")) { 
            	System.out.println("You lost");
            }
            if (name.equals("Paper") & comp.equals("Paper")) {
            	System.out.println("It is draw");
            }
            if (name.equals("Paper") & comp.equals("Rock")) {
            	System.out.println("You win");
            }
            if (name.equals("Paper") & comp.equals("Scissors")) {
            	System.out.println("You lost");
            }
            if (name.equals("Paper") & comp.equals("Lizard")) {
            	System.out.println("You lost");
            }
            if (name.equals("Paper") & comp.equals("Spock")) {
            	System.out.println("You win");
            }
            if (name.equals("Scissors") & comp.equals("Paper")) {
            	System.out.println("You win");
            }
            if (name.equals("Scissors") & comp.equals("Rock")) {
            	System.out.println("You lost");
            }
            if (name.equals("Scissors") & comp.equals("Lizard")) {
            	System.out.println("You win");
            }
            if (name.equals("Scissors") & comp.equals("Spock")) {
            	System.out.println("You lost");
            }
            if (name.equals("Scissors") & comp.equals("Scissors")) {
            	System.out.println("It is draw");
            }
            if (name.equals("Lizard") & comp.equals("Rock")) {
            	System.out.println("You lost");
            }
            if (name.equals("Lizard") & comp.equals("Paper")) {
            	System.out.println("You win");
            }
            if (name.equals("Lizard") & comp.equals("Scissors")) {
            	System.out.println("You lost");
            }
            if (name.equals("Lizard") & comp.equals("Lizard")) {
            	System.out.println("It is draw");
            }
            if (name.equals("Lizard") & comp.equals("Spock")) {
            	System.out.println("You win");
            }
            if (name.equals("Spock") & comp.equals("Spock")) {
            	System.out.println("It is draw");
            }
            if (name.equals("Spock") & comp.equals("Paper")) {
            	System.out.println("You lost");
            }
            if (name.equals("Spock") & comp.equals("Rock")) {
            	System.out.println("You win");
            }
            if (name.equals("Spock") & comp.equals("Scissors")) {
            	System.out.println("You win");
            }
            if (name.equals("Spock") & comp.equals("Lizard")) {
            	System.out.println("You lost");
            }
            
            while (name.equals(comp)) {
            	System.out.println("Enter your desired gesture");

                // String input
                name = myObj.next();
                continue;
            }
        }
        
    }
    while (!Arrays.asList(computerchoices).contains(name));
    
  }
}