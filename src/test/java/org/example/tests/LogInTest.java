package org.example.tests;

import org.example.service.LoginPageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LogInTest extends BaseTest {

    private static final String MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME = "Invalid username/email or password";
    private static final String MESSAGE_AFTER_ENTER_IN_PROFILE = "Home";

    private LoginPageService loginPageService;

    @BeforeClass
    private void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void logInWithOutFillFieldUsernameTest() {
        loginPageService.logInWithOutUsername();
        String actualMessage = loginPageService.getInvalidMessage();
        String expectedResult = MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME;
        Assert.assertEquals(actualMessage, expectedResult, "You don't login");
    }

    @Test
    public void logInWithOutFillFieldEmailAddressTest() {
        loginPageService.logInWithOutEmailAddress();
        String actualMessage = loginPageService.getInvalidMessage();
        String expectedResult = MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME;
        Assert.assertEquals(actualMessage, expectedResult, "You don't login");
    }

    @Test
    public void logInWithOutFillFieldPasswordTest() {
        loginPageService.logInWithOutPassword();
        String actualMessage = loginPageService.getInvalidMessage();
        String expectedResult = MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME;
        Assert.assertEquals(actualMessage, expectedResult, "You don't login");
    }

    @Test
    public void loginSuccessfulTest() {
        loginPageService.login();
        String actualResult = loginPageService.getEnterInProfile();
        String expectedResult = MESSAGE_AFTER_ENTER_IN_PROFILE;
        Assert.assertEquals(actualResult, expectedResult);
    }

}
