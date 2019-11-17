package day36;

public class StringToPrimitivesOrObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * From String to Primitives
		 * pareseX method will take String
		 * and return --> primitive value
		 */
		
		String str1 = "True";
		boolean b1 = Boolean.parseBoolean(str1);
		boolean b2 = Boolean.parseBoolean("abc");
		boolean b3 = Boolean.parseBoolean("False");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
		/*
		 * From String to Wrapper Class Object
		 * value of method will take String
		 * and return --> Wrapper class object
		 */
		
		String d="3.14";
		Double d1 = Double.valueOf(d);
		
		System.out.println(d1);
		System.out.println(d1.equals(3.14));
		
		double d2 = d1; //-->auto boxing
		
		
		//invalid conversion
		//System.out.println(Double.parseDouble("3.12abc"));
		//System.out.println(Integer.valueOf("3.12")); //it is double
	}

}
