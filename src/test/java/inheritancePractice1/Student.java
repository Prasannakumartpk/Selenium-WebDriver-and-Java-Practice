package inheritancePractice1;

public class Student extends Person {
	
	int studentId;
	String course;
	
	Student(String name, int age, int studentId, String course){
		super(name, age); // Calling the constructor of Person class
		this.studentId = studentId;
		this.course = course;	
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Student ID :"+ studentId);
		System.out.println("Course :"+ course);
	}
}
