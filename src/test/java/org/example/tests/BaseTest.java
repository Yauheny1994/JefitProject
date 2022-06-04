package org.example.tests;

import org.example.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void startBrowser() {
        driver = DriverSingleton.getInstance().getDriver();
    }

    @AfterTest
    public void stopBrowser() {
        DriverSingleton.getInstance().closeDriver();
    }
}