package org.example.service;

import org.example.page.MyJefitPage;

public class MyJefitPageService extends LoginPageService {

    MyJefitPage myJefitPage = new MyJefitPage();
    LoginPageService loginPageService = new LoginPageService();

    public static final String STATUS = "Hello weaklings";

    @Override
    public void login() {
        super.login();
    }

    public void goMyRoutinePage() {
        myJefitPage.goMyRoutinesPage();
    }

    public void sendStatus() {
        loginPageService.login();
        myJefitPage.getStatusField().sendKeys(STATUS);
        myJefitPage.clickButtonPost();
        myJefitPage.refreshPage();
    }

    public String getStatus() {
        return myJefitPage.getStatus().getText();
    }

}
