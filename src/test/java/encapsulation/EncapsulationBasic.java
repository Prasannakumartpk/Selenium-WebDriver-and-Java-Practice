package encapsulation;

public class EncapsulationBasic {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName1("Prasannakumar");
		student.setAge1(-34);
		System.out.println("Student Name: " + student.getName1());
		System.out.println("Student Age: " +student.getAge1());

	}

}
