package org.example.tests;

import org.example.service.MyJefitPageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class BodyStatsTest extends BaseTest {

    private static final String NAME_OF_LINK = "Latest Body Stats";
    private MyJefitPageService myJefitPageService;

    @BeforeClass
    public void setup() {
        myJefitPageService = new MyJefitPageService();
    }

    @Test
    public void openPageBodyStats() {
        myJefitPageService.openPageLatestBodyStats();
        String actualNameOfLink = myJefitPageService.getLinkOnThePageLatestBodyStats();
        Assert.assertEquals(actualNameOfLink, NAME_OF_LINK);

    }
}
