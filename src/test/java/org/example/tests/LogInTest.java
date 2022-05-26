package org.example.tests;

import net.bytebuddy.implementation.bytecode.ShiftRight;
import org.example.page.LoginPage;
import org.example.service.LoginPageService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogInTest extends BaseTest{

    LoginPageService loginPageService = new LoginPageService();
    LoginPage loginPage = new LoginPage();
    private static final String MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME = "Invalid username/email or password";

    @Test(priority = 1)
    public void logInWithOutFillFieldUsernameTest() {
        loginPageService.logInWithOutUsername();
        try {
            driver.manage().timeouts().wait(5, 1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualMessage = loginPage.getInvalidMessage().getText();
        String expectedResult = MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME;
        Assert.assertEquals(actualMessage, expectedResult, "You don't login");
    }

    @Test(priority = 2)
    public void logInWithOutFillFieldEmailAddressTest() {
        loginPageService.logInWithOutEmailAddress();
        String actualMessage = loginPage.getInvalidMessage().getText();
        String expectedResult = MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME;
        Assert.assertEquals(actualMessage, expectedResult, "You don't login");
    }

    @Test(priority = 2)
    public void logInWithOutFillFieldPasswordTest() {
        loginPageService.logInWithOutPassword();
        String actualMessage = loginPage.getInvalidMessage().getText();
        String expectedResult = MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME;
        Assert.assertEquals(actualMessage, expectedResult, "You don't login");
    }

}
