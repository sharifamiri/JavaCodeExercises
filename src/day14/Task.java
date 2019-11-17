package day14;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Sharif";
		int count = name.length();
		System.out.println(name.charAt(name.length()-1));
		System.out.println(name.substring(count-1,count));
		
		System.out.println(name.charAt(0)+""+name.charAt(1));
		System.out.println(name.substring(0, 2));
		
		int midPoint = count/2;
		System.out.println(midPoint);
		System.out.println(name.substring(midPoint, count));
		System.out.println(name.substring(3, 6));
		
		
	}

}
