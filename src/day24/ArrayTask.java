package day24;

public class ArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] name = new char[6];
		name[0] = 'S';
		name[1] = 'h';
		name[2] = 'a';
		name[3] = 'r';
		name[4] = 'i';
		name[5] = 'f';
		
		char [] name2 = new char[] {'S','h','a','r','i','f'};
		char [] name3 = {'S','h','a','r','i','f'};
		
		System.out.println(name2[0]);
		System.out.println(name2[1]);
		System.out.println(name2[2]);
		System.out.println(name2[3]);
		System.out.println(name2[4]);
		System.out.println(name2[name2.length-1]);
		
		int count = name.length ; 
	     
	     System.out.println( "item in last index : " +  name[count-1] );
	     // how do we get the one in the middle 
	     
	     int midIndex = count/2 ; 
	     
	     System.out.println( "item in mid index : " +  name[midIndex] );
		
		for (int i = 0; i <name2.length; i++) {
			System.out.print(name[i]);
		}
		
		System.out.println();
		for (int i = 5; i >= 0; i--) {
			System.out.print(name3[i]);
		}
	}

}
