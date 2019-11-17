package day13;

public class TrenaryElaboration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int x = 97;
//		String result = "Unknown";
//		
//		if(x>70) {
//			result = "pass";
//			
//		}else {
//			result = "fail";
//		}
//		
//		result = (x>70)? "pass" : "fail";
//		//System.out.println("fail");
//		//System.out.println(result);
//		System.out.println(((x>70)? "pass" : "fail") + 10);
	
		int num1 = 5;
		int num2 = 8;
		num2++; //8++
		num1--; //5--
		                  //  4++ > (9-1)=8 ? x   : 5
		System.out.println((num1++> --num2 ? num2 : num1) + 10);
			 
	}

}
