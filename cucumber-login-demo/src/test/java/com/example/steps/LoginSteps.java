package com.example.steps;

import com.example.support.DriverManager;
import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {

    private final WebDriver driver;

    public LoginSteps(DriverManager dm) {
        this.driver = dm.driver;
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Public demo app with stable login flow
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String username, String password) {
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
        WebElement flash = driver.findElement(By.id("flash"));
        assertTrue(
            flash.getText().contains("You logged into a secure area!"),
            "Expected success message not found!"
        );
    }

    @When("I logout")
    public void i_logout() {
        // Logout button visible after successful login
        driver.findElement(By.cssSelector("a.button.secondary.radius")).click();
    }

    @Then("I should be back on the login page")
    public void i_should_be_back_on_the_login_page() {
        assertTrue(driver.getCurrentUrl().endsWith("/login"),
            "Expected to be back on the login page.");
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        WebElement flash = driver.findElement(By.id("flash"));
        // Site shows either invalid username or invalid password text
        boolean hasError = flash.getText().contains("Your username is invalid!")
                || flash.getText().contains("Your password is invalid!");
        assertTrue(hasError, "Expected error message not found!");
    }
}

