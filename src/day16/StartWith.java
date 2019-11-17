package day16;

public class StartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Busra";

		System.out.println(str.startsWith("B"));
		System.out.println(str.startsWith("ABC"));
		
		boolean b = str.startsWith("Bu");
		
		if(b) {
			System.out.println("Successful");
		}else {
			System.out.println("Not a Bu");
		}
	}

}
