package day16;

public class ReplacePartOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Date is 03_25_2019";
		
		str = str.replace("_", "-"); //we have to declare str first, then replace
		
		System.out.println(str);
		
		//Date is 03_25_2019 --> Date is 03-25-2019

		str = str.replace("is", "will be");
		System.out.println(str);
		
		//Date will be 03-25-2019 --> 03-25-2019
		System.out.println(str.replace("Date will be ", "")); 
		
		String str2 = "AAAABBBBBCCC";
		System.out.println(str2.replace('A', 'Z')); //It will change all As

	}

}
