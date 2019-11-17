package day29;

import java.util.Scanner;

public class MethodWithParameter {

	public static void main(String[] args) {
		
		//Arrays.sort(arr);
		holdYourHorse("Anar");
		//holdYourHorse(1234); --> if does not compile if data type not match
		holdYourHorse("David");
		holdYourHorse("Fatma");
		holdYourHorse("Sumeyye");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hold whose horse?");
		String name = scan.next();
		holdYourHorse(name);

	}
									//parameter
	public static void holdYourHorse(String owner) {
		//String owner = "Anar";
		
		System.out.println(owner+ ": hold your horse");
	}

}
