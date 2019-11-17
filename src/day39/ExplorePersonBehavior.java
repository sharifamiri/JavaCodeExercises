package day39;

public class ExplorePersonBehavior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p = new Person();
		p.age = 19;
		p.gender = 'M';
		p.name = "Night King";
		
		p.eat();
		p.eat();
		p.tellMeYourName();
		
		Person g = new Person();
		g.age = 19;
		g.gender = 'F';
		g.name = "Alina";
		
		g.tellMeYourName();
		g.printPersonInfo();
	}

}
