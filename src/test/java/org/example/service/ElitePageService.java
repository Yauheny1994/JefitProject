package org.example.service;

import org.example.driver.DriverSingleton;
import org.example.page.ElitePage;
import org.example.page.MyJefitPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElitePageService extends LoginPageService{

    private WebDriver driver = DriverSingleton.getInstance().getDriver();

    private ElitePage elitePage = new ElitePage();
    private LoginPageService loginPageService = new LoginPageService();
    private MyJefitPage myJefitPage = new MyJefitPage();

    public ElitePageService goToElitePage() {
        loginPageService.login();
        myJefitPage.clickButtonGetElite();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(elitePage.getWelcomeMassageOnTheElitePage()));
        return this;
    }

    public String getWelcomeMassageOnTheElitePage() {
        String welcomeMassageOnTheElitePAage = elitePage.getWelcomeMassageOnTheElitePage().getText();
        return welcomeMassageOnTheElitePAage;
    }

    public void getEliteForOneMonth() {
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
        elitePage.clickButtonGetEliteNow();
        elitePage.getButtonOneMonth().click();
    }

    public String getNameOfPlan() {
        String nameOfPlan = elitePage.getFieldOfPlan().getText();
        return nameOfPlan;
    }
}
