package day54.sub;

public class Stadium{
	
	int capacity;
	String food;
	
	public int getCapacity() {
		return capacity;
	}
	
	public Stadium(int capacity, String food) {
		//super();
		this.capacity = capacity;
		this.food = food;
	}

	@Override
	public String toString() {
		return "Stadium [capacity=" + capacity 
				+ ", food=" + food + "]";
	}
	
	
	
	
}