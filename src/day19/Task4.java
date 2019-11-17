package day19;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String star = "*";
		
		//1st Way;
		
//		int x=0;
//		while(x<4) {
//			System.out.println(star);
//			x++;
//			star += star.charAt(0);;

		//2nd Way;
		
		int x=1;
		String allStar = "";
		
		while(x<=5) {
			allStar = allStar+star;
			
			System.out.println(allStar);
			x++;
		}
		System.out.print(allStar);
	}

}
