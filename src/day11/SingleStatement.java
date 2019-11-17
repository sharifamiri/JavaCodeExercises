package day11;

public class SingleStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;
		
//		if (x != 100)
//			System.out.println("Not a 100");
//		else 
//			System.out.println("Yes 100");
		
		
		if (x > 100)
			System.out.println("More than 100");
			System.out.println("Something else");
		
			// &&, &  ||, |   !
			
			System.out.println(true || false);
			System.out.println(true && false);
			System.out.println(! false);
			
			//x=100
//			if(x>100 && ++x<200){   //x not more than 100 --> FALSE
//				System.out.println("both are true");
			
			if(x==100 || ++x<200){   //
				System.out.println("both are true");
			}
			
			if(x==100 | ++x<200){   //
				System.out.println("both are true");
				
			System.out.println(x);
		
	}

}
}
