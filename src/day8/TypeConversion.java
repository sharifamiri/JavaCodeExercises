package day8;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Type conversion --> converting one type of data type into another data type
		// converting from smaller data type to bigger type is called type
		// widening/upcasting
		// converting from bigger data type to smaller type is called type
		// narrowing/downcasting
			// downcasting require explicit casting operation for example
			// long grande = 1000L ; int medium = (int) grande ;

		/*
		 * int medium = 10; //byte, short, int , long //shot, tall, medium, grande --->
		 * Starbucks cup size
		 * 
		 * //long grande = 10l; long grande = medium; System.out.println(grande);
		 * 
		 * //type widening/upcasting
		 * 
		 * //short tall = 5L; //can not put long value inside any variable //that has
		 * smaller range
		 * 
		 * short tall = (short) grande; //type narrowing/downcasting
		 * System.out.println(grande);
		 */

		/*
		 * double superGrande = 15.67d; int mediumCup = (int) superGrande;
		 * 
		 * System.out.println(mediumCup);
		 */// whatever the data can not hold, would be lost

		byte tinyExpressoCup = 2;
		// typewidening/upcasting
		// this will happen implicitly/automatically
		int mediumCup = tinyExpressoCup;

		// int mediumCup = (int) tinyExpressoCup; //no need to mention int if storing a
		// small one into a big one

	}

}
