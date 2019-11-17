package day11;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username = "user";
		String password = "pass";
		
		if(username.equals("user") && password.equals("pass")) {
			
			System.out.println("\" login successful \"");
		}else {
			if(! username.equals("user")) {
				System.out.println("Username not found");
			}else {
				System.out.println("Password not Correct");
			}
		}
	}

}
