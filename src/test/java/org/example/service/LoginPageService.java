package org.example.service;

import org.example.model.User;
import org.example.page.LoginPage;
import org.example.page.MainPage;

public class LoginPageService {

    public static final String URL_MAIN_PAGE_JEFIT = "https://www.jefit.com/";
    LoginPageService loginPageService = new LoginPageService();
    User user = new User();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    public LoginPageService login() {
        mainPage.openPage(URL_MAIN_PAGE_JEFIT);
        loginPage.fillUserName(user.getUserName())
                .fillEmailAddress(user.getEmailAddress())
                .fillPassword(user.getPassword())
                .fillConfirmPassword(user.getConfirmPassword())
                .clickCaptcha()
                .clickButtonCreateAccount();
        return new LoginPageService();
    }
}
