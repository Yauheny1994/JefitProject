package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyJefitPage extends BasePage {

    public static final String URL_MY_JEFIT_PAGE = "https://www.jefit.com/my-jefit/";
    public static final String STATUS = "Hello";

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

    @FindBy(xpath = "//a[@href='https://www.jefit.com/my-refit/my-exercises/']")
    private WebElement buttonMyCustomExercise;

    @FindBy(xpath = "//div[contains(text(),'Latest Body Stats')]")
    private WebElement linkLatestBodyStats;


    public WebElement getStatusField() {
        return statusField;
    }

    public WebElement getButtonBodyStats() {
        return buttonBodyStats;
    }

    public WebElement getButtonHome() {
        return buttonHome;
    }

    public WebElement getButtonMyRoutines() {
        return buttonMyRoutines;
    }

    public WebElement getButtonMyCustomExercise() {
        return buttonMyCustomExercise;
    }

    public void goMyRoutinesPage() {
        buttonMyRoutines.click();
    }

    public MyJefitPage writeStatus() {
        statusField.sendKeys(STATUS);
        return this;
    }

    public MyJefitPage clickButtonPost() {
        buttonPost.click();
        return this;
    }

    public WebElement getStatus() {
        return status;
    }

    public void refreshPage() {
        driver.get(URL_MY_JEFIT_PAGE);
    }

    public void clickButtonGetElite() {
        buttonGetElite.click();
    }

    public WebElement getLinkLatestBodyStats() {
        return linkLatestBodyStats;
    }

}
