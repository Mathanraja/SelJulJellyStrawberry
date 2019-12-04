package week1.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//driver.close();
		
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();*/
		

	}

}
