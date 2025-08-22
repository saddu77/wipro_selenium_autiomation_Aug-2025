package com.example.form;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        

	        // Open a sample page with a prompt alert
	        driver.get("https://jqueryui.com/datepicker/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

	       
	        
	        WebElement ele_frame = driver.findElement(By.className("demo-frame"));
	        driver.switchTo().frame(ele_frame);
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	        WebElement dt_ele = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
	        dt_ele.click();
	        
	        WebElement dt = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a"));
	        dt.click();
		    
		    System.out.println("Date : " + dt.getText());
		    
		    

	}

}
