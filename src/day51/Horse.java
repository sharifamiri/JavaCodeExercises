package day51;

public class Horse extends Animal{
	  
	  
	  // everytime horse make noise 
	  // it should make animal noise first 
	  // then it should make horse specific noise 
	  
//	Horse() {
//		
//		System.out.println("HORSE!!");
//		super.eat();
//	}
	  @Override
	  public void makeNoise() {
	    
	    //System.out.println("General Noise");
	    System.out.println("Neigh Neigh");
	    super.makeNoise();
//	    System.out.println("done neighing");
//	    super.makeNoise();
//	    System.out.println("now really done neighing");
	    
	    //ALL THE SAME
//	    eat();
//	    super.eat();
//	    this.eat();

	  }
	  public void eat() {
			System.out.println("Horse Eating!!");
		}


	}
