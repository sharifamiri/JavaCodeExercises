package day51;

public class HorseBaby extends Horse{

	HorseBaby(){
		System.out.println("HORSEBABY");
	}
	public void makeNoise() {
		eat();
		super.eat();
	}
	
	  public void eat() {
			System.out.println("BabyHorse Eating!!");
			//super.eat();
		}
	
}
