package com.example.form;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        // Open a sample page with a prompt alert
        driver.get("https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");
        driver.findElement(By.xpath("//*[@id=\"a-link-that-opens-a-new-window\"]")).click();
        String w = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for(String s : windows) {
        	driver.switchTo().window(s);
        	WebElement ele = driver.findElement(By.xpath("/html/body/div"));
        	System.out.println("New Tab:" + ele.getText());
        }
        driver.switchTo().window(w);
        WebElement ele_frame = driver.findElement(By.name("myframe"));
        driver.switchTo().frame(ele_frame);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        WebElement ele1 = driver.findElement(By.xpath("/html/body/div")); 
        
    	System.out.println("Main tab: " + ele1.getText());
	}

}
