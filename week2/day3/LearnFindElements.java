package week2.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {
public static void main(String[] args) {
	//
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElementById("twotabsearchtextbox").sendKeys("Apple Mobiles", Keys.ENTER);
	List<WebElement> elePhoneNames = driver.findElementsByXPath("//span[@class='a-size-medium a-color-base a-text-normal']");
	
	for (WebElement eachElement : elePhoneNames) {
		System.out.println(eachElement.getText());
	}
	elePhoneNames.get(0).click();
	
	
	
	
	
	
	
	
	
	
	
}
}
