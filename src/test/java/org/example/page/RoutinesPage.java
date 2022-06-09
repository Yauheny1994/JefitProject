package org.example.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class RoutinesPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Machine Leg Program')]")
    private WebElement firstNameOfPlan;

    public void clickNameOfPlan() {
        log.info("click 'Name of plan'");
        firstNameOfPlan.click();
    }
}



