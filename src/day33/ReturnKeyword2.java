package day33;

public class ReturnKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ageTester(16);
		ageTester(36);
		
		isAdultOrNot(18);
		System.out.println(isAdultOrNot(16));
		
	}
	
	public static boolean isAdultOrNot(int age) {
		//BREAK vs Return
		//BREAK : --> we can use it to get out of Switch and loop
		//return --> to return a value or terminate method execution
		if(age<18) {
			System.out.println("Not Adult");
			return false;
		}else {
			return true;
		}
		//a method that return a value of any type 
		//should not have any chance to not return value
		//or it will not even compile
		
		//you may have many returns statement in different execution path
		//but you may only return one value
	}
	
	public static void ageTester(int age) {
		if(age<18) {
			System.out.println("Too Young");
			return;  //once the return keyword is reached it will exit the method
		}
		
		System.out.println("Study Java");
		System.out.println("Get a Job");
	}

}
