package org.example.service;

import lombok.extern.log4j.Log4j2;
import org.example.driver.DriverSingleton;
import org.example.page.ElitePage;
import org.example.page.MyJefitPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2

public class ElitePageService extends LoginPageService{

    private WebDriver driver = DriverSingleton.getInstance().getDriver();

    private ElitePage elitePage = new ElitePage();
    private LoginPageService loginPageService = new LoginPageService();
    private MyJefitPage myJefitPage = new MyJefitPage();

    public ElitePageService goToElitePage() {
        log.info("Login");
        loginPageService.login();
        log.info("click button 'Get Elite'");
        myJefitPage.clickButtonGetElite();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(elitePage.getWelcomeMassageOnTheElitePage()));
        return this;
    }

    public String getWelcomeMassageOnElitePage() {
        log.info("get text welcome message on 'Elite' page");
        return elitePage.getWelcomeMassageOnTheElitePage().getText();
    }

    public void getEliteForOneMonth() {
        log.info("scroll down on 'Elite' page");
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
        log.info("click button 'Get Elite Now'");
        elitePage.clickButtonGetEliteNow();
        log.info("click button 'One month'");
        elitePage.getButtonOneMonth().click();
    }

    public String getNameOfPlan() {
        log.info("get 'Name of Plan'");
        return elitePage.getFieldOfPlan().getText();
    }
}
