package com.example.form;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        // Open a sample page with a prompt alert
        driver.get("https://www.selenium.dev/selenium/web/dragAndDropTest.html");
        WebElement srcEle = driver.findElement(By.id("test1"));
        WebElement targetEle = driver.findElement(By.id("test3"));
        Actions a = new Actions(driver);
        a.dragAndDrop(srcEle, targetEle).build().perform();
        
      

	}

}
