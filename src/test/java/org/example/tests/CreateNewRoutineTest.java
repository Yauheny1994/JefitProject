package org.example.tests;

import org.example.service.MyRoutinePageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateNewRoutineTest extends BaseTest{

    private static final String NAME_OF_CREATED_ROUTINE = "FirstRoutine";

    MyRoutinePageService myRoutinePageService;

    @BeforeClass
    private void SetUp() {
        myRoutinePageService = new MyRoutinePageService();
    }

    @Test
    public void createdNewMYRoutinesTest() {
        myRoutinePageService.createNewRoutine();
        String actualNameOfCreatedRoutine = myRoutinePageService.getNameOfRoutine();
        String expectedNameOfCreatedRoutine = NAME_OF_CREATED_ROUTINE;
        Assert.assertEquals(actualNameOfCreatedRoutine, expectedNameOfCreatedRoutine, "You didn't create new " +
                "routine");
    }
}
