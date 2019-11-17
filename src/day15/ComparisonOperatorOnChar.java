package day15;

public class ComparisonOperatorOnChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Comparison / Relation Operator
		
		char c1 = 'a';
		char c2 = 'B';
		char c3 = ' ';
		
		//The low to high order in ASCII Table
			//special character -->number --> upppercase --> lowercase
		
		//ASCII Table decimal
		System.out.println((int)c1);  //97
		System.out.println((int)c2);  //66
		System.out.println((int)c3);  //32
		
		//it will always compare ASCII c=values of these characters
		System.out.println(c1==c2); //97==66 -->false
		System.out.println(c1!=c2); //97!=66 -->true
		System.out.println(c1>=c2);
		System.out.println(c1<c2);
		System.out.println(c1<=c2);
		
		
		
				
	}

}
