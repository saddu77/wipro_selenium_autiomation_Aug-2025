package com.example.alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to your ChromeDriver
//        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        // Open a sample page with a prompt alert
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click on the button that triggers a JS prompt
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        // Switch to alert
        Alert promptAlert = driver.switchTo().alert();

        // Send text to the prompt
        promptAlert.sendKeys("Hello from Selenium!");

        // Accept the prompt
        promptAlert.accept();

        // Pause to see result
        Thread.sleep(2000);

        // Close browser
//        driver.quit();
    }
}

