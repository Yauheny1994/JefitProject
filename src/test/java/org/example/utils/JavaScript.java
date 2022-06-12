package org.example.utils;

import org.example.driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScript {

    private final WebDriver driver = DriverSingleton.getInstance().getDriver();

    public void scrollToTheMiddleOfThePage() {
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
    }

    public void scrollDownThePage() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollToTheElementOnRoutinePage() {
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,130)", "");
    }
}
