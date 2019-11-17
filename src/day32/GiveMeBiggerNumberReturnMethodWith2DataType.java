package day32;

public class GiveMeBiggerNumberReturnMethodWith2DataType {

	public static void main(String[] args) {
		
		//1ST WAY
		int beggerNum = giveMeABiggerNumber(5,7);
		
		System.out.println(beggerNum);
		
		//2ND WAY
		System.out.println(giveMeABiggerNumber(9,7));

	}
	
	public static int giveMeABiggerNumber(int num1, int num2) {
		
		int max = (num1>num2)? num1 :num2;
		
		return max;
	}
		
		
}

