package day33;

import java.util.Arrays;

public class CombineArrayReturnMethodIMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] num1 = {1.1, 3.9, 2.2};
		double [] num2 = {2.4, 2.88};
		double []target = combineArray(num1, num2);
		System.out.println(Arrays.toString(target));
		System.out.println(Arrays.toString(combineArray(num1, num2)));
		
		double [] expected = {1.1, 3.9, 2.2, 2.4, 2.88};
		
		if(Arrays.equals(expected, target)) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAILED");
		}
			
		
	}
	
	public static double [] combineArray(double []num1, double []num2){
		
//		double[] both =new double[num1.length+num2.length];
//		
//		both = Arrays.copyOf(num1, num2);
		
		  double []sum=new double[num1.length + num2.length];

		    for (int i=0; i<num1.length; i++){
		        sum[i]+=num1[i];
		    }
		    for (int i=0; i<num2.length; i++){
		    	sum[i+num1.length]+=num2[i];
		    }
			return sum;
	}
}
