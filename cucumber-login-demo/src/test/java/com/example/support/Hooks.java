package com.example.support;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private final DriverManager dm;

    // PicoContainer will inject the same DriverManager into Steps and Hooks
    public Hooks(DriverManager dm) {
        this.dm = dm;
    }

    @Before
    public void beforeScenario() {
        // You could add logging, clean cookies, etc.
    }

    @After
    public void afterScenario() {
        if (dm != null && dm.driver != null) {
            dm.driver.quit();
        }
    }
}

