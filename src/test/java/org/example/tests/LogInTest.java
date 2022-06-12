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
    public void logInWithOutFillingFieldUsernameTest() {
        loginPageService.logInWithoutFillingUsername();
        actualMessage = loginPageService.getInvalidMessage();
        expectedResult = MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME;
        Assert.assertEquals(actualMessage, expectedResult, "You didn't login");
    }

    @Test
    public void logInWithoutFillingAllTheFieldsTest() {
        loginPageService.logInWithoutFillingAllTheFields();
        actualMessage = loginPageService.getInvalidMessage();
        expectedResult = MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME;
        Assert.assertEquals(actualMessage, expectedResult, "You didn't login");
    }

    @Test
    public void logInWithoutFillingFieldPasswordTest() {
        loginPageService.logInWithoutFillingPassword();
        actualMessage = loginPageService.getInvalidMessage();
        expectedResult = MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME;
        Assert.assertEquals(actualMessage, expectedResult, "You didn't login");
    }

    @Test
    public void loginSuccessfulTest() {
        loginPageService.login();
        actualMessage = loginPageService.getButtonHome();
        expectedResult = MESSAGE_AFTER_ENTER_IN_PROFILE;
        Assert.assertEquals(actualMessage, expectedResult, "You didn't login");
    }
}
