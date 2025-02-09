package inheritancePractice5;

public class Manager extends Employee {
	
	int bonus;
	
	Manager(String name, int salary, int bonus) {
		super(name, salary); // Calling the constructor of Person class
		this.bonus = bonus;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Bonus :"+ bonus);
		System.out.println("Total Compensation: " + (salary + bonus));
	}
	

}
