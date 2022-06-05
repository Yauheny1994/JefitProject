package org.example.tests;

import org.example.page.ElitePage;
import org.example.service.ElitePageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EliteTest extends BaseTest{

    private static final String WELCOME_MESSAGE_ON_THE_ELITE_PAGE = "PLANS THAT SUIT YOU BEST";

    ElitePageService elitePageService;

    @BeforeClass
    public void setup() {
        elitePageService = new ElitePageService();
    }

    @Test
    public void goToElitePage() {
        elitePageService.goToElitePage();
        String actualWelcomeMessageOnTheElitePage = elitePageService.getWelcomeMassageOnTheElitePage();
        String expectedWelcomeMessageOnTheElitePAge = WELCOME_MESSAGE_ON_THE_ELITE_PAGE;
        Assert.assertEquals(actualWelcomeMessageOnTheElitePage, expectedWelcomeMessageOnTheElitePAge, "You aren't " +
                "on the Elite Page");
    }
}
