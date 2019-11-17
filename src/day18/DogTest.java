package day18;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc";
		
		String s2 = s1; //two reference pointing to same object
		
		s1 = null; //s1 leash is gone, but leash s2 exists, and dog is still alive
					//not eligible for garbage collection bec it still has a leash from s2
	}

}
