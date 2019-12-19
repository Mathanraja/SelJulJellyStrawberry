package week3.day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement button1 = driver.findElementByXPath("//button[text()='Open Home Page']");

		
		
		//Press prntscrn or Win+prntscn
		File src = button1.getScreenshotAs(OutputType.FILE);
		
		//Create an image file
		File dest = new File("./snaps/IMG001.png");
		
		//Paste the snap over it
		FileUtils.copyFile(src, dest);
		
		
		
		
		
	}

}
