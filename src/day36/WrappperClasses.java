package day36;

public class WrappperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// boolean , char , byte, short , int , long 
	    // float , double
	    
	    /*
	     * Wrapper class --> 
	     * specifically designed to 
	     * store primitive value as object 
	     * 
	     * */
		
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean("false");
		Boolean b2 = Boolean.valueOf(true);
		Boolean b3 = Boolean.valueOf("true");
		
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		Integer i = new Integer(123);
		Integer i1 = new Integer("123");
		Integer i2 = Integer.valueOf(123);
		Integer i3 = Integer.valueOf("123");
		
		System.out.println("Equal?: "+i.equals(123));
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		Character c1 = new Character('c');
		Character c2 = Character.valueOf('c');
		
		System.out.println(c1);
		System.out.println(c2.toString());
		
		
		
		
	
		
	}

}
