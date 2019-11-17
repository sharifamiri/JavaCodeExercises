package day44;

import java.util.Arrays;

public class MathActions {

	public static void main(String[] args) {
		
		
		MathEquasion m1 = new MathEquasion (120, 10, '+');
		MathEquasion m2 = new MathEquasion (13, 12, '-');
		MathEquasion m3 = new MathEquasion (120, 10, '/');
		MathEquasion m4 = new MathEquasion (12, 10, '*');
		
		MathEquasion [] arr = {m1, m2, m3, m4};
		
		for (MathEquasion each : arr) {
			each.calculate();
			System.out.println(each.getResult());
			System.out.println(each);
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
