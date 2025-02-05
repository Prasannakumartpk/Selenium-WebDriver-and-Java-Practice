package inheritance;

public class Admin extends Developer {
	
	public void manage() {
		super.read();
		write();
		System.out.println("Adding and Deleting Content");	
	}
	
	public void read() {
		System.out.println("Read Content");
	}

}
