package inheritancePractice5;

public class Employee {
	
	String name;
	int salary;
	
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
		
	}
	
	public void displayInfo() {
		System.out.println("Name :"+ name);
		System.out.println("Salary :"+ salary);
	}

}
