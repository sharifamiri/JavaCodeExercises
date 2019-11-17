package day8;

public class ConditionalStatement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isTimeToEndClass = true;
		boolean isTopiFinished = true;
		
		
		//if(isTimeToEndClass == true) {
		//if the variable itself is boolean type == true is optional
		if(isTimeToEndClass == true && isTopiFinished==true) {
			System.out.println("Ok lets end the class ");
		}else {
			System.out.println("Hang on tight");
		}
		
		
		if(isTopiFinished ==false) {
			System.out.println("can we finish it in few extra mins");
		}else {
			System.out.println("OK WE CAN GO NOW");
		}
	}

}
