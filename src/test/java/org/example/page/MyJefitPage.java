package org.example.page;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Log4j2
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


    public void goMyRoutinesPage() {
        log.info("click link 'My routines Page' on 'My Jefit' page");
        buttonMyRoutines.click();
    }

    public MyJefitPage writeStatus() {
        log.info("write status in field 'STATUS'");
        statusField.sendKeys(STATUS);
        return this;
    }

    public MyJefitPage clickButtonPost() {
        log.info("click button 'Post'");
        buttonPost.click();
        return this;
    }

    public void refreshPage() {
        log.info("open 'My Jefit' page");
        driver.get(URL_MY_JEFIT_PAGE);
    }

    public void clickButtonGetElite() {
        log.info("click button 'Get Elite'");
        buttonGetElite.click();
    }
}
