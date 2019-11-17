package day17;

public class StringHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "abc"; //+ "efg" --> this is in the pool
		String b = a.concat("efg");
		String c = "abcefg";
		
		System.out.println(b==c);
	}

}
