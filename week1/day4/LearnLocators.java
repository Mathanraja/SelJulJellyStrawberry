package week1.day4;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//WebElement username = driver.findElementById("username");
		
		
		
	//	username.clear();
		
		
		
	/*	
		String text = driver.findElementByTagName("label").getText();
		
		System.out.println(text);
		*/
		
		//findElements using tag-name
		
		/*List<WebElement> allLabel = driver.findElementsByTagName("label");
		
		for (WebElement eachElement : allLabel) {
			
			String text = eachElement.getText();
			
			System.out.println(text);
			
		}
		
		
		
			
		*/
		/*int size = allLabel.size();
		
		System.out.println(size);*/
		
		
		
		
		/*List<WebElement> allTextFields = driver.findElementsByClassName("inputLogin");	
		
		for (WebElement eachElement : allTextFields) {
			
			String name = eachElement.getAttribute("name");
			
			System.out.println(name);
		}*/
		
		
		String text = driver.findElementByXPath("//h2").getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*username.sendKeys("Demosalesmanager");
		
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		//driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByPartialLinkText("CRM").click();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.findElementById("username").clear();
		driver.findElementById("username").sendKeys("Demosalesmanager");*/

	}

}
