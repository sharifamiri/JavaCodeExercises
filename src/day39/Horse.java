package day39;

public class Horse {

	String breed;
	int age;
	String color;
	double height;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Horse h1 = new Horse();
		h1.breed = "Tajik";
		h1.age = 10;
		h1.color = "black";
		h1.height = 5.6;
		
		Horse h2 = new Horse();
		h2.breed = "Hisori";
		h2.age = 15;
		h2.color = "white";
		h2.height = 7.1;
		
		System.out.println(h2.color);
		
		System.out.println(h1.breed +" : " + h1.age + " : " + h1.color + " : " + h1.height);
	}

}
