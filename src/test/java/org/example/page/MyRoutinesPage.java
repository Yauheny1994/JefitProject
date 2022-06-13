package org.example.page;

import io.qameta.allure.Step;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Log4j2
public class MyRoutinesPage extends BasePage {

    @FindBy(xpath = "//a[@href='./routine-manager.php']")
    private WebElement tabRoutineManager;

    @FindBy(xpath = "//a[@href='?action=create']")
    private WebElement buttonCreateNewRoutine;

    @FindBy(xpath = "//a[contains(text(),'Download A Routine')]")
    private WebElement buttonDownloadARoutine;

    @FindBy(xpath = "//strong[contains(text(),'My Custom Routine')]")
    private WebElement nameOfDownloadedRoutine;


    @Step("Click 'Routine Manage' link")
    public MyRoutinesPage clickLinkRoutineManager() {
        log.info("click 'Routine Manage' link");
        waitElementToBeClickable(tabRoutineManager);
        tabRoutineManager.click();
        return this;
    }

    @Step("Click button 'Create new account'")
    public void clickButtonCreateNewAccount() {
        log.info("click button 'Create new account'");
        waitElementToBeClickable(buttonCreateNewRoutine);
        buttonCreateNewRoutine.click();
    }

    @Step("Click button 'Download a routine'")
    public void clickButtonDownloadARoutine() {
        log.info("click button 'Download a routine'");
        waitElementToBeClickable(buttonDownloadARoutine);
        buttonDownloadARoutine.click();
    }

    @Step("Get name of downloaded routine")
    public String getNameOfDownloadedRoutine() {
        log.info("get name of downloaded routine");
        waitVisibilityOf(nameOfDownloadedRoutine);
        return nameOfDownloadedRoutine.getText();
    }
}

