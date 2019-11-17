package day15;

public class CastingPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//char, boolean
		//byte, short, int, long, float, double
		
		// type conversion --casting
		
		//byte -->int upcasting / type widening
		
		//this happens implicitly by compiler -- by compiler
		byte b = 12;
		int i = b;
		int y = (int)b;  //explicitly -- by programmer
						//you don't have to do mention int bec you are puting a small one inside a big one
		
		
		//int -->byte downcasting / type narrowing
		
		int a = 20;
		byte c = (byte)a; //you have to do mention byte
		
		double d = 12.12;
		int k= (int) d;
		System.out.println(k);
		
		//boolean b = (boolean)10;
		
		//char to int
		
		char c1 = 'A';
		int cNum = c1; //now converting character to number
		System.out.println(cNum);
		
		
		
	}

}
