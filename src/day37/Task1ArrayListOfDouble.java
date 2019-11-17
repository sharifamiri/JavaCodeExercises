package day37;

import java.util.ArrayList;

public class Task1ArrayListOfDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> d1 = new ArrayList<>();
		
		d1.add(2.0);
		d1.add(5.4);
		d1.add(3d);
		d1.add(11.1);
		d1.add(4.53);
		
		Double d2 = d1.get(2);
		System.out.println(d2);
		
		for (int i = 0; i < d1.size(); i++) {
			System.out.println(d1.get(i));
		}
		
		System.out.println("----------------");
		for (Double eacDdouble : d1) {
			System.out.println(eacDdouble);
		}
		
		System.out.println("----------------");
		
		for (int i = 1; i < d1.size(); i++) {
			if(d1.get(i)>10) {
				System.out.println(d1.get(i));
			}
		}
	    System.out.println("PRINT SUM ");
	    // arithmatic operation only happens for primitives 
	    // if you try to add wrapper objects it will be unboxed 
		double sum = 0;
		for (double each : d1) {
			sum+=each;
		}
		
		System.out.println(sum);
		
	}

}
