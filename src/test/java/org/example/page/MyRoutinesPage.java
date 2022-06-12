package org.example.page;

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

    public MyRoutinesPage clickLinkRoutineManager() {
        log.info("click 'Routine Manage' link");
        tabRoutineManager.click();
        return this;
    }

    public void clickButtonCreateNewAccount() {
        log.info("click button 'Create new account'");
        buttonCreateNewRoutine.click();
    }

    public void clickButtonDownloadARoutine() {
        log.info("click button 'Download a routine'");
        buttonDownloadARoutine.click();
    }

    public String getNameOfDownloadedRoutine() {
        log.info("get name of downloaded routine");
        return nameOfDownloadedRoutine.getText();
    }
}

