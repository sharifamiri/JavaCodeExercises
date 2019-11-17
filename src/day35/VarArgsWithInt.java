package day35;

import java.util.Arrays;

public class VarArgsWithInt {

	public static void main(String... name) {
		// TODO Auto-generated method stub
		
	    // java MainClass abc d egf 
	    // this is how it's working behind scence
	    // String[] args = {"abc","d","egf"} ; 
	    // if we dont pass any cmd argument 
	    // String[] args = {} ; 

		System.out.println("I did not come this far just to come this far");
		
		System.out.println(Arrays.toString(name));
		System.out.println(name.length);
	}

}
