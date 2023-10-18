package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fbloginn {
	WebDriver driver;

    @Given("user on the login page")
    public void user_on_the_login_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
   
}
    @When("user enter the login page")
    public void user_enter_the_login_page() {
    	driver = new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    }
		@Given("user enter valid username")
		public void user_enter_valid_username(){
			WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
			username.sendKeys("filda@gmail.com");
			
		   }

		@Given("user enter valid password")
		public void user_enter_valid_password() {
			WebElement password = driver.findElement(By.name("pass"));
			password.sendKeys("fildapass");
		}

		@Then("user click on login button and login should be successful")
		public void user_click_on_login_button_and_login_should_be_successful() {
			WebElement login = driver.findElement(By.name("login"));
			login.click();
		    
		}
		

}
