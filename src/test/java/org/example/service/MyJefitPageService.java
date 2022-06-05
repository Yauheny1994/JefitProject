package org.example.service;

import org.example.driver.DriverSingleton;
import org.example.page.MyJefitPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyJefitPageService {

    MyJefitPage myJefitPage = new MyJefitPage();
    LoginPageService loginPageService = new LoginPageService();

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    public void goMyRoutinePage() {
        myJefitPage.goMyRoutinesPage();
    }

    public void sendStatus() {
        loginPageService.login();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(myJefitPage.getStatusField()));
        myJefitPage.writeStatus()
                   .clickButtonPost()
                   .refreshPage();
    }

    public String getStatus() {
        return myJefitPage.getStatus().getText();
    }

}
