package day31;

public class MethodCallAnotherMethod {

	public static void main(String[] args) {
		
//		prepare();
//		addIngredients();
//		testAndBringToTable();
		
		AskSpouseToDoAll();

	}
	
	public static void AskSpouseToDoAll() {
		prepare();
		addIngredients();
		testAndBringToTable();
	}
	public static void prepare() {
		System.out.println("Step1: Boil Water");
	}
	public static void addIngredients() {
		System.out.println("Step2: Add Pasta");
		System.out.println("Step2: Add Oil");
	}
	public static void testAndBringToTable() {
		System.out.println("Step1: READY");
	}


}
