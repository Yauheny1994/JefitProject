package org.example.page;

import io.qameta.allure.Step;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Log4j2
public class RoutineManagerPage extends BasePage {

    private static final String NAME_OF_CREATED_ROUTINE = "FirstRoutine";

    @FindBy(xpath = "//input[@name='rpname']")
    private WebElement fieldRoutineName;

    @FindBy(xpath = "//input[@class='statusblueButton']")
    private WebElement buttonSaveRoutine;

    @FindBy(xpath = "//strong[contains(text(),'FirstRoutine')]")
    private WebElement nameOfCreatedRoutine;

    @Step("Fill name of created routine")
    public void fillNameOFCreatedRoutine() {
        fieldRoutineName.sendKeys(NAME_OF_CREATED_ROUTINE);
    }

    @Step("Click button 'Save Routine")
    public void clickButtonSaveRoutine() {
        waitElementToBeClickable(buttonSaveRoutine);
        buttonSaveRoutine.click();
    }

    @Step("Get name of Routine")
    public String getNameOfCreatedRoutine() {
        return nameOfCreatedRoutine.getText();
    }
}

