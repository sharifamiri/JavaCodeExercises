package day54;

public class Engine {

	  /*
	   * final instance fileds : engineType as String cilinderCount as int
	   * 
	   * 2 arg constructors to set the fields value
	   * 
	   * instance method : start() accept no param and return nothing print engine
	   * <type> with cilinderCount <count> is starting toString method
	   */
	
	
	String engineType;
	int cilinderCount;
	
	
	
	public Engine(String engineType, int cilinderCount) {
		super();
		this.engineType = engineType;
		this.cilinderCount = cilinderCount;
	}



	public void start() {
		System.out.println("Type = "+ engineType 
				+" Count = "+cilinderCount);
	}



	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", cilinderCount=" + cilinderCount + "]";
	}
	
	
}
