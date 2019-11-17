package day55.Abstract;

public class SalariedEmployee extends Employee {

	

	private int monthlySalary;
	
	public SalariedEmployee(int id, String name, int monthlySalary) {
		super(id, name);
		this.monthlySalary = monthlySalary;
	}	
	
	public static void main(String[] args) {
		
		SalariedEmployee e1 = new SalariedEmployee(1010, "Sharif", 10000);
		System.out.println(e1.toString());
		e1.calculateAnnualSalary();
		e1.setMonthlySalary(101010);
		
		int newMonthlySalary = (int) ( e1.getMonthlySalary() * 1.1 ) ; 
		e1.setMonthlySalary(  newMonthlySalary    );
		e1.calculateAnnualSalary();
		
		
		HourlyEmployee e2 = new HourlyEmployee(102,"Ahmat" , 160, 20) ; 
		System.out.println(  e2.toString());
		
		e2.calculateAnnualSalary();
		e1.calculateAnnualSalary();
		
		System.out.println("Hourly salary: "+e2.isIn100KClub());
		System.out.println("Salaried salary: "+e1.isIn100KClub());
		
	}
	
	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	@Override
	public void calculateAnnualSalary() {
		System.out.println("the Salaied salary is: "+monthlySalary * 12);
	}

	@Override
	public String toString() {
		return "SalariedEmployee [id=" + getId() + ", name=" 
	+ getName() + ", monthlySalary=" + monthlySalary + "]";
	}

	@Override
	public boolean isIn100KClub() {
		int annual = monthlySalary * 12;
		return annual > 100000;
	}


	
}
