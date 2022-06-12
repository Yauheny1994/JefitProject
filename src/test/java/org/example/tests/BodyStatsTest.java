package org.example.tests;

import org.example.page.MyJefitPage;
import org.example.service.MyJefitPageService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class BodyStatsTest extends BaseTest {

    private static final String NAME_OF_LINK = "Latest Body Stats";
    private MyJefitPageService myJefitPageService;
    private MyJefitPage myJefitPage;

    @BeforeClass
    public void setup() {
        myJefitPageService = new MyJefitPageService();
        myJefitPage = new MyJefitPage();
    }

    @Test
    public void goToPageBodyStats() {
        myJefitPageService.goToPageLatestBodyStats();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(myJefitPage.getLinkLatestBodyStats()));
        String actualNameOfLink = myJefitPageService.getLinkOnThePageLatestBodyStats();
        String expectedNameOfLink = NAME_OF_LINK;
        Assert.assertEquals(actualNameOfLink, expectedNameOfLink);

    }
}
