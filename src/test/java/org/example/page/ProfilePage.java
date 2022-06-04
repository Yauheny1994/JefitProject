package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {

    @FindBy(xpath = "//a[@class='selected']")
    private WebElement enterInProfile;

    public WebElement getEnterInProfile() {
        return enterInProfile;
    }

}
