package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// driver.findElementByXPath("//button[text()='Alert Box']").click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		driver.findElementByXPath("//button[text()='Confirm Box']").click();

	}
}
