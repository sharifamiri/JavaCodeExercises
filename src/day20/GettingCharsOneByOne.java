package day20;

public class GettingCharsOneByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Sharif Amiri";
		
		int count = name.length();
		
		for (int i = 0; i < count; i++) {
			System.out.print(name.charAt(i) + " ");
		}
		
		System.out.println();
		for (int i = count-1; i >=0; i--) {
			System.out.print(name.charAt(i) + " ");
		}
	}

}
