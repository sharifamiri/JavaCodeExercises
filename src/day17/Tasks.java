package day17;

public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TASK 2
		//How many iterations do we have? -->6
//		int x =0;
//		while(x<=10) {
//			System.out.println("Happy Birthday! " + x);
//			x+=2;	
		
		
		//2nd Way:
		//How many iterations do we have? -->11
		//You have to stop it otherwise, it will print forever
//			int x =0;
//			while(x<=10) {
//			    if(x%2==0)
//				System.out.println("Happy Birthday! " + x);
//				x++;
//		}		
			
		
//		//Task 3
//		
//			int y =0;
//			while(y<=100) {
//			    if(y>=50 && y<=100 && y%2==1)
//				System.out.println("Number is " + y);
//				y++;
//		}	
				
		//Task 3
		
		int y =100;
		while(y>=50 && y<=100 && y%2==0) {
			System.out.println("Number is " + y);
			y++;
	}	
		
		
	}

}
