package day7;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//the output expected is ---> I love "Java"
		String name = "I love \"Java\"";
		System.out.println(name);
		
		//the output expected is ---> I love \Java
		String name2 = "I love \\Java";
		System.out.println(name2);
		
		String sentence = "\"Stay Positive\"";
		System.out.println(sentence);
		
		//my name is "Sharif"
		//in order to have quotation inside your string
		//you need to add \ before to tell compiler it's not end of the String
		//but just treat it as normal quotation character 
		// \" will generate " in the output
		// same goes for \ itself ---> \\ will generate \ in output
		
		String name3 = "Sharif";
		
		System.out.println("my name is \"" + name3 + "\"");
		System.out.println(" JAVA IS\n COOL");
		
	}

}
