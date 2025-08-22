package com.example.form;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFormDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

	        // Open a sample page with a prompt alert
	        driver.get("https://www.selenium.dev/selenium/web/login.html");

	        // Click on the button that triggers a JS prompt
	        driver.findElement(By.xpath("//*[@id=\"username-field\"]")).sendKeys("admin");
	        driver.findElement(By.xpath("//*[@id=\"password-field\"]")).sendKeys("admin123");
	        driver.findElement(By.xpath("//*[@id=\"login-form-submit\"]")).click();
//	        driver.quit();

	}

}
