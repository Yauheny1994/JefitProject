package org.example.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CopyOfThreeDayPage extends BasePage{

    @FindBy(xpath = "//input[@value='Save To My Workouts']")
    private WebElement buttonSaveToMyWorkout;

    public WebElement getButtonSaveToMyWorkout() {
        return buttonSaveToMyWorkout;
    }

    public void clickButtonSaveToMyWorkout() {
        log.info("Click button 'Save To My Workout' on 'Copy Of Three Day' page");
        buttonSaveToMyWorkout.click();
    }
}
