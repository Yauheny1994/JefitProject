package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.page.ProfilePage;
import org.example.service.SingUpPageService;

public class CreateAccountsTest extends BaseTest {

   SingUpPageService singUpPageService = new SingUpPageService();
   ProfilePage profilePage = new ProfilePage();
    public static final String EXPECTED_MESSAGE_AFTER_REGISTRATION = " Welcome to Jefit! ";


    @Test
    public void createNewAccountTest() {
        singUpPageService.registration();
        String actualMessageAfterRegistration = profilePage.getWelcomeMessage().getText();
        String expectedMessageAfterRegistration = EXPECTED_MESSAGE_AFTER_REGISTRATION;
        Assert.assertEquals(actualMessageAfterRegistration, expectedMessageAfterRegistration, "You aren't registered");

    }
}
