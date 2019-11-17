package ImportanSubjects;

import java.util.Arrays;

public class day29CreatingPizzaSlice2DAndLabelsToStopLoopIMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create array of 2 Dimensional String Array , the pizza has 7 slice , each slice can be finished in 3 bites , each bite has different topping as color code on the right : total 21 toppings.
Task 1.1 : create 2D String array to represent below scenario( using any one of 3 way to create and assign value to array)
Task 1.2 : print out to see what’s inside using the Arrays class method
Task 1.3 print all the value inside using for loop
Task 1.4 print all the value inside using for loop and skip 3rd slice of pizza
Task 1.5 print all the value inside using for loop and stop eating when you see banana pepper
		 * 
		 * 
		 * 
		 */
		
		
		String[][] pizza = { { "Mushroom", "Black Olive", "Green Pepper" }, { "Spinach", "Green Pepper", "Mushroom" },
				{ "Black Olive", "Black Olive", "Spinach" }, { "Mushroom", "Mushroom", "Red Pepper" },
				{ "Banana Pepper", "Spinach", "Red Pepper" }, { "Mushroom", "Green Pepper", "Green Pepper" },
				{ "Spinach", "Green Pepper", "Mushroom" } };
		//Task 1.1
		System.out.println(Arrays.deepToString(pizza));
		
		//Task1.3
		//1ST WAY
		for (String[] slice : pizza) {
			for (String topping : slice) {
				System.out.print(topping+"\t");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		
		//2ND WAY
		for (int i = 0; i < pizza.length; i++) {
			System.out.println("Slice number: " + (i+1));
			if(i==2)
				continue;
			
			for (int j = 0; j < pizza[i].length; j++) {
				System.out.print(pizza[i][j]+" | ");
		
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		
		//Task 1.5
		
		//labels -- used to label certain loop in nested loop
		spartan:
		for (int i = 0; i < pizza.length; i++) {
			System.out.println("Slice number: " + (i+1));
			
			for (int j = 0; j < pizza[i].length; j++) {
				if(pizza[i][j].equals("Banana Pepper"))
					break spartan;
				System.out.print(pizza[i][j]+" || ");
				
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		
		
		
	}

}
