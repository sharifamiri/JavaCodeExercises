package day35;

public class MethodOverloadingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String name = "Java";
	    
	    System.out.println(  name.indexOf("a") );
	    System.out.println(  name.indexOf("a",2) );
	    
	    System.out.println(  name.replace('a', 'B')    );
	    System.out.println(  name.replace("va", "java")    );
	}
	
	

}
