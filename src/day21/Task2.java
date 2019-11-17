package day21;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task2
		/*
		 * USING FOR LOOP
		 * from 1 to 50
		 * 
		 * 1. print out all the odd numbers
		 * 2. print 
		 * 
		 * 
		 */
	
		//Task 2.1
		for (int i = 1; i < 50; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.print(i + " ");	
			}
		
		for (int i = 1; i <= 50; i++) {
			if(i%2==1)
				System.out.print(i + " ");	
		}
		
//		for (int i = 1; i <= 50; i+=2) {
//			System.out.print(i + " ");	
//		}
		
		System.out.println();
		
		//Task2.2
		int count=0;
		for (int i = 1; i < 50; i++) {
			if(i%4==0) {
			count+=1; //count++;	
			}
			}	
			System.out.println("Count is " + count);
				
			
		for (int i = 0; i <= 50; i+=4) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		
		//Task 2.3
		int sum=0;
		for (int i = 1; i < 50; i++) {
			
			if(i%3==0 && i%5==0) {
				continue;
				}
				System.out.print(i + " ");
				sum+=i;
			
		}
		System.out.println();
		System.out.println();
		
	}

}
