package org.example.tests;

import org.example.service.MyRoutinePageService;
import org.example.service.RoutinesPageService;
import org.example.utils.Retry;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RoutineTest extends BaseTest {

    private static final String NAME_OF_CREATED_ROUTINE = "FirstRoutine";
    public static final String NAME_OF_DOWNLOADED_ROUTINE = "Copy of 3 Day - My Custom Routine";


    private MyRoutinePageService myRoutinePageService;
    private RoutinesPageService routinesPageService;

    @BeforeClass
    private void SetUp() {
        myRoutinePageService = new MyRoutinePageService();
        routinesPageService = new RoutinesPageService();
    }

    @Test(priority = 1, retryAnalyzer = Retry.class)
    public void createdNewMyRoutineTest() {
        myRoutinePageService.createNewRoutine();
        String actualNameOfCreatedRoutine = myRoutinePageService.getNameOfRoutine();
        String expectedNameOfCreatedRoutine = NAME_OF_CREATED_ROUTINE;
        Assert.assertEquals(actualNameOfCreatedRoutine, expectedNameOfCreatedRoutine, "You didn't create new " +
                "routine");
    }

    @Test(priority = 2)
    public void downloadNewMyRoutineTest() {
        routinesPageService.addNewWorkoutInMyRoutine();
        String actualNameOfDownloadedRoutine = NAME_OF_DOWNLOADED_ROUTINE;
        String expectedNameOfDownloadedRoutine = myRoutinePageService.getNameOfDownloadedRoutine();
        Assert.assertEquals(actualNameOfDownloadedRoutine, expectedNameOfDownloadedRoutine, "You didn't download" +
                "routine");
    }
}
