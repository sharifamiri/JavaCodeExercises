package day53;

public class EBook extends Book {

	//SUB CLASS HIDE SUPER CLASS'S FIELD REDECLARING IT
	//THE ONLY THING MATTER ID THE <NAME> !!!
	

	float name = 12.11f;
	long page = 100;
	
	//@Override ONLY for Instance Method so this will not work static
	private static double weight = -1;
	
	public static void main(String[] args) {
		EBook e = new EBook();
		System.out.println(e.name);
		
		e.showValues();
		
	}
	
	public void showValues() {
		System.out.println(super.name+ " + "+ this.name);
		System.out.println(super.page+ " + "+ this.page);
		//static field can be accessed directly in instance method
		//or we can make it obvious to call in static way EBook.weight
		System.out.println(super.weight+ " + "+ weight);
	}
}



//----------------------
//we can have more than one class in one source file
//however only one should be public

class Book{
	String name = "BookName";
	int page =10;
	double weight = 5.0;
}