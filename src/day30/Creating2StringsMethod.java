package day30;

public class Creating2StringsMethod {

	public static void main(String[] args) {
		
		// create a method called reportName
		// this method take 2 String parameters as firstName, lastName
		// return nothing
		// in the body --> 
		// print the length of first and lastName with nice message 
		// print the first initial of first and lastName together 
		
		String firstName = "Sharif";
		String lastName = "Amiri";
		
		reportName(firstName, lastName );
		
		//for 2nd method:
		reverseStr(firstName);
		reverseStr("Jova");

	}

	public static void reportName(String firstName, String lastName) {
		
		System.out.println("Your " +firstName + " length is: " +(firstName.length()));
		System.out.println("Your " +lastName + " length is: " +(lastName.length()));
		System.out.println("Your intial is: " + firstName.charAt(0) + lastName.charAt(0));
	}
	
	public static void reverseStr(String firstName) {
		for (int i = firstName.length()-1; i >=0; i--) {
			System.out.print(firstName.charAt(i));
		}
		System.out.println();
	}
}
