package org.example.service;

import org.example.model.CreatedUser;
import org.example.page.LoginPage;

public class LoginPageService {

    public static final String URL_LOGIN_PAGE = "https://www.jefit.com/login/";

    CreatedUser createdUser = new CreatedUser();
    LoginPage loginPage = new LoginPage();

    public void logInWithOutUsername() {
        loginPage.openPage(URL_LOGIN_PAGE)
                .clearFieldUserName()
                .fillPassword(createdUser.getPassword())
                .clickButtonLogin();
    }

    public void logInWithOutEmailAddress() {
        loginPage.openPage(URL_LOGIN_PAGE)
                .clearFieldEmailAddress()
                .fillPassword(createdUser.getPassword())
                .clickButtonLogin();
    }

    public void logInWithOutPassword() {
        loginPage.openPage(URL_LOGIN_PAGE)
                .fillUsernameAddress(createdUser.getUserName())
                .clearFieldPassword()
                .clickButtonLogin();
    }

    public void login() {
        loginPage.openPage(URL_LOGIN_PAGE)
                .clearFieldUserName()
                .fillUsernameAddress(createdUser.getUserName())
                .fillPassword(createdUser.getPassword())
                .clickButtonLogin();
    }
}
