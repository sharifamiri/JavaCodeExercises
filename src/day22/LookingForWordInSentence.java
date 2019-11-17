package day22;

public class LookingForWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "java kava ava";
		
		String target = "ava";
		
		//int firstIndex = str.indexOf(target);
		int lastIndex = str.lastIndexOf(target);
		
		int index = 0;
		
		while(index<=lastIndex) {
			index = str.indexOf(target, index);
			System.out.println("Found at index: " + index);
			//index = index+1;
			index = index+target.length();
		}
		
		
		
	}

}
