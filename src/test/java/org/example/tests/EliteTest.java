package org.example.tests;

import org.example.service.ElitePageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EliteTest extends BaseTest{

    private static final String WELCOME_MESSAGE_ON_THE_ELITE_PAGE = "PLANS THAT SUIT YOU BEST";
    private static final String NAME_OF_ELITE_PLAN = "Plan - JEFIT Elite Monthly";

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

    @Test
    public void takeEliteOneMonthTest() {
        elitePageService.getEliteForOneMonth();
        String actualNameOfPlan = elitePageService.getNameOfPlan();
        String expectedNameOfPlan = NAME_OF_ELITE_PLAN;
        Assert.assertEquals(actualNameOfPlan, expectedNameOfPlan);

    }
}
