package week3.day4;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setFileName() {
		excelFileName = "createLead";

	}
	
	

	@Test(dataProvider="fetchData")
	public void runCreateLead(String company,String fName,String lName) {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
		
}
	
	
}






