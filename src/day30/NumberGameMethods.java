package day30;

public class NumberGameMethods {

	public static void main(String[] args) {
		
		printTheDoubledNumber(20);
		printAge(21);
		double i =2.1;
		int b = (int) i;
		printAge(b);

	}
	
	public static void printTheDoubledNumber(int num) {
		System.out.println(num*2);
		
	}
	//int num is called method parameters
	public static void printAge(int num1) {
		if(num1>18){
			System.out.println("Adult");
		}else {
			System.out.println("Not adult");
		}
		
		
	}

}
