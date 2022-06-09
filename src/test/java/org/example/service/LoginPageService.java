package org.example.service;

import lombok.extern.log4j.Log4j2;
import org.example.model.User;
import org.example.page.LoginPage;
import org.example.page.MyJefitPage;

@Log4j2

public class LoginPageService {

    public static final String URL_LOGIN_PAGE = "https://www.jefit.com/login/";

    private User user = new User();
    private LoginPage loginPage = new LoginPage();
    private MyJefitPage myJefitPage = new MyJefitPage();

    public void logInWithOutUsername() {
        log.info("fill field password on 'Login' page");
        loginPage.openPage(URL_LOGIN_PAGE)
                 .clearFieldUserName()
                 .fillPassword(user.getPassword())
                 .clickButtonLogin();
    }

    public void logInWithOutEmailAddress() {
        log.info("fill field password on 'Login' page");
        loginPage.openPage(URL_LOGIN_PAGE)
                 .clearFieldEmailAddress()
                 .fillPassword(user.getPassword())
                 .clickButtonLogin();
    }

    public void logInWithOutPassword() {
        log.info("fill field username on 'Login' page");
        loginPage.openPage(URL_LOGIN_PAGE)
                 .fillUserNameField(user.getUserName())
                 .clearFieldPassword()
                 .clickButtonLogin();
    }

    public void login() {
        log.info("fill all field on 'Login' page and click button 'Login'");
        loginPage.openPage(URL_LOGIN_PAGE)
                 .clearFieldUserName()
                 .fillUserNameField(user.getUserName())
                 .fillPassword(user.getPassword())
                 .clickButtonLogin();
    }

    public String getInvalidMessage() {
        log.info("get 'Invalid Message'");
        return loginPage.getInvalidMessage().getText();
    }

    public String getButtonHome() {
        log.info("get button 'Home' after successful login on 'My Jefit' page");
        return myJefitPage.getButtonHome().getText();
    }
}
