package com.example.alerts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"alert\"]"));
		ele.click();
		Alert al = driver.switchTo().alert();
		al.accept();
//		al.dismiss();
//		ele.click();
	}

}
