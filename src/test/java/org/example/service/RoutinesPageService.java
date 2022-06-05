package org.example.service;

import org.example.driver.DriverSingleton;
import org.example.page.CopyOfThreeDayPage;
import org.example.page.MyRoutinesPage;
import org.example.page.RoutinesPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RoutinesPageService {

    LoginPageService loginPageService = new LoginPageService();
    MyJefitPageService myJefitPageService = new MyJefitPageService();
    MyRoutinesPage myRoutinesPage = new MyRoutinesPage();
    RoutinesPage routinesPage = new RoutinesPage();
    CopyOfThreeDayPage copyOfThreeDayPage = new CopyOfThreeDayPage();
    MyRoutinePageService myRoutinePageService = new MyRoutinePageService();
    protected WebDriver driver = DriverSingleton.getInstance().getDriver();


    public void addNewWorkoutInMyRoutine() {
        loginPageService.login();
        myJefitPageService.goMyRoutinePage();
        myRoutinesPage.getButtonDownloadARoutine().click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        routinesPage.clickFirstNameOfPlan();
        copyOfThreeDayPage.clickButtonSaveToMyWorkout();
        myRoutinePageService.openMyRoutinePage();
    }
}
