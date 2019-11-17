package day18;

public class GiveMeSome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//How do you get the sum of number 
		//starting from one till designed number
		//user input 5 --> 1+2+3+4+5=15;
		
		//sum = 0
		
		int sum = 0;
		//1 + 0 = 1
		//2 + 1 = 3
		//3 + 3 = 6
		//...
		
		int count = 1;
		while(count<=100) {
			sum = sum +count;
			System.out.println("Current sum: " + sum + " count is: " + count);
			
			count++;
		}
		System.out.println(sum);
	}

}
