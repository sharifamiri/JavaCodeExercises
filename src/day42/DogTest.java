package day42;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d1 = new Dog();
		d1.name = "puppy";
		d1.breed = "pitbull";
		
		Dog d2 = d1;
		
		d2.name = "yumak";
		
		System.out.println(d1.name);
		
		//Now d2 changed the pointer to "Mila"
		d2= new Dog();
		d2.name = "Mila";
		
		System.out.println(d1.name);
	}

}
