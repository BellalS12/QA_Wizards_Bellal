package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginLogOutFunction {
	WebDriver driver;
	String username = "test@gmail.com";
	String password ="test@123";
	
	@Given("User is in home space page")
	public void User_is_in_home_space_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\beelv\\Desktop\\Drivers\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://transfotechacademy.com/");
	  
	}

	@And("clicks log in button")
	public void clicks_log_in_button() {
		driver.findElement(By.xpath(" (//div[@class=\"login-register\"])[2]")).click();
	  
	}

	@When("User enters valid user name and password")
	public void User_enters_valid_user_name_and_password() {
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		
	}
	
	@And("Clicks login button")
	public void Clicks_login_buton() {
		driver.findElement(By.xpath("(//*[@type=\"submit\"])[2]")).click();
		driver.close();
	}
	   


    @And("Closes Browser")
	public void Closes_Browser() {
    	
		
	}
	  

	@Then("User should be logged out")
	public void User_should_be_logged_out() {
		
		
	
	   
	}
	
}

