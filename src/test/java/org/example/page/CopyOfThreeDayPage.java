package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CopyOfThreeDayPage extends BasePage{

    @FindBy(xpath = "//input[@value='Save To My Workouts']")
    private WebElement buttonSaveToMyWorkout;

    public void clickButtonSaveToMyWorkout() {
        buttonSaveToMyWorkout.click();
    }
}
