package day8;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int a = 10, b = 20, c = 10;
		 * 
		 * boolean b1 = a>b; boolean b2 = a>=c;
		 * 
		 * System.out.println("a is more than b " + b1);
		 * System.out.println("a is more than or equal to c " + b2);
		 * 
		 * boolean bothMeetRequirement = b1 && b2;
		 * System.out.println("are both condition met " + bothMeetRequirement);
		 */
		
		boolean isHungry = true; //isHungry && isBreakTime --> & checks each one
		boolean isBreakTime = true;
		boolean isYourLunchReady = true;
		
		System.out.println("are you hungry AND is break time " + (isHungry && isBreakTime));
		System.out.println("are you hungry OR is break time " + (isHungry || isBreakTime));
		
		boolean reverseIsHungry = ! isHungry;
		System.out.println("Original is hungry " + isHungry);
		System.out.println("After reverse is hungry " + reverseIsHungry);
		
		boolean areWeSuperReady = isHungry && isBreakTime && isYourLunchReady;
		System.out.println("hungry, break time, meal is ready " + areWeSuperReady);
		
		//Logical AND operator &&
		//Logical OR operator ||
		//Logical NOT operator !
		
		
		
	}

}
