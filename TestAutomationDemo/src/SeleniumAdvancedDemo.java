import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class SeleniumAdvancedDemo {
    public static void main(String[] args) {
        // Set path to chromedriver if not set in system environment
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // =============================
            // 1. Handling Alert Box
            // =============================
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert text: " + alert.getText());
            alert.accept();

            // =============================
            // 2. Handling Datepicker
            // =============================
            driver.get("https://jqueryui.com/datepicker/");
            driver.switchTo().frame(0); // datepicker is inside iframe
            WebElement dateBox = driver.findElement(By.id("datepicker"));
            dateBox.click();
            driver.findElement(By.xpath("//a[text()='15']")).click();
            driver.switchTo().defaultContent();

            // =============================
            // 3. Handling Multiple Windows/Tabs
            // =============================
            driver.get("https://the-internet.herokuapp.com/windows");
            String parent = driver.getWindowHandle();
            driver.findElement(By.linkText("Click Here")).click();

            Set<String> allWindows = driver.getWindowHandles();
            for (String win : allWindows) {
                driver.switchTo().window(win);
                if (!win.equals(parent)) {
                    System.out.println("Switched to new tab: " + driver.getTitle());
                    driver.close();
                }
            }
            driver.switchTo().window(parent);

            // =============================
            // 4. Drag and Drop
            // =============================
            driver.get("https://the-internet.herokuapp.com/drag_and_drop");
            WebElement source = driver.findElement(By.id("column-a"));
            WebElement target = driver.findElement(By.id("column-b"));
            Actions act = new Actions(driver);
            act.dragAndDrop(source, target).perform();

            // =============================
            // 5. Handling Iframes
            // =============================
            driver.get("https://the-internet.herokuapp.com/iframe");
            driver.switchTo().frame("mce_0_ifr");
            WebElement editor = driver.findElement(By.id("tinymce"));
            editor.clear();
            editor.sendKeys("Hello, inside iframe!");
            driver.switchTo().defaultContent();

            // =============================
            // 6. Handling Dynamic Objects
            // =============================
            driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
            driver.findElement(By.cssSelector("#start button")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement helloText = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("finish"))
            );
            System.out.println("Dynamic text: " + helloText.getText());

            // =============================
            // 7. Working with WebTable
            // =============================
            driver.get("https://the-internet.herokuapp.com/tables");
            WebElement table = driver.findElement(By.id("table1"));
            List<WebElement> rows = table.findElements(By.tagName("tr"));
            for (WebElement row : rows) {
                List<WebElement> cols = row.findElements(By.tagName("td"));
                for (WebElement col : cols) {
                    System.out.print(col.getText() + " | ");
                }
                System.out.println();
            }

            // =============================
            // 8. Synchronization Examples
            // =============================
            driver.get("https://the-internet.herokuapp.com/dynamic_controls");

            // Thread.sleep (not recommended)
            driver.findElement(By.xpath("//button[text()='Remove']")).click();
            Thread.sleep(2000);

            // Implicit Wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.id("message"));

            // Explicit Wait
            driver.findElement(By.xpath("//button[text()='Add']")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

            // Fluent Wait
            Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(15))
                    .pollingEvery(Duration.ofSeconds(2))
                    .ignoring(NoSuchElementException.class);

            WebElement msg = fluentWait.until(d -> d.findElement(By.id("message")));
            System.out.println("Fluent Wait message: " + msg.getText());

        } catch (Exception e) {
            System.out.println("⚠️ Exception occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
