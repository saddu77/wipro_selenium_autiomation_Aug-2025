package com.example.support;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverManager {
    public final WebDriver driver;

    public DriverManager() {
        ChromeOptions options = new ChromeOptions();

        // Run in headless mode if -Dheadless=true is passed
        if ("true".equalsIgnoreCase(System.getProperty("headless", "false"))) {
            options.addArguments("--headless=new");
        }

        // Selenium Manager (built-in) will download the right ChromeDriver
        this.driver = new ChromeDriver(options);
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        this.driver.manage().window().setSize(new Dimension(1280, 900));
    }
}

