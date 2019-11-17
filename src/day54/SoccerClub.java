package day54;

import day54.sub.Stadium;

public class SoccerClub {

	// HAS-A RELATIONSHIP CAN BE BUILD USING INSTANCE VARIABLE WITH REFERENCE TYPE
	// WHEN SoccerClub define has-a relationship with 
	//   Stadium by putting Stadium as instance variable 
	// it has access to everything  visible that Stadium object can have 

	// WHAT DO WE CALL HAS-A RELATIONSHIP COMPARED TO INHERITANCE FOR IS-A 
	// COMPOSITION
	
	int playerCount;
	String name;
	
	Stadium stadium;

	public SoccerClub(int playerCount, String name, Stadium stadium) {
		super();
		this.playerCount = playerCount;
		this.name = name;
		this.stadium = stadium;
	}

	public int getPlayerCount() {
		return playerCount;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	@Override
	public String toString() {
		return "SoccerClub [playerCount=" + playerCount 
				+ ", name=" + name 
				+ ", stadium=" + stadium + "]";
	}
	
	public static void main(String[] args) {
		
		SoccerClub chelcea = new SoccerClub(45, "Chelcea", new Stadium(10000, "burger"));
		
		System.out.println(chelcea);
		
		System.out.println(chelcea.getInitial());
		System.out.println(chelcea.getStadiumCapacity());
		
	}
	
	public int getStadiumCapacity() {
		return stadium.getCapacity();
	}
	public char getInitial() {
		return name.charAt(0);
	}
	
	
	 // ADD 3 ARGS CONSTRUCTOR 
	  // ADD GETTERS AND SETTERS 
	  // ADD TOSTRING METHOD 
	  // CREATE A MAIN METHOD 
	  // CREATE YOUR FAVORITE SOCCER CLUB OBJECT 
	  // AND TAKE SOME ACTIONS 

}


//class Stadium{
//	
//	int capacity;
//	String food;
//	
//	public Stadium(int capacity, String food) {
//		//super();
//		this.capacity = capacity;
//		this.food = food;
//	}
//
//	@Override
//	public String toString() {
//		return "Stadium [capacity=" + capacity 
//				+ ", food=" + food + "]";
//	}
//	
//	
//	
//	
//}