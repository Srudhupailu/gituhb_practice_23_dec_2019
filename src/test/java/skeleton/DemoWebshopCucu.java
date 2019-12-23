package skeleton;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoWebshopCucu {
	WebDriver driver;
	
	@Given("user clicks on Login button")
	public void user_clicks_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    System.setProperty("webdriver.chrome.driver", "C:\\Shruthi\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com");
        driver.findElement(By.linkText("Log in")).click();
	}
	
	@When("the user gives valid credentials")
	public void the_user_gives_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		driver.findElement(By.id("Email")).sendKeys("karthik456@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("karthik456");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}

	@Then("user should be able to view the product details page")
	public void user_should_be_able_to_view_the_product_details_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String exp_title="Demo Web Shop";
		String act_title=driver.getTitle();
		if(exp_title.equals(act_title))
			System.out.println("The titles are matching");
		
		driver.close();
	}

}
