package inheritancePractice2;

public class Car extends Vehicle {
	
	public void move() {
		super.move();
		System.out.println("Car is driving");
	}

}
