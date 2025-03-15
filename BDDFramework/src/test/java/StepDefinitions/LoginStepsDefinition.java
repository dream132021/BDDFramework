/*package StepDefinitions;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinition {
	
	static WebDriver driver;
	LoginPage login;
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.get("https://www.saucedemo.com/v1/");
	    
	    login = new LoginPage(driver);
	    
	}

	//@When("user provides username and password")
	@When("user provides {string} and {string}")
	public void user_provides_and(String username, String password) {
		
		login.enterUserName(username);
		login.enterPassword(password);
	//public void user_provides_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //driver.findElement(By.id("user-name")).sendKeys(username);
	    //driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("clicks on submit button")
	public void clicks_on_submit_button() {
		login.clickLoginButton();
	    // Write code here that turns the phrase above into concrete actions
	    //driver.findElement(By.id("login-button")).click();
	}

	@Then("user should land on Home Page")
	public void user_should_land_on_home_page() {
		Boolean Dashboard = login.logoDisplayed();
	    // Write code here that turns the phrase above into concrete actions
	    //Boolean Dashboard = driver.findElement(By.xpath("//div[text()=\"Products\"]")).isDisplayed();
	    Assert.assertEquals(Dashboard, true);
	}

	@And("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
	
	 @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	            System.out.println("Browser closed successfully.");
	        }
	    }

}*/
