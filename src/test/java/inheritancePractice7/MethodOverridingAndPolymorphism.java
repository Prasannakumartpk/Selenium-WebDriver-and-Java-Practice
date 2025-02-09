package inheritancePractice7;

public class MethodOverridingAndPolymorphism {

	public static void main(String[] args) {
	
		Bank bank;
		bank = new SBI();
		System.out.println("SBI Interest Rate: " + bank.getInterestRate() + "%");
		
		bank = new HDFC();
		System.out.println("HDFC Interest Rate: " + bank.getInterestRate() + "%");
		
		bank = new ICICI();
		System.out.println("ICICI Interest Rate: " + bank.getInterestRate() + "%");
		

	}

}
