package day27;

import java.util.Arrays;

public class ArraysCopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String []heros = {"Dad", "Mom", "Wife", "Kids", "Siblings", "Friends", "Mentors"};
		String[] heroCopy = new String[heros.length];
		
		
		for (int i = 0; i < heroCopy.length; i++) {
			heroCopy[i]= heros[i];
		}
		System.out.println(Arrays.toString(heroCopy));
		Arrays.sort(heroCopy);
		
		System.out.println(Arrays.toString(heroCopy));
		System.out.println(Arrays.toString(heros));
		
		for(String hero2 : heros) {
			if(hero2.equals("Dad")) {
				System.out.println("Bingo");
			}
		}
		
		
		
		
	}

}
