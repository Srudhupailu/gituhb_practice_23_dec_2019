package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberJava {
	WebDriver driver;
	@Given("the user is in the TestMeApp page")
	public void the_user_is_in_the_TestMeApp_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
        System.setProperty("webdriver.chrome.driver", "C:\\Shruthi\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("the user gives valid id and password")
	public void the_user_gives_valid_id_and_password()  {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
		
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	  // throw new cucumber.api.PendingException();

		System.out.println("Login successful");
		driver.close();
	}
	
	
}
