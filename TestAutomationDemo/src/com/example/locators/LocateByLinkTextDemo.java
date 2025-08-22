package com.example.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkTextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.selenium.dev/selenium/web/web-form.html");       

	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	     
	     
	     WebElement linkText = driver.findElement(By.linkText("Return to index"));
	     linkText.click();

	}

}
