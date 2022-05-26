package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {

    @FindBy(xpath = "//h1[@style='font-size:34px; line-height:1; color: #333; font-weight: bold;']")
    private WebElement welcomeMessage;

    @FindBy(xpath = "//*[contains(text(),'Your Profile')]")
    private WebElement enterInProfile;

    public WebElement getEnterInProfile() {
        return enterInProfile;
    }

    public WebElement getWelcomeMessage() {
        return welcomeMessage;
    }
}
