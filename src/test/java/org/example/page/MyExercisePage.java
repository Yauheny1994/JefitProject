package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyExercisePage extends BasePage{

    @FindBy(xpath = "//input[@id='newename']")
    private WebElement fieldExerciseName;

    @FindBy(xpath = "//input[@id='newename']")
    private WebElement buttonCreateExercise;

}
