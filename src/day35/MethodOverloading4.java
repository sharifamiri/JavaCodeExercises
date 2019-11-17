package day35;

public class MethodOverloading4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double d;
		d=10;
		System.out.println(d);
		
		release((byte)10);
		release((short)10);
		release(10);
		release(10l);
		release(10f);
//		release(10d);
//		release(10.5);
//		release(15/2); //7 int
//		release(15/2.0); //7.5 double
//		release(15/2.0F); //7.5 float
	}
	
	public static void release(float f) {
		System.out.println("float: " + f);
	}
//	public static void release(double d) {
//		System.out.println("double: " + d);
//	}
	public static void release(int d) {
		System.out.println("int: " + d);
	}

}
