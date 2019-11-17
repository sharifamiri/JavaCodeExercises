package day55.Abstract;

public class LocalStudent extends Student {

//  int id; 
//  String name; 
	int seatID;
	
	@Override
	public void attendClass() {
		System.out.println("ATTEND IN CLASS");
	}
	
	public LocalStudent(int id, String name, int seatID) {
		super(id, name);
		this.seatID = seatID;
	}
}
