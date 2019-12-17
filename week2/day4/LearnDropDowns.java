package week2.day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDowns {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Dropdown.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Finding the dropdown Element
	WebElement dd1 = driver.findElementById("dropdown1");
	//Creating an object for Select class and passing the dd webElement as parameter
	Select sc = new Select(dd1);
	List<WebElement> options = sc.getOptions();
	for (WebElement eachOption : options) {
		System.out.println(eachOption.getText());
	}
	sc.selectByIndex(options.size()-1);
	
	
	//When you want to select by Index
	//	sc.selectByIndex(1);
	
	//To select by Text
	// sc.selectByVisibleText("Appium");
	
	// To select using value attribute
	// sc.selectByValue("3");
	
	
	
	
	
	
	
}
}
