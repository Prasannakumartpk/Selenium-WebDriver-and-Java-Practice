package encapsulation;

class Student {
	
	private String name;
	private int age;
	
	public void setName1(String name) {
		this.name = name;
	}
	
	public void setAge1(int age) {
		if(age>0) {
		this.age = age;
	}else {
		System.out.println("Age must be positive.");
	}
	}
	
	public String getName1() {
		return name;
	}
	
	public int getAge1() {
		return age;
	}
	

}
