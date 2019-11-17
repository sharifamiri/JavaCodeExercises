package day46;

public class SlackUser {

	private String name;
	private String email;
	private int groupNum;
	
	SlackUser(String name, String email, int groupNum){
		this.name = name;
		this.email = email;
		this.groupNum = groupNum;
		
	}
	SlackUser(){
		this("Sharif", "@email", 1);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGroupNum() {
		return groupNum;
	}
	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}
	
	 // special method that for getting String representation of an object 
	  // it will be automatically called when object is being printed using sysout
	public String toString() {
		return "SlackUser [name=" + name + ", email=" + email + ", groupNum=" + groupNum + "]";
	}
	
	public void sendMessage(String channel, String content) {
		System.out.println(name + " send message \"" + content +"\" to channel --> "+channel);
	}
	
	
	
	
}
