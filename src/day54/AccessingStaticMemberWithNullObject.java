package day54;

public class AccessingStaticMemberWithNullObject {

	public static void main(String[] args) {
		

		SoccerFinal s1 = new SoccerFinal();
		s1.printScore();
		//s1.printCupName();

		SoccerFinal s2 = null;
		//s2.printScore();
		s2.printCupName();
		System.out.println(s2.cupName);
		
	}

}
