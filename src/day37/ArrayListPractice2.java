package day37;

import java.util.ArrayList;

public class ArrayListPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Adding items
				
		
		ArrayList<String> list1 = new ArrayList<>();
				list1.add("Sharif");
				list1.add("Fakha");
				list1.add("Jova");
				list1.add("Xojam");
				
				
				for (int i = 0; i < list1.size(); i++) {
					System.out.println(list1.get(i));
				}
				
				System.out.println("----------------------");
				
				for (String string : list1) {
					System.out.println(string);
				}
				
		
	}

}
