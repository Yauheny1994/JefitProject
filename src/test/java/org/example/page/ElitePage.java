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

    public void clickButtonGetEliteNow() {
        log.info("Click button 'Get Elite Now' on 'Elite' page");
        buttonGetEliteNow.click();
    }
}
