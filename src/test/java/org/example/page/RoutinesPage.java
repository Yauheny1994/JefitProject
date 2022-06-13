package org.example.page;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class RoutinesPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'My Custom Routine')]")
    private WebElement nameOfPlan;

    @Step("Click 'Name of plan'")
    public void clickNameOfPlan() {
        log.info("click 'Name of plan'");
        nameOfPlan.click();
    }
}



