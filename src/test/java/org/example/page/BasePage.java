package org.example.page;

import org.example.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

     BasePage() {
        PageFactory.initElements(driver, this);
    }

}
