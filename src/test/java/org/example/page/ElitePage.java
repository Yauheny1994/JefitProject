package org.example.page;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Log4j2
public class ElitePage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Plans that suit you best')]")
    private WebElement welcomeMassageOnTheElitePage;

    @FindBy(xpath = "//a[contains(text(),'Get Elite now')]")
    private WebElement buttonGetEliteNow;

    @FindBy(xpath = "//label[@onclick=\"changeonclick('0')\"]")
    private WebElement buttonOneMonth;

    @FindBy(xpath = "//div[@id='cont']")
    private WebElement fieldOfPlan;


    public String getWelcomeMassageOnElitePage() {
        log.info("get text welcome message on 'Elite' page");
        return welcomeMassageOnTheElitePage.getText();
    }

    public void clickButtonGetEliteNow() {
        log.info("Click button 'Get Elite Now' on 'Elite' page");
        buttonGetEliteNow.click();
    }

    public void clickButtonOneMonth() {
        log.info("Click button 'One Month' on 'Elite' page");
        buttonOneMonth.click();
    }

    public String getNameOfPlan() {
        log.info("get 'Name of Plan'");
        return fieldOfPlan.getText();
    }
}
