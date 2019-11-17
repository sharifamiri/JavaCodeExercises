package day35;

public class LongIntMethodOverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(10); //it works with long
		//add(10l); /doesn't work with int
		add((int)10l);
		
		int a = (int)10l;
	
	}
	
	public static void add(int x) {
		System.out.println("int x: "+ x);
	}
//	public static void add(long x) {
//		System.out.println("long x: "+ x);
//	}
	public static void add(short x) {
		System.out.println("short x: "+ x);
	}

}
