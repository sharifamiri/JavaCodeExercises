package day15;

public class CharacterToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//char to int
		
		char c1 = 'A';
		
		int cNum = c1; //now converting character to number
		System.out.println(cNum);
		
		
		//Task 2
		
		String first = "Sharif", last = "Amiri";
		
		char first1 = first.charAt(0);
		
		int countLast = last.length();
		char last1 = last.charAt(countLast-1);
		
		
		int firstNum = first1;
		System.out.println(firstNum);
		
		int lastNum = last1;
		System.out.println(lastNum);
		
		System.out.println(first1+last1);
		System.out.println(""+first1+last1); //only String can be concatinated
		//System.out.print(first1);
		//System.out.print(last1);
		
		char character0 = '0';
		int zeroAsciiNumber = character0;
		System.out.println(zeroAsciiNumber);
		
		char characterA = 'A';
		System.out.println((int)characterA);
		//System.out.println(characterA);
		
		
		
	}

}
