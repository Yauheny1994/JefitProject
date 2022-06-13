package org.example.service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.example.page.MyJefitPage;
import org.example.utils.Waiter;


@Log4j2

public class MyJefitPageService {

    private final MyJefitPage myJefitPage = new MyJefitPage();
    private final LoginPageService loginPageService = new LoginPageService();
    private final Waiter waiter = new Waiter();

    @Step("Open 'Routine' page")
    public void openMyRoutinePage() {
        log.info("open 'Routine' page");
        myJefitPage.openMyRoutinesPage();
    }

    @Step("Send status")
    public void sendStatus() {
        log.info("login");
        loginPageService.login();
        log.info("wait element status field");
        waiter.waitVisibilityOf(myJefitPage.getStatusField());
        log.info("write status");
        myJefitPage.writeStatus()
                   .clickButtonPost()
                   .refreshPage();
    }

    @Step("Get status")
    public String getStatus() {
        log.info("get 'Status'");
        return myJefitPage.getStatusText();
    }

    @Step("Open page latest body stats")
    public void openPageLatestBodyStats() {
        log.info("login");
        loginPageService.login();
        log.info("click button 'Body Stats'");
        myJefitPage.clickButtonBodyStats();
    }

    @Step("Get link latest body stats")
    public String getLinkOnThePageLatestBodyStats() {
        log.info("get name 'Body Stats'");
        return myJefitPage.getTextLinkOnThePageLatestBodyStats();
    }
}
