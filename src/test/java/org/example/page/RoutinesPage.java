package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoutinesPage extends BasePage {

    @FindBy(xpath = "//a[@href=\"447435/copy-of-3-day-my-custom-routine\"]//div[contains(text(),'Copy of 3 Day')]")
    private WebElement firstNameOfPlan;

    public void clickFirstNameOfPlan() {
        firstNameOfPlan.click();
    }
}



