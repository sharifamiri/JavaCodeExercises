package book;

public class Comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World " + "Java");
		
		String language = "Java";
		System.out.println("Hello World " + language);
		
		String helloMessage = "Hello World";
		System.out.println(helloMessage + " "+ language);
		
		System.out.println(helloMessage + language + language);
		
		//multiple decelaration assignment on same line
		
		
		String name1="Adam", name2="John", name3="Sharifjon";
		
		//making new line in print statement (\n)
		System.out.println( name1 + name2 + name3 );
		System.out.println( name1 +" "+ name2 +" "+ name3 );
		System.out.println( name1 +"\n"+ name2 +"\n"+ name3 );
		
		//making new tap in print statement (\t)
		System.out.println( name1 +"\t"+ name2 +"\t"+ name3 );
		
		
		int a=10;
		int b=20;
		int c= a+b;
		
		System.out.println("The result of a + b is--" + c);
		
		//String sentence= "The result of a + b is--";
		//String finaloutput = sentence + c;
		
		//System.out.println(finaloutput);
		
		
		//Task 6
		
		double n1=300, n2=200;
		
		System.out.println(n1+n2);
		//when adding a string with another data type, becomes a string
		System.out.println("the result of addition is--"+ n1+n2);
		System.out.println("the result of addition is--"+ (n1+n2));
		
		
	}

}
