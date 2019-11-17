package day14;

public class MoreStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    //where the letter start--after it ends
		//subString(beginningIndex, EndingIndex)
		//beginning index is always inclusive
		//ending index is always exclusive
		             //012345
		String name = "Merzet";
		
		//rze
		System.out.println(name.substring(2,5));
		//System.out.println(name.substring(5,2)); //you can't do this
		//System.out.println(name.substring(1,10)); //you can't do this
		System.out.println(name.substring(1,6)); //you stop at the location even though we don't have 6
		
		
	}

}
