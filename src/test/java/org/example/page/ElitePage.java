package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ElitePage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Plans that suit you best')]")
    private WebElement welcomeMassageOnTheElitePage;

    @FindBy(xpath = "//a[contains(text(),'Get Elite now')]")
    private WebElement buttonGetEliteNow;


    @FindBy(xpath = "//label[@onclick=\"changeonclick('0')\"]")
    private WebElement buttonOneMonth;

    @FindBy(xpath = "//div[@id='cont']")
    private WebElement fieldOfPlan;

    public WebElement getButtonOneMonth() {
        return buttonOneMonth;
    }

    public WebElement getFieldOfPlan() {
        return fieldOfPlan;
    }

    public void clickButtonGetEliteNow() {
        buttonGetEliteNow.click();
    }

    public WebElement getWelcomeMassageOnTheElitePage() {
        return welcomeMassageOnTheElitePage;
    }
}
