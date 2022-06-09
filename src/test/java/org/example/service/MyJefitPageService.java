package org.example.service;

import lombok.extern.log4j.Log4j2;
import org.example.driver.DriverSingleton;
import org.example.page.MyJefitPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2

public class MyJefitPageService {

    private MyJefitPage myJefitPage = new MyJefitPage();
    private LoginPageService loginPageService = new LoginPageService();

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    public void goMyRoutinePage() {
        log.info("open 'Routine' page");
        myJefitPage.goMyRoutinesPage();
    }

    public void sendStatus() {
        log.info("login");
        loginPageService.login();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(myJefitPage.getStatusField()));
        log.info("write status");
        myJefitPage.writeStatus()
                   .clickButtonPost()
                   .refreshPage();
    }

    public String getStatus() {
        log.info("get 'Status'");
        return myJefitPage.getStatus().getText();
    }

    public void goToPageLatestBodyStats() {
        log.info("login");
        loginPageService.login();
        log.info("click button 'Body Stats'");
        myJefitPage.getButtonBodyStats().click();
    }

    public String getLinkOnThePageLatestBodyStats() {
        log.info("get name 'Body Stats'");
        return myJefitPage.getLinkLatestBodyStats().getText();
    }
}
