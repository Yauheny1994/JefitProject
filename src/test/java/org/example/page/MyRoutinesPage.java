package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyRoutinesPage extends BasePage{

    @FindBy(xpath = "//a[@href='./routine-manager.php']")
    private WebElement tabRoutineManager;

    @FindBy(xpath = "//a[@href='?action=create']")
    private WebElement buttonCreateNewRoutine;

    public WebElement getTabRoutineManager() {
        return tabRoutineManager;
    }

    public MyRoutinesPage clickTabRoutineManager() {
        tabRoutineManager.click();
        return this;
    }

    public void clickButtonCreateNewAccount() {
        buttonCreateNewRoutine.click();
    }
}
