package org.example.tests;

import org.example.service.MyJefitPageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StatusTest extends BaseTest {

    private static final String STATUS = "makarik_ma@mail.ru : Hello";

    private MyJefitPageService myJefitPageService;

    @BeforeClass
    public void setUp() {
        myJefitPageService = new MyJefitPageService();
    }

    @Test
    public void setStatusTest() {
        myJefitPageService.sendStatus();
        String actualStatus = myJefitPageService.getStatus();
        String expectedStatus = STATUS;
        Assert.assertEquals(actualStatus, expectedStatus, "You didn't send your status");
    }
}
