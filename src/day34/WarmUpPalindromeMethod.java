package day34;

public class WarmUpPalindromeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b1 = isPalindrome("civic");
		System.out.println(b1);
		System.out.println(isPalindrome("hanah"));
		
		//target and reversed
		
		System.out.println(isPalindrome2("hanah"));
		System.out.println(isPalindrome2("was it a car or a cat i saw"));
		System.out.println(isPalindrome2("Sharif"));
		
		
	}
	
	public static boolean isPalindrome(String name) {
		
		String store = "";
		name=name.replaceAll(" ", "");
		for (int i = name.length()-1; i >=0; i--) {
			store+=name.charAt(i);
		}
		//1ST Way
		if(name.equals(store)) return true;
		return false;
		
		//2ND Way
		//return name.equals(store);
	}
	public static boolean isPalindrome2(String target) {
		
		String reversed = reverseString(target);
		target=target.replaceAll(" ", "");
		//reversed=reversed.replaceAll(" ", "");

		return reversed.equals(target);

	}
	
	public static String reverseString(String target) {
		String reversed = "";
		
		for (int i = target.length()-1; i >=0; i--) {
			reversed+=target.charAt(i);
		}
		return reversed;
	}

}
