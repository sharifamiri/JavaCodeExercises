package day55.Abstract;

public class HourlyEmployee extends Employee {

	//private int id;
	//private String name;
	private int monthlyHourWorked;
	private int hourlyRate;
	
	
	
	public HourlyEmployee(int id, String name, int monthlyHourWorked, int hourlyRate) {
		super(hourlyRate, name);
		
		this.monthlyHourWorked = monthlyHourWorked;
		this.hourlyRate = hourlyRate;
	}	
	
	@Override
	public boolean isIn100KClub() {
		int annual = monthlyHourWorked * hourlyRate *12;
		return annual > 100000;
	}


	public int getMonthlyHourWorked() {
		return monthlyHourWorked;
	}

	public void setMonthlyHourWorked(int monthlyHourWorked) {
		this.monthlyHourWorked = monthlyHourWorked;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	
		
	@Override
	public String toString() {
		return "HourlyEmployee [monthlyHourWorked=" 
	+ monthlyHourWorked + ", hourlyRate=" + hourlyRate + ", id=" + getId()
	+ ", name=" + getName() + "]";
	}

	@Override
	public void calculateAnnualSalary() {
		int annual = monthlyHourWorked * hourlyRate *12;
		System.out.println("the Hourly salary is: "+ annual);
		
	}




	
	
}
