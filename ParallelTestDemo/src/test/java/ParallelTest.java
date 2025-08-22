import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
	
	@Test(priority = 1)
	public void testChrome(){
		System.out.println("thread ID : " + Thread.currentThread().getId());
		driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        message.getText();

        driver.quit();
	}
	@Test(priority = 2)
	public void testfirefox(){
		System.out.println("thread ID : " + Thread.currentThread().getId());
		System.setProperty("webdriver.gecko.driver", "C://Users//User//Desktop//Selenium Training//libs//geckodriver-v0.34.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		try {
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			 
			Assert.assertEquals(driver.getTitle(), "Google"); 
			Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed()); 
			String pageTitle = driver.getTitle();
			System.out.println("Page Title after search: " + pageTitle);
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			driver.quit();
		}
	}
}
