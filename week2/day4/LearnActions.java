package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElementByXPath("//button[text()='✕']").click();
		
		WebElement eleElectronics = driver.findElementByXPath("//span[text()='Electronics']");
		Thread.sleep(2000);
		
		Actions builder = new Actions(driver);
		builder
		.moveToElement(eleElectronics)
		.pause(2000)
		.click(driver.findElementByXPath("//a[text()='Mi']"))
		.perform();
		
		builder.keyDown(Keys.CONTROL).click().click().click().keyUp(Keys.CONTROL).release().perform();
		
		builder.drag
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
