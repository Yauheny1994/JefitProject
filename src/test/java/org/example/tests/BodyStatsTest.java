package org.example.tests;

import org.example.driver.DriverSingleton;
import org.example.page.MyJefitPage;
import org.example.service.LoginPageService;
import org.example.service.MyJefitPageService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BodyStatsTest extends BaseTest {

    public static final String NAME_OF_LINK = "Latest Body Stats";

    MyJefitPageService myJefitPageService;
    MyJefitPage myJefitPage;

    @BeforeClass
    public void setup() {
        myJefitPageService = new MyJefitPageService();
        myJefitPage = new MyJefitPage();
    }

    @Test
    public void goToPageLatestBodyStats() {
        myJefitPageService.goToPageLatestBodyStats();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(myJefitPage.getLinkLatestBodyStats()));
                String actualNameOfLink = myJefitPageService.linkOnThePageLatestBodyStats();
        String expectedNameOfLink = NAME_OF_LINK;
        Assert.assertEquals(actualNameOfLink, expectedNameOfLink);

    }
}
