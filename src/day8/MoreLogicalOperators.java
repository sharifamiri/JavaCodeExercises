package day8;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Logical AND operator && &
			//as long as one operand is False whole thing will be false
			//only WHEN both operands are true then whole thing will be true
		//Logical OR operator ||
			//as long as one operand is TRUE whole thing will be TRUE
			//only WHEN both operands are FALSE then whole thing will be FALSE
		//Logical NOT operator !
		
		//difference between single & | and double && || is
			//&& will only evaluate first part if the whole result can be decided
				//just using the first boolean
	       // & will check for both side whether it can be already decided using 
        		// boolean value 
		  //  || will evaluate both side whether it can be already decided using 
				// boolean value
          //  | will check for both side whether it can be already decided using 
				// boolean value 
		
		//Logical XOR ^  boolean ^ boolean2
			//This will be true only when exactly one operand is true
			//true^true --> false
			//true ^ false --> true
			//false ^ true --> true
			//false ^ false --> false
		
	    System.out.println("result of (true && true)  " +  (true && true)  );
	    System.out.println("result of (false && true) " +  (false && true)  );
	    System.out.println("result of (true && false) " +  (true && false)  );
	    System.out.println("result of (false && false) " +  (false && false)  );
	    
	    System.out.println("result of (true || true)  " +  (true || true)  );
	    System.out.println("result of (false || true) " +  (false || true)  );
	    System.out.println("result of (true | false) " +  (true | false)  );
	    System.out.println("result of (false || false) " +  (false || false)  );
	    
	    System.out.println("result of !true " + (!true) );
	    System.out.println("result of !false " + (!false) );
		
		
	}

}
