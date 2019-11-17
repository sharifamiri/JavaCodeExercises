package day9;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String username = "cyberla";
		String password = "cybertek";
		
		
		System.out.println("Enter username");
		username = s.next();
		System.out.println("Enter password");
		password = s.next();
		
		boolean userExists = username.equals("cyberla");
		boolean passwordCorrect = password.equals("cybertek");
		
		//if(username.equals("cyberla") && password.equals("cybertek")) {
		if (userExists && passwordCorrect){
		//if (userExists==true && passwordCorrect==true){
		//if(!true) --> Always false...never use
		    System.out.println("login successful");
		}else {
			System.out.println("login failed");
		}
		if(username.equals("admin")) {
			System.out.println("whatever password should work");
		}
	
		s.close(); //it closes the 
	}

}
