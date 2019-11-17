package day27;

import java.util.Arrays;

public class InterviewTaskIMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Saturday WARM UP Tasks : 

//			//Task1 : 
//				create an array of int with 5 items , return true if all items are more than 10
//				return false if not
//
//			//Task 2 :
//			given : 
//			String str = "Cybertek Batch Spartan is most hardworking Batch ever";
//
//			use the method your learned to get each words
//			and store it into String array: 
//
//			loop through each items -- 
//			  in each iteratrion loop : 
//			  	 turn each word into char array 
//			  	 print each char out with seperated by -
//			output : 
//				C-y-b-e-r-t-e-k-
//				B-a-t-c-h-
//				S-p-a-r-t-a-n-
//				i-s-
//				m-o-s-t-
//				h-a-r-d-w-o-r-k-i-n-g-
//				o-n-e-
//				e-v-e-r-
//
//			// Optional : Reverse each word in sentence
//			your output should be 
//			"ketrebyC hctaB natrapS si tsom gnikrowdrah eno reve"
		
		int [] nums = {10,20,10,4,50};
		boolean b1 = true;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]<10) {
				b1=false;
				break;
			}
		}
		
		System.out.println(b1);
		
		//------------------------------------
		//Task 2 :
//		given : 
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		String[] eachStr = str.split(" ");
		System.out.println(Arrays.toString(eachStr));
		
				
		for (int i = 0; i < eachStr.length; i++) {
			//System.out.println(eachStr[i]);
			String one = eachStr[i];
			char [] eachChar = one.toCharArray();
			for (int j = 0; j < eachChar.length; j++) {
				System.out.print(eachChar[j] + "-");
			}
			System.out.println();
		}
		//------------------------------------
//		// Optional : Reverse each word in sentence
//		your output should be 
//		"ketrebyC hctaB natrapS si tsom gnikrowdrah eno reve"
		String str1 = "Cybertek Batch Spartan is most hardworking Batch ever";
		String[] eachWord = str.split(" ");
		String reversedSentence = "";
		for (int j = 0; j < eachWord.length; j++) {
			System.out.println(eachWord[j]);
			
			//String one1 = eachWord[j]; //in each iteration this will be a new word
			char [] wordChar = eachWord[j].toCharArray(); //this create char array for words
			
			for (int i = 0; i < wordChar.length/2; i++) {
				//create a temp char variable so we can temp store the value we want to swap
				char temp = wordChar[i];
				wordChar[i] = wordChar[wordChar.length-1-i];
				wordChar[wordChar.length-1-i] = temp;
			}
			System.out.println(Arrays.toString(wordChar));
			
			//how to change char array to a String
			String reversed = new String(wordChar);
			reversedSentence += reversed + " ";
		}
		
		System.out.println(reversedSentence);
		String [] splt = reversedSentence.split(" ");
		System.out.println(Arrays.toString(splt));
		
		
//		String one1 = "Cybertek";
//		char [] wordChar = one1.toCharArray();
//		
//		for (int i = 0; i < wordChar.length/2; i++) {
//			char temp = wordChar[i];
//			wordChar[i] = wordChar[wordChar.length-1-i];
//			wordChar[wordChar.length-1-i] = temp;
//		}
//		System.out.println(Arrays.toString(wordChar));
//		
//		//how to change char array to a String
//		String reversed = new String(wordChar);
//		System.out.println(reversed);
//		
//		for (int i = 0; i < eachWord.length; i++) {
//			
//		}
		

	}

}
