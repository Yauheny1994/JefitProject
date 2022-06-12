package org.example.service;

import lombok.extern.log4j.Log4j2;
import org.example.page.MyJefitPage;
import org.example.utils.Waiter;


@Log4j2

public class MyJefitPageService {

    private final MyJefitPage myJefitPage = new MyJefitPage();
    private final LoginPageService loginPageService = new LoginPageService();
    private final Waiter waiter = new Waiter();

    public void goMyRoutinePage() {
        log.info("open 'Routine' page");
        myJefitPage.goMyRoutinesPage();
    }

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

    public String getStatus() {
        log.info("get 'Status'");
        return myJefitPage.getStatusText();
    }

    public void goToPageLatestBodyStats() {
        log.info("login");
        loginPageService.login();
        log.info("click button 'Body Stats'");
        myJefitPage.clickButtonBodyStats();
    }

    public String getLinkOnThePageLatestBodyStats() {
        log.info("get name 'Body Stats'");
        return myJefitPage.getTextLinkOnThePageLatestBodyStats();
    }
}
