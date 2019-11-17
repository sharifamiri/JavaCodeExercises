package day24;

public class ArrayPractice2GettingSumAndMaxIMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an int array of 5 items and assign values ; 

		// double the value of 3rd item  : for example 9 --> 18 
		// update the value of 4th item to sum of 1st and 2nd items

		// print them out using the loop 


		int[] num = {1,4,6,8,9};
		num[2]*= 2;
		System.out.println(num[2]);
		
		num[3]=num[0]+num[1];
		System.out.println(num[3]);
		
		for (int i = 0; i<num.length; i++) {
			System.out.print(num[i]+ " ");
		}
		
		// OPTIONALLY SWAP the value of first and last items
		int temp;
		temp =num[num.length-1];
		num[num.length-1]=num[0];
		num[0]=temp;
		
		System.out.println();
		
		for (int i = 0; i<num.length; i++) {
			System.out.print(num[i]+ " ");
		}
		
		
		System.out.println();
		
		//Get Reversed and SUM
		int sum =0;
		for (int i = num.length-1; i >= 0; i--) {
			System.out.print(num[i]+ " "); //Reverse
			sum+=num[i];
		}
		System.out.println();
		System.out.println(sum);
		
		//GETTING "MAX"
		int max=num[0];
		for (int i = 1; i <num.length; i++) {
			  if(num[i]>max) {
			  //if(num[i]<max) { -->for SMALLEST
				    max=num[i];
			  }
		}
		System.out.println(max);
		
		/*// we assume the first item is the max 
	     * then compare the first item to the rest of them 
	     * and replace the value of max with actual max number
	     * in each iteration 
	     * max 1 
	     * iteration 1 ---> 4>1  ----> max 4
	     * iteration 2 ---> 6>4  ----> max 6
	     * iteration 3 ---> 8>6  ----> max 8
	     * iteration 4 ---> 9>8  ----> max 9
	     * iteration 5 ---> 5>9 false ----> max 9
	     * 
	     *  
	     * */
	}

}
