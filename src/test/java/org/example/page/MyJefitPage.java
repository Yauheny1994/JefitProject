package org.example.page;

import io.qameta.allure.Step;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Log4j2
public class MyJefitPage extends BasePage {

    private static final String URL_MY_JEFIT_PAGE = "https://www.jefit.com/my-jefit/";
    private static final String STATUS = "Hello";

    @FindBy(xpath = "//a[@class='selected']")
    private WebElement buttonHome;

    @FindBy(xpath = "//a[@href='stats.php']")
    private WebElement buttonBodyStats;

    @FindBy(xpath = "//a[contains(text(),'My Routines')]")
    private WebElement buttonMyRoutines;

    @FindBy(xpath = "//textarea[@id='statusinputbox']")
    private WebElement statusField;

    @FindBy(xpath = "//input[@value='Post']")
    private WebElement buttonPost;

    @FindBy(xpath = "//div[@class='col-11 pl-0 mx-0']")
    private WebElement status;

    @FindBy(xpath = "//a[@class='raven-button raven-button-link']")
    private WebElement buttonGetElite;

    @FindBy(xpath = "//div[contains(text(),'Latest Body Stats')]")
    private WebElement linkLatestBodyStats;


    @Step("Click link 'My routines Page' on 'My Jefit' page")
    public void openMyRoutinesPage() {
        waitElementToBeClickable(buttonMyRoutines);
        buttonMyRoutines.click();
    }

    @Step("Write status in field 'STATUS'")
    public MyJefitPage writeStatus() {
        log.info("write status in field 'STATUS'");
        waitVisibilityOf(statusField);
        statusField.sendKeys(STATUS);
        return this;
    }

    @Step("Click button 'Post'")
    public MyJefitPage clickButtonPost() {
        log.info("click button 'Post'");
        waitElementToBeClickable(buttonPost);
        buttonPost.click();
        return this;
    }

    @Step("Open 'My Jefit' page")
    public void refreshPage() {
        driver.get(URL_MY_JEFIT_PAGE);
    }

    @Step("Click button 'Get Elite'")
    public void clickButtonGetElite() {
        log.info("click button 'Get Elite'");
        waitElementToBeClickable(buttonGetElite);
        buttonGetElite.click();
    }

    @Step("Click button 'Body Stats'")
    public void clickButtonBodyStats() {
        log.info("click button 'Body Stats'");
        waitElementToBeClickable(buttonBodyStats);
        buttonBodyStats.click();
    }

    @Step("Get button 'Home' after successful login on 'My Jefit' page")
    public String getTextHome() {
        waitVisibilityOf(buttonHome);
        return buttonHome.getText();
    }

    @Step("Get 'Status'")
    public String getStatusText() {
        waitVisibilityOf(status);
        return status.getText();
    }

    @Step("Get name 'Body Stats'")
    public String getTextLinkOnThePageLatestBodyStats() {
        waitVisibilityOf(linkLatestBodyStats);
        return linkLatestBodyStats.getText();
    }
}
