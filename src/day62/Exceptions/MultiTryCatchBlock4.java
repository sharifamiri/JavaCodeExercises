package day62.Exceptions;

public class MultiTryCatchBlock4 {

	public static void main(String[] args) {
		
		//StringIndexOutOfBoundsException , ArithmeticException
		
		System.out.println("Beginning");
		
		String str = "ABC";
		int num1 = 10;
		int num2 = 0;
		try {
		System.out.println(str.charAt(1));
		
		System.out.println(num1/num2); //-->NEW ArithmeticException() created
		
		}catch(StringIndexOutOfBoundsException ex1) {
			System.out.println("Does not have this index");
			
		}catch (ArithmeticException ex2) {
			System.out.println("Can't divide by 0");
		}
		System.out.println("END");

	}

}
