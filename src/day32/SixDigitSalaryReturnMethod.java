package day32;

public class SixDigitSalaryReturnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long store = 0;

		long mySalary = giveMe6DigitSalary();
		//long secondYearSalary = (long)(giveMe6DigitSalary()*1.1);
		System.out.println("First year: "+mySalary);
		store+=mySalary;
		System.out.println("Second year: "+mySalary*1.04);
		store+=mySalary;
	
		System.out.println("My salary in two years: " +store);
		//System.out.println(mySalary + mySalary);
		
		
	}
	
	public static long giveMe6DigitSalary() {
		return 120000;
	}

}
