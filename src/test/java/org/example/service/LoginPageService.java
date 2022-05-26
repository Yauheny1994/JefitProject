package org.example.service;

import org.example.model.CreatedUser;
import org.example.page.LoginPage;

public class LoginPageService {

    public static final String URL_LOGIN_PAGE = "https://www.jefit.com/login/";

    CreatedUser createdUser = new CreatedUser();
    LoginPage loginPage = new LoginPage();

    public LoginPage logInWithOutUsername() {
        loginPage.openPage(URL_LOGIN_PAGE)
                .clearFieldUserName()
                .fillPassword(createdUser.getPassword())
                .getButtonLogIn().click();
        return new LoginPage();
    }

    public LoginPage logInWithOutEmailAddress() {
        loginPage.openPage(URL_LOGIN_PAGE)
                .clearFieldEmailAddress()
                .fillPassword(createdUser.getPassword())
                .getButtonLogIn().click();
        return new LoginPage();
    }

    public LoginPage logInWithOutPassword() {
        loginPage.openPage(URL_LOGIN_PAGE)
                .fillUsernameAddress(createdUser.getUserName())
                .clearFieldPassword()
                .getButtonLogIn().click();
        return new LoginPage();
    }
}
