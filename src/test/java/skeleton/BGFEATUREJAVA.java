package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BGFEATUREJAVA {
	WebDriver driver;
	@Given("john launched chrome browser")
	public void john_launched_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Shruthi\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        
	}

	@Given("provided demowebshop site url")
	public void provided_demowebshop_site_url() {
		driver.get("http://demowebshop.tricentis.com");
	}

	@When("he clicks on login")
	public void he_clicks_on_login() {
		 driver.findElement(By.linkText("Log in")).click();
	}

	@Then("he shall be able to provide credentials")
	public void he_shall_be_able_to_provide_credentials() {
		 System.out.println("creds");
	}

	@When("he clicks on register link")
	public void he_clicks_on_register_link() {
		 driver.findElement(By.linkText("Register")).click();
	}

	@Then("he shall be able to provide registration details")
	public void he_shall_be_able_to_provide_registration_details() {
		 System.out.println("reg deets");
	}

	@When("he clicks on wishlist")
	public void he_clicks_on_wishlist() {
		 driver.findElement(By.linkText("Wishlist")).click();
	}

	@Then("he shall be able to view his wishlist")
	public void he_shall_be_able_to_view_his_wishlist() {
		 System.out.println("view it ");
	}

}
