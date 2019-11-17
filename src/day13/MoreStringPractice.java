package day13;

public class MoreStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Zuhkhra";
		boolean uContains = s1.contains("u");
		
		System.out.println("does name contains \"u\"? " + s1.contains("u"));
		
		System.out.println("Whta is the position of \"u\"? " + s1.indexOf("u"));
		
		//subString(beginning index, ending index)
		//it will return part of a string starting from beginning till right before ending index
		//012345
		//Zukhra; substring(1, 4) ---> u
		String partOfString = s1.substring(1, 4);
		System.out.println(partOfString);
		
		//0123456
		//SAYYARA
		String s2 = "SAYYARA";
		String partOfString2 = s2.substring(3, 6);
		System.out.println(partOfString2);
		
		
	}

}
