package book;

//import scanner class to define the location
import java.util.Scanner;

public class Scannerintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a Scanner object
		Scanner userInput = new Scanner(System.in);
		
		//ask user questions
		System.out.println("Enter your name please: ");

		//store user input
		//next() method will read one word
		
		//String name = userInput.next();
		
		//next () method will read one whole line
		String name = userInput.nextLine();
		
		//print what user input
		System.out.println("You have entered: " + name);
		
		
	}

}
