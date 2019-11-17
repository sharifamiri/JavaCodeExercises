package day11;

import java.util.Scanner;

public class FizBuzzTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = s.nextInt();
		//you can not leave empty else condition
		//you can at least put original value of name or "" for string
		//String result = (number%5==0 && number%3==0) ? "FIZZBUZZ" : "NOT FIZZBUZZ";
		String result = (number%5==0 && number%3==0) ? "FIZZBUZZ" : (number%3==0) ? "BUZ" : "NOT FIZZBUZZ";
		
		System.out.println(result);
		
	}

}
