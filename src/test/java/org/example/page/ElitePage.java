package org.example.page;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElitePage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Plans that suit you best')]")
    private WebElement welcomeMassageOnTheElitePage;

    public WebElement getWelcomeMassageOnTheElitePage() {
        return welcomeMassageOnTheElitePage;
    }
}
