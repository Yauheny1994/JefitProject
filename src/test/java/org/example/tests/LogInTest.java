package org.example.tests;

import org.example.service.LoginPageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LogInTest extends BaseTest {

    private static final String MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME = "Invalid username/email or password";
    private static final String MESSAGE_AFTER_ENTER_IN_PROFILE = "Home";

    private LoginPageService loginPageService;
    String actualMessage;
    String expectedResult;

    @BeforeClass
    private void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void logInWithOutFillFieldUsernameTest() {
        loginPageService.logInWithOutUsername();
        actualMessage = loginPageService.getInvalidMessage();
        expectedResult = MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME;
        Assert.assertEquals(actualMessage, expectedResult, "You don't login");
    }

    @Test
    public void logInWithOutFillFieldEmailAddressTest() {
        loginPageService.logInWithOutEmailAddress();
        actualMessage = loginPageService.getInvalidMessage();
        expectedResult = MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME;
        Assert.assertEquals(actualMessage, expectedResult, "You don't login");
    }

    @Test
    public void logInWithOutFillFieldPasswordTest() {
        loginPageService.logInWithOutPassword();
        actualMessage = loginPageService.getInvalidMessage();
        expectedResult = MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME;
        Assert.assertEquals(actualMessage, expectedResult, "You don't login");
    }

    @Test
    public void loginSuccessfulTest() {
        loginPageService.login();
        actualMessage = loginPageService.getMessageEnterInProfile();
        expectedResult = MESSAGE_AFTER_ENTER_IN_PROFILE;
        Assert.assertEquals(actualMessage, expectedResult);
    }
}
