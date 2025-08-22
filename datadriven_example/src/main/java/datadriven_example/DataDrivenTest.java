package datadriven_example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Workbook  wb = null;
        
        try {
			FileInputStream file = new FileInputStream(new File("TestData.xlsx"));
			wb = new XSSFWorkbook(file);
			Sheet sheet = wb.getSheetAt(0);
			
			for(int i = 1; i<= sheet.getLastRowNum();i++) {
				Row row = sheet.getRow(i);
				String username = row.getCell(0).getStringCellValue();
				String password = row.getCell(1).getStringCellValue();
				
				System.out.println(username + " " + password);
		        driver.get("https://practicetestautomation.com/practice-test-login/");
		        driver.findElement(By.id("username")).sendKeys(username);
		        driver.findElement(By.id("password")).sendKeys(password);
		        driver.findElement(By.id("submit")).click();
		        String currentUrl = driver.getCurrentUrl();
		        if(currentUrl.equals("https://practicetestautomation.com/logged-in-successfully/")) {
		        	System.out.println("Login success for : " + username);
		        } else {
		        	System.out.println("Login failed for: " + username);
		        }
		        
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.quit();
			wb.close();
		}

	}

}
