package day21;

public class StringAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//use for loop to print your name char by char
		//and print reverse order char by char 
		//Optionally Save is into another variable
		
		String name = "Sharif";
		String str ="";
//		for (int i = 0; i < name.length(); i++) {
//			str = ""+name.charAt(i);
//			System.out.print(str);
//		}
//		
//		System.out.println();
		
		for (int i = 1; i <= name.length(); i++) {
			//1st Way:
			//str += name.charAt(name.length()-i);
			
			//2nd Way:
			char c = name.charAt(name.length()-i);
			str+=c;
			
		}
		
		System.out.print(str);
		
	}

}
