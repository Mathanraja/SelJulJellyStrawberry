package week3.day4;

import org.testng.annotations.Test;


public class LearnTestngAttributes {
	
	
	@Test(timeOut=2000)
	public void createLead() throws InterruptedException {
		System.out.println("lead is created");
		Thread.sleep(4000);
	}

	@Test
	public void editLead() {
		System.out.println("lead is edited");

	}

	@Test
	public void deleteLead() {
		System.out.println("lead is deleted");
		
		

	}

	
	
	
	
	
	
	
	
}
