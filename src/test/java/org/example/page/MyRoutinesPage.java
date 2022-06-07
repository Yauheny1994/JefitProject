package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyRoutinesPage extends BasePage {

    @FindBy(xpath = "//a[@href='./routine-manager.php']")
    private WebElement tabRoutineManager;

    @FindBy(xpath = "//a[@href='?action=create']")
    private WebElement buttonCreateNewRoutine;

    @FindBy(xpath = "//a[contains(text(),'Download A Routine')]")
    private WebElement buttonDownloadARoutine;

    @FindBy(xpath = "//strong[contains(text(),'Three Day Split')]")
    private WebElement nameOfDownloadedRoutine;

    public MyRoutinesPage clickTabRoutineManager() {
        tabRoutineManager.click();
        return this;
    }

    public WebElement getTabRoutineManager() {
        return tabRoutineManager;
    }

    public void clickButtonCreateNewAccount() {
        buttonCreateNewRoutine.click();
    }

    public WebElement getButtonDownloadARoutine() {
        return buttonDownloadARoutine;
    }

    public WebElement getNameOfDownloadedRoutine() {
        return nameOfDownloadedRoutine;
    }
}

