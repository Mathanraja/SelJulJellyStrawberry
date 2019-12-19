package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='Open Home Page']").click();
		System.out.println(driver.getTitle());
		
		//To get the current window reference
		String currentWindowRef = driver.getWindowHandle();
		System.out.println(currentWindowRef);
		
		//To get all the reference of the window opened under the current session
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		//Creating an empty list to add the values
		List<String> allWindowsList = new ArrayList<>(allWindowHandles);
		
		//Pick the required String out of the list
		String secondWindow = allWindowsList.get(1);
		
		//To switch to the second window
		driver.switchTo().window(secondWindow);
		
		System.out.println(driver.getTitle());
		
		
		//To close all windows under the current session
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
