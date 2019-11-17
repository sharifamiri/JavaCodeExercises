package day11;

public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		//int y = 5 //we can not declare something that we have already declared
		if(x==10) {
			int y=2;
			//x+=5;
			System.out.println("YES");
			
			//variable scope --> it means where you can access
			//the piece of data you declared
			System.out.println(y);
		}
		System.out.println(x);
		

		//System.out.println(y);
		
	}

}
