package cucumberJava; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
//import cucumber.annotation.en.Given; 
//import cucumber.annotation.en.Then; 
//import cucumber.annotation.en.When; 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class cucumberJava { 
	
   WebDriver driver = null; 

   @Given("^I have open the browser$") 
   public void openBrowser() { 
	System.setProperty("webdriver.gecko.driver", "C://Users//User//Desktop//Selenium Training//libs//geckodriver-v0.34.0-win64//geckodriver.exe");

      driver = new FirefoxDriver(); 
   } 
	
   @When("^I open Facebook website$") 
   public void goToFacebook() { 
      driver.navigate().to("https://www.facebook.com/");
      
   } 
	
   @Then("^Login button should exits$") 
   public void loginButton() { 
      if(driver.findElement(By.id("u_0_v")).isEnabled()) { 
         System.out.println("Test 1 Pass"); 
      } else { 
         System.out.println("Test 1 Fail"); 
      } 
      driver.close(); 
   } 
}