package org.example.service;

import org.example.driver.DriverSingleton;
import org.example.page.ElitePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElitePageService extends LoginPageService{

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    ElitePage elitePage = new ElitePage();
    LoginPageService loginPageService = new LoginPageService();

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
}
