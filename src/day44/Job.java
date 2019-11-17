package day44;

public class Job {

	private String title;
	private String company;
	private double annualSalary;
	

	public String getTitle() {
		return title;
	}

	public void setTitle() {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany() {
		this.company = company;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary() {
		this.annualSalary = annualSalary;
	}
	
	public Job () {
		title = "undefined";
		company = "unknown";
		
	}
	public Job (String title) {
		this.title = title;
		
	}
	public Job (String title, String company, double annualSalary) {
		this.title = title;
		this.company = company;
		this.annualSalary = annualSalary;
		
	}
	
	public String toString() {
		String str = "Title: " + title + " | Company: " 
				+ this.company + " | Annual Salary:" + this.annualSalary; //putting this. is optional
	
		return str;
	}
	

}
