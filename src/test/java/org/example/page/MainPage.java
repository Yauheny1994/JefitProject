package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//a[@class='raven-button raven-button-link']")
    private WebElement buttonSingUp;

    public MainPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public void clickButtonSingUp() {
        buttonSingUp.click();
    }

}
