package day32;

public class ConversionReturnMethod {

	public static void main(String[] args) {
		
		
		System.out.println(meterToCM(15));
		System.out.println(feetToInch(10));
		System.out.println(fahrToCel(81));
		
		
		int meter = meterToCM(7);
		
		System.out.println(meter);
		
		double inch = feetToInch(7);
		int inch2 = (int)feetToInch(7); //you have to downcast
		
		System.out.println(inch);
		
		double cel = fahrToCel(100);
		int cel2 = (int)fahrToCel(7); //you have to downcast
		
		System.out.println(cel);

	}
	
	public static int meterToCM(int meter) {
		//1ST Way
//		int cm = num*100;
//		return cm;
		
		//2ND WAy
		return meter*100;
	}
	public static double feetToInch(int feet) {
		
		double inch = feet*12;
		return inch;
	}
	public static double fahrToCel(double fahr) {
		
		return (fahr-32)*5/9;
	}

}
