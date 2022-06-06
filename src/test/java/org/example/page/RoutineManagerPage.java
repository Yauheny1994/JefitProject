package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoutineManagerPage extends BasePage {

    @FindBy(xpath = "//input[@name='rpname']")
    private WebElement fieldRoutineName;

    @FindBy(xpath = "//input[@class='statusblueButton']")
    private WebElement buttonSaveRoutine;

    @FindBy(xpath = "//strong[contains(text(),'FirstRoutine')]")
    private WebElement nameOfCreatedRoutine;


    public WebElement getFieldRoutineName() {
        return fieldRoutineName;
    }

    public void clickButtonSaveRoutine() {
        buttonSaveRoutine.click();
    }

    public WebElement getNameOfRoutine() {
        return nameOfCreatedRoutine;
    }
    }

