package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demojavacucu {
	WebDriver driver;
	@Given("the user is in the Demo Webshop page")
	public void the_user_is_in_the_Demo_Webshop_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
        System.setProperty("webdriver.chrome.driver", "C:\\Shruthi\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com");
	}

	@When("the user gives valid id {string} and {string}")
	public void the_user_gives_valid_id_and(String Email, String Password) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}

	@Then("relevant login username is displayed")
	public void relevant_login_username_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
	}
	}
