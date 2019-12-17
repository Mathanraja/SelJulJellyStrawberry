package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> progress = driver.findElementsByXPath("//table[@id='table_id']//tr//td[2]");
		List<Integer> values = new ArrayList<Integer>();
		for (WebElement eachElement : progress) {
			String text = eachElement.getText().replaceAll("[^0-9]", "");
			int intValue = Integer.parseInt(text);
			values.add(intValue);
			
		}
		Collections.sort(values);
		System.out.println(values);
		Integer maxBefore = values.get(values.size()-1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * //To find the table WebElement eleTable = driver.findElementById("table_id");
		 * //To find the no of Rows in the table List<WebElement> rows =
		 * eleTable.findElements(By.tagName("tr")); System.out.println(rows.size());
		 * //To find the no of cols in the table List<WebElement> cols =
		 * rows.get(0).findElements(By.tagName("th")); System.out.println(cols.size());
		 * 
		 * for(int i = 1; i< rows.size();i++) { WebElement eachrow = rows.get(i);
		 * for(int j = 0;j<cols.size();j++) { String text =
		 * eachrow.findElements(By.tagName("td")).get(j).getText();
		 * System.out.println(text); } }
		 * 
		 */		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * List<WebElement> listOfMentors =
		 * driver.findElementsByXPath("//table[@id='table_id']//tr//td[5]"); for
		 * (WebElement eachMentor : listOfMentors) {
		 * System.out.println(eachMentor.getText()); }
		 */
		 
	}

}
