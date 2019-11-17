package day49;

//if  class does not extend another class explicitly
//it will extend a class called Object implicitly

public class Employee extends Object{

	private String title;
	private int id;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "Spartan";
	}
	
	
}
