package week3.day4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week4.day1.ReadExcel;

public class BaseClass {
	public static ChromeDriver driver;
	
	public String excelFileName;
	
	@Parameters({"username","password"})
	@BeforeMethod
	public void login(String uName,String password) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uName);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();

	}
	
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		
		
		
		
		/*
		 * String[][] data = new String[2][3];
		 * 
		 * //String[][] data =
		 * {{"Testleaf","Hari","Prasad"},{"Fidelity","Vijay","Dhanapal"}};
		 * 
		 * data[0][0]= "Testleaf"; data[0][1]= "Hari"; data[0][2]= "Prasad";
		 * 
		 * data[1][0]= "Fidelity"; data[1][1]= "Gopi"; data[1][2]= "J";
		 */
		 
		
		return ReadExcel.excelData(excelFileName);
	}
	
	
	
	
	
	

}
