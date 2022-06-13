package org.example.tests;

import io.qameta.allure.Description;
import org.example.service.ElitePageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EliteTest extends BaseTest{

    private static final String WELCOME_MESSAGE_ON_THE_ELITE_PAGE = "PLANS THAT SUIT YOU BEST";
    private static final String NAME_OF_ELITE_PLAN = "Plan - JEFIT Elite Monthly";
    private ElitePageService elitePageService;

    @BeforeClass
    public void setup() {
        elitePageService = new ElitePageService();
    }

    @Test(description = "openElitePage")
    @Description("Open page Elite Page and checking it")
    public void openElitePage() {
        elitePageService.openElitePage();
        String actualWelcomeMessageOnTheElitePage = elitePageService.getWelcomeMassageOnElitePage();
        Assert.assertEquals(actualWelcomeMessageOnTheElitePage, WELCOME_MESSAGE_ON_THE_ELITE_PAGE, "You aren't " +
                "on the Elite Page");
    }

    @Test(description = "takeEliteOneMonthTest")
    @Description("Take Elite One Month")
    public void takeEliteOneMonthTest() {
        elitePageService.getEliteForOneMonth();
        String actualNameOfPlan = elitePageService.getNameOfPlan();
        String expectedNameOfPlan = NAME_OF_ELITE_PLAN;
        Assert.assertEquals(actualNameOfPlan, expectedNameOfPlan, "You didn't take Elite for one month");

    }
}
