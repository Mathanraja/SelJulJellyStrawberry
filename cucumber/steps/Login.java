package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	public ChromeDriver driver;
	
	@Given("open the chrome browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@And("load the application url")
	public void loadTheApplicationUrl() {
	    
		driver.get("http://leaftaps.com/opentaps/control/main");
	    
	}

	@Given("Enter the username (.*)")
	public void enterTheUsername(String uName) {
		
		driver.findElementById("username").sendKeys(uName);
	    
	    
	}

	@Given("Enter the password (.*)")
	public void enterThePassword(String password) {
		driver.findElementById("password").sendKeys(password);
	    
	}

	@When("click login button")
	public void clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	    
	}

	@Then("HomePage should be displayed")
	public void homepageShouldBeDisplayed() {
	    System.out.println("homepage displayed");
	    
	}

}
