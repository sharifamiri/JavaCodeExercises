package day34;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Vararg --> variable number of arhuments 
		
		//we are passing 2 external data to a method 
		// that have 2 parameters
		
		//we are passing 2 arguments to a method
			// that have two parameters
		
		add2Numbers(10, 20);
		
		add2Numbers2(10, 20, 30);
		
		addManyNumbers(new int [] {1,4,66,33});
		
		//VarArgs
		System.out.println("------VarArgs--------");
		addManyNumbers2(1,2,3,4,5,6);
		addManyNumbers2(1,2,3,4);
		
		//varArgs --> is used to create a method
			//that can take variable numbers of argument of same type
			//when being called
		
		//varArg parameters is represented by using
		//... after method parameter data type 
		//and IT CAN ONLY BE USED HERE
		
	}
	
	//--------------------------------------------
	//VarArgs Method
	public static void addManyNumbers2(int...manyNums) {

		int sum = 0;
		
		for (int eachNum : manyNums) {
			sum+=eachNum;
		}
		System.out.println(sum);
		//System.out.println(Arrays.toString(manyNums));
	}
	//--------------------------------------------
	public static void addManyNumbers(int [] manyNums) {
		int sum = 0;
		
		for (int eachNum : manyNums) {
			sum+=eachNum;
		}
		System.out.println(sum);
	}
									//method parameters
	public static void add2Numbers(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public static void add2Numbers2(int num1, int num2, int num3) {
		System.out.println(num1 + num2 +num3);
	}

}
