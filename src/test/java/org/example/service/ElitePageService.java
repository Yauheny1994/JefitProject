package org.example.service;

import lombok.extern.log4j.Log4j2;
import org.example.driver.DriverSingleton;
import org.example.page.ElitePage;
import org.example.page.MyJefitPage;
import org.example.utils.JavaScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log4j2

public class ElitePageService extends LoginPageService{

    private final WebDriver driver = DriverSingleton.getInstance().getDriver();
    private final ElitePage elitePage = new ElitePage();
    private final LoginPageService loginPageService = new LoginPageService();
    private final MyJefitPage myJefitPage = new MyJefitPage();
    private final JavaScript javaScript = new JavaScript();

    public void goToElitePage() {
        log.info("Login");
        loginPageService.login();
        log.info("click button 'Get Elite'");
        myJefitPage.clickButtonGetElite();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(elitePage.getWelcomeMassageOnTheElitePage()));
    }

    public String getWelcomeMassageOnElitePage() {
        log.info("get text welcome message on 'Elite' page");
        return elitePage.getWelcomeMassageOnElitePage();
    }

    public void getEliteForOneMonth() {
        log.info("scroll down on 'Elite' page");
        javaScript.scrollToTheMiddleOfThePage();
        log.info("click button 'Get Elite Now'");
        elitePage.clickButtonGetEliteNow();
        log.info("click button 'One month'");
        elitePage.clickButtonOneMonth();
    }

    public String getNameOfPlan() {
        log.info("get 'Name of Plan'");
        return elitePage.getNameOfPlan();
    }
}
