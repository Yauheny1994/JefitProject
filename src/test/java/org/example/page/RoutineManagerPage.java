package org.example.page;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Log4j2
public class RoutineManagerPage extends BasePage {

    @FindBy(xpath = "//input[@name='rpname']")
    private WebElement fieldRoutineName;

    @FindBy(xpath = "//input[@class='statusblueButton']")
    private WebElement buttonSaveRoutine;

    @FindBy(xpath = "//strong[contains(text(),'FirstRoutine')]")
    private WebElement nameOfCreatedRoutine;

    public void clickButtonSaveRoutine() {
        log.info("click button 'Save Routine'");
        buttonSaveRoutine.click();
    }
}

