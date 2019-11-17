package day26;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String shows = "Orville, Game of Thrones, X-man ,Gifted, Breaking bad";
		String[] showsArray = shows.split(",");
		
		System.out.println(Arrays.toString(showsArray));
		
		for (int i = 0; i < showsArray.length; i++) {
			System.out.println(showsArray[i]);
		}
		
		System.out.println(showsArray[showsArray.length-1]); //printing last split word
		
		String[] showsArray1 = shows.split("Game of Throne");
		
		for (int i = 0; i < showsArray1.length; i++) {
			System.out.println(showsArray1[i]);
		}
	}

}
