package book;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
		double c_price=2.5;
		float o_price=1.5f;
		int t_price=3, p=2, cr=4;
		String d_price="dollars";
		
		System.out.println("1 Cucumber is "+ c_price + " "+d_price+ "\n"+"4 Tomatoes are "+ (t_price*4) + " "+d_price+ "\n"+"2 Onion is "+ (o_price*2) + " "+d_price+ "\n"+"1 Pepper is "+ (p) +" "+ d_price+ "\n"+"6 Carrots are "+ (cr*6) + " "+ d_price+ "\n");
		//right click-Refector_Change name_ hit Enter (would change iteverywhere)
		double total_price= c_price+t_price*4+p+cr*6+o_price*2;
		
		System.out.println("Total price: " + total_price);
		
		int a=6;
		int b=7;
		
		System.out.println("reminder is "+ a%b);
		
		double fahreinheit=-80d;
		double celcius = (5.0/9)*(fahreinheit-32);
		
		System.out.println(" the celciusprice "+ celcius);
		
				
	}
	
}
