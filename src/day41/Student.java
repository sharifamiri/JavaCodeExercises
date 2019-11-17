package day41;

public class Student {

	//Access modifiers 
	/*
	 * public / protected / default / private
	 * 
	 * we can use it for any methods
	 * we can use it for fields
	 */
//	public String name;
//	public int age;
//	public long ssn;
	
	//These are default access modifier
		//accesible in same package
	String name;
	int age;
	long ssn;
	
	public void displayName() {
		System.out.println("Name is: " +name);
	}
	
	//private is only accesible in same class -->Student
	private void displayNameAndAge() {
		System.out.println("Name is: " +name + "| Age is: "+ age);
	}
	private void showSSN() {
		System.out.println("SSN is: " +ssn);
	}
	

}
