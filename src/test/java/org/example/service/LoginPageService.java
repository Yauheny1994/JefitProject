package org.example.service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.example.model.User;
import org.example.page.LoginPage;
import org.example.page.MyJefitPage;

@Log4j2

public class LoginPageService {

    private static final String URL_LOGIN_PAGE = "https://www.jefit.com/login/";
    private final User user = new User();
    private final LoginPage loginPage = new LoginPage();
    private final MyJefitPage myJefitPage = new MyJefitPage();

    @Step("Get 'Invalid Message'")
    public String getInvalidMessage() {
        log.info("get 'Invalid Message'");
        return loginPage.getInvalidMessage();
    }

    @Step("Get button 'Home' after successful login on 'My Jefit' page")
    public String getButtonHome() {
        log.info("get button 'Home' after successful login on 'My Jefit' page");
        return myJefitPage.getTextHome();
    }

    @Step("Fill field password on 'Login' page and click button 'Login'")
    public void logInWithoutFillingUsername() {
        log.info("fill field password on 'Login' page and click button 'Login'");
        loginPage.openPage(URL_LOGIN_PAGE)
                 .clearFieldUserName()
                 .fillPassword(user.getPassword())
                 .clickButtonLogin();
    }

    @Step("Open 'Login' page and click button 'Login'")
    public void logInWithoutFillingAllTheFields() {
        log.info("open 'Login' page and click button 'Login'");
        loginPage.openPage(URL_LOGIN_PAGE)
                 .clearFieldUserName()
                 .clearFieldPassword()
                 .clickButtonLogin();
    }

    @Step("Fill field username on 'Login' page and click button 'Login'")
    public void logInWithoutFillingPassword() {
        log.info("fill field username on 'Login' page and click button 'Login'");
        loginPage.openPage(URL_LOGIN_PAGE)
                 .fillUserNameField(user.getUserName())
                 .clearFieldPassword()
                 .clickButtonLogin();
    }

    @Step("Fill all field on 'Login' page and click button 'Login'")
    public void login() {
        log.info("fill all field on 'Login' page and click button 'Login'");
        loginPage.openPage(URL_LOGIN_PAGE)
                 .clearFieldUserName()
                 .fillUserNameField(user.getUserName())
                 .fillPassword(user.getPassword())
                 .clickButtonLogin();
    }
}
