package org.example.tests;

import org.example.page.MyJefitPage;
import org.example.service.MyJefitPageService;
import org.example.utils.Waiter;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class BodyStatsTest extends BaseTest {

    private static final String NAME_OF_LINK = "Latest Body Stats";
    private MyJefitPageService myJefitPageService;
    private MyJefitPage myJefitPage;
    private final Waiter waiter = new Waiter();

    @BeforeClass
    public void setup() {
        myJefitPageService = new MyJefitPageService();
        myJefitPage = new MyJefitPage();
    }

    @Test
    public void goToPageBodyStats() {
        myJefitPageService.goToPageLatestBodyStats();
        waiter.waitVisibilityOf(myJefitPage.getLinkLatestBodyStats());
        String actualNameOfLink = myJefitPageService.getLinkOnThePageLatestBodyStats();
        String expectedNameOfLink = NAME_OF_LINK;
        Assert.assertEquals(actualNameOfLink, expectedNameOfLink);

    }
}
