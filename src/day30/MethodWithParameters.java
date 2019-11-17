package day30;

public class MethodWithParameters {

	public static void main(String[] args) {
		
//		String s = "abc";
//		System.out.println(s.substring(1, 3));

		//printTheSum(10,20.9);
		
		printTheSum(10.5, 20.9);
		printTheSum(123.9, 200.1);
		printTheSum(11.33, 44.1);
		
		
	}
	
	public static void printTheSum(double a, double b) {
		double sum = a+b;
		
		System.out.println("The sum: " +sum);
	}

}
