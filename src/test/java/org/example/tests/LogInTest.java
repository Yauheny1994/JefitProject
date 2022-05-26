package org.example.tests;
import org.example.page.LoginPage;
import org.example.page.ProfilePage;
import org.example.service.LoginPageService;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LogInTest extends BaseTest{

    LoginPageService loginPageService = new LoginPageService();
    LoginPage loginPage = new LoginPage();
    private static final String MESSAGE_ABOUT_INVALID_EMAIL_OR_USERNAME = "Invalid username/email or password";
    ProfilePage profilePage = new ProfilePage();
    private static final String MESSAGE_AFTER_ENTER_IN_PROFILE = "Setup Your Profile";

    @Test(priority = 1)
    public void logInWithOutFillFieldUsernameTest() {
        loginPageService.logInWithOutUsername();
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

    @Test(priority = 3)
    public void loginSuccessfulTest() {
        loginPageService.login();
        String actualResult = profilePage.getEnterInProfile().getText();
        String expectedResult = MESSAGE_AFTER_ENTER_IN_PROFILE;
        Assert.assertEquals(actualResult, expectedResult);
    }

}
