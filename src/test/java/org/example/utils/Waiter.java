package org.example.utils;

import org.example.driver.DriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {

    private final static int WAIT_TIMEOUT_SECONDS = 5;

    public void  waitVisibilityOf(WebElement element) {
        new WebDriverWait(DriverSingleton.getInstance().getDriver(), Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions.visibilityOf(element));
    }
}
