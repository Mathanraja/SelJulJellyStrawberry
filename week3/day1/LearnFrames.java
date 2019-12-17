package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//find the frame
		WebElement myFrame = driver.findElementByClassName("demo-frame");
		//switch the context to the frame
		driver.switchTo().frame(myFrame);
		//Interact within the frame
		driver.findElementByXPath("//li[text()='Item 1']").click();
		//Come out of the frame
		driver.switchTo().defaultContent();
		//Interact with the rest of the page
		driver.findElementByLinkText("Download").click();
		
		
		
		
		
		
		
	}

}
