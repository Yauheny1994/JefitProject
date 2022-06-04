package org.example.service;

import org.example.driver.DriverSingleton;
import org.example.page.MyRoutinesPage;
import org.example.page.RoutineManagerPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyRoutinePageService {


    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    public static final String NAME_OF_CREATED_ROUTINE = "FirstRoutine";

    MyRoutinesPage myRoutinesPage = new MyRoutinesPage();
    RoutineManagerPage routineManagerPage = new RoutineManagerPage();
    MyJefitPageService myJefitPageService = new MyJefitPageService();

    public String getNameOfRoutine() {
        return routineManagerPage.getNameOfRoutine().getText();
    }

    public void createNewRoutine() {
        myJefitPageService.login();
        myJefitPageService.goMyRoutinePage();
        myRoutinesPage.clickTabRoutineManager()
                      .clickButtonCreateNewAccount();
        routineManagerPage.getFieldRoutineName().sendKeys(NAME_OF_CREATED_ROUTINE);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        routineManagerPage.clickButtonSaveRoutine();
    }
}
