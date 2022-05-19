package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.page.ProfilePage;
import org.example.service.LoginPageService;

public class CreateAccountsTest extends BaseTest {

   LoginPageService loginPageService = new LoginPageService();
   ProfilePage profilePage = new ProfilePage();
    public static final String EXPECTED_MESSAGE_AFTER_REGISTRATION = " Welcome to Jefit! ";

    @Test
    public void createNewAccount() {
        loginPageService.login();
        String actualMessageAfterRegistration = profilePage.getWelcomeMessage().getText();
        String expectedMessageAfterRegistration = EXPECTED_MESSAGE_AFTER_REGISTRATION;
        Assert.assertEquals(actualMessageAfterRegistration, expectedMessageAfterRegistration, "You aren't registered");

    }
}
