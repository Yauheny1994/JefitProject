package org.example.page;

import io.qameta.allure.Step;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Log4j2
public class ElitePage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Plans that suit you best')]")
    private WebElement welcomeMessageOnTheElitePage;

    @FindBy(xpath = "//a[contains(text(),'Get Elite now')]")
    private WebElement buttonGetEliteNow;

    @FindBy(xpath = "//label[@onclick=\"changeonclick('0')\"]")
    private WebElement buttonOneMonth;

    @FindBy(xpath = "//div[@id='cont']")
    private WebElement fieldOfPlan;


    @Step("Get welcome message om Elite page")
    public String getWelcomeMessageOnElitePage() {
        waitVisibilityOf(welcomeMessageOnTheElitePage);
        return welcomeMessageOnTheElitePage.getText();
    }

    @Step("Click button Get Elite Now")
    public void clickButtonGetEliteNow() {
        waitElementToBeClickable(buttonGetEliteNow);
        buttonGetEliteNow.click();
    }

    @Step("Click button one month")
    public void clickButtonOneMonth() {
        waitElementToBeClickable(buttonOneMonth);
        buttonOneMonth.click();
    }

    @Step("Get name of plan")
    public String getNameOfPlan() {
        return fieldOfPlan.getText();
    }
}
