package v1;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 

public class AppTest {
//	WebDriver driver;
//	 String res;
//	 private static final Logger log = LogManager.getLogger(AppTest.class); 
//
//	
//	@BeforeTest
//	public void init(){
//		log.info("Starting login test - init()");
//		driver = new ChromeDriver();
//		driver.get("https://www.calculator.net");
//		log.info("Navigated to application"); 
//	     driver.manage().timeouts().
//	     implicitlyWait(Duration.ofMillis(500));
//	     
//	}
//	
//	@Test
//	public void firstTest(){
//		 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
//	     driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
//	     driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
//	     res = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
//	}
//	
//
//	
//	@AfterTest
//	public void tearDown(){
//		System.out.println("Result is: " + res);
//	     
//	     if(res.trim().equals("10")) {
//	    	 System.out.println("Pass");
//	     }else {
//	    	 System.out.println("Fail");
//	     }
//	     
//	     driver.quit();
//	     System.out.println("Closed Browser...");
//	      
//	     log.info("Test completed"); 
//	}
}
