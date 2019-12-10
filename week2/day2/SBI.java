package week2.day2;

public class SBI implements RBI {

	public void savingsAccount() {
		System.out.println("6%");
		
	}

	public void fixedDeposit() {
		System.out.println("7%");
		
	}

	public void currentAccount() {
		System.out.println("0%");
		
	}

	public void recurringDeposit() {
		System.out.println("8%");
		
	}
	
	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		
		sbi.savingsAccount();
		sbi.fixedDeposit();
		sbi.currentAccount();
		sbi.recurringDeposit();
		
		//RBI obj = new SBI();
		
		/*obj.savingsAccount();
		obj.fixedDeposit();
		obj.currentAccount();*/
		
		
		
		
	}

	

	public void location() {
		System.out.println("Chennai");
		
	}

	
}
