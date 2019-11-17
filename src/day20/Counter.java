package day20;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how many letters showed up in this string
		//String str = "jaaaava";
		String str = "Ali K Burhan";
		
		//go through each and every character
		//if i se a, i will increment my counter by 1
		
		int count = 0;
		int x=0;
		
		do {
			char c = str.charAt(x);
			if(c=='a' || c=='A') {
				System.out.println("BINGO " + x);
				count++; //count =count+1
			}
			x++;
		} while (x<str.length());
		
		System.out.println(count);
	}

}
