package org.example.service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.example.page.ElitePage;
import org.example.page.MyJefitPage;
import org.example.utils.JavaScript;

@Log4j2

public class ElitePageService extends LoginPageService{

    private final ElitePage elitePage = new ElitePage();
    private final LoginPageService loginPageService = new LoginPageService();
    private final MyJefitPage myJefitPage = new MyJefitPage();
    private final JavaScript javaScript = new JavaScript();
//    private final Waiter waiter = new Waiter();

    @Step("Open to Elite page")
    public void openElitePage() {
        log.info("Login");
        loginPageService.login();
        log.info("click button 'Get Elite'");
        myJefitPage.clickButtonGetElite();
    }

    @Step("Get text welcome message on 'Elite' page")
    public String getWelcomeMassageOnElitePage() {
        log.info("get text welcome message on 'Elite' page");
        return elitePage.getWelcomeMessageOnElitePage();
    }

    @Step("Get elite for one month")
    public void getEliteForOneMonth() {
        log.info("scroll down on 'Elite' page");
        javaScript.scrollToTheMiddleOfThePage();
        log.info("click button 'Get Elite Now'");
        elitePage.clickButtonGetEliteNow();
        log.info("click button 'One month'");
        elitePage.clickButtonOneMonth();
    }

    @Step("Get 'Name of Plan'")
    public String getNameOfPlan() {
        log.info("get 'Name of Plan'");
        return elitePage.getNameOfPlan();
    }
}
