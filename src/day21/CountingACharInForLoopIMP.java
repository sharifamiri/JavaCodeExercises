package day21;

public class CountingACharInForLoopIMP {

	public static void main(String[] args) {
		
		
		String str = "AAccBBBdEEEf";

		String newStr = "";
		
		//Store first char into newStr
		//Store the next char into newStr if it is not there
		
		//char c = str.charAt(0);
		//newStr += str.charAt(0);
		
		for (int i = 0; i < str.length(); i++) {
			String eachChar = str.charAt(i)+"";
			if(newStr.contains(eachChar)) {
				System.out.println(eachChar + " Duplicate");
			}else {
				newStr += eachChar;
			}
		}
		
		System.out.println(newStr);
	}

}
