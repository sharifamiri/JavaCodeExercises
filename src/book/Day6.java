package book;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    //declare a variable offerCount and give initial value of 1;
		int offerCount = 1;
		//got 5 offers today--->shorthand assignment to increment the value
		offerCount+=5;
		//rejected 2 of them
		offerCount -=2;
		//after a week, your offer multiplied by 4
		offerCount*=4;
		//then you decided cut the offer count to half of what you have
		offerCount/=2;
		//eventually you want to get remainder by 5;
		offerCount%=5;
		
		System.out.println(offerCount);
		
		
		
	}

}
