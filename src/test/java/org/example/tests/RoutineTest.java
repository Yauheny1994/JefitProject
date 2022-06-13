package org.example.tests;

import io.qameta.allure.Description;
import org.example.service.MyRoutinePageService;
import org.example.service.RoutinesPageService;
import org.example.utils.Retry;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RoutineTest extends BaseTest {

    private static final String NAME_OF_CREATED_ROUTINE = "FirstRoutine";
    private static final String NAME_OF_DOWNLOADED_ROUTINE = "Copy of 3 Day - My Custom Routine";
    private MyRoutinePageService myRoutinePageService;
    private RoutinesPageService routinesPageService;

    @BeforeClass
    private void setUp() {
        myRoutinePageService = new MyRoutinePageService();
        routinesPageService = new RoutinesPageService();
    }

    @Test(description = "createdNewMyRoutineTest", priority = 1, retryAnalyzer = Retry.class)
    @Description("create my routine")
    public void createdNewMyRoutineTest() {
        myRoutinePageService.createNewRoutine();
        String actualNameOfCreatedRoutine = myRoutinePageService.getNameOfCreatedRoutine();
        Assert.assertEquals(actualNameOfCreatedRoutine, NAME_OF_CREATED_ROUTINE, "You didn't create new " +
                "routine");
    }

    @Test(description = "downloadNewMyRoutineTest",priority = 2)
    @Description("download new routine")
    public void downloadNewMyRoutineTest() {
        routinesPageService.addNewWorkoutInMyRoutine();
        String actualNameOfDownloadedRoutine = NAME_OF_DOWNLOADED_ROUTINE;
        String expectedNameOfDownloadedRoutine = myRoutinePageService.getNameOfDownloadedRoutine();
        Assert.assertEquals(actualNameOfDownloadedRoutine, expectedNameOfDownloadedRoutine, "You didn't download" +
                "routine");
    }
}
