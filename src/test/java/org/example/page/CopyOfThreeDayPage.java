package org.example.page;

import io.qameta.allure.Step;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
@Getter
public class CopyOfThreeDayPage extends BasePage{

    @FindBy(xpath = "//input[@value='Save To My Workouts']")
    private WebElement buttonSaveToMyWorkout;

    @Step("Click button save to My Workout")
    public void clickButtonSaveToMyWorkout() {
        log.info("Click button 'Save To My Workout' on 'Copy Of Three Day' page");
        waitElementToBeClickable(buttonSaveToMyWorkout);
        buttonSaveToMyWorkout.click();
    }
}
