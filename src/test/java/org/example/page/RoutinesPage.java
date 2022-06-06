package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoutinesPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Three Day Split')]")
    private WebElement firstNameOfPlan;

    public void clickFirstNameOfPlan() {
        firstNameOfPlan.click();
    }
}



