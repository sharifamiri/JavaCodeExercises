package day32;

public class AdultOrNotReturnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		boolean result = isAdultOrNot(14);
		System.out.println(result);
		System.out.println(isAdultOrNot(23));
		System.out.println(isAdultOrNot(63));
	}
	
	public static boolean isAdultOrNot(int num) {

		//return age>18;
		if(num>18) {
			return true;
		}else {
			return false;
		}
		
	}

}
