package org.example.service;

import org.example.driver.DriverSingleton;
import org.example.page.CopyOfThreeDayPage;
import org.example.page.MyRoutinesPage;
import org.example.page.RoutinesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RoutinesPageService {

    MyRoutinesPage myRoutinesPage = new MyRoutinesPage();
    RoutinesPage routinesPage = new RoutinesPage();
    CopyOfThreeDayPage copyOfThreeDayPage = new CopyOfThreeDayPage();
    MyRoutinePageService myRoutinePageService = new MyRoutinePageService();
    protected WebDriver driver = DriverSingleton.getInstance().getDriver();


    public void addNewWorkoutInMyRoutine() {
        myRoutinesPage.getButtonDownloadARoutine().click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        routinesPage.clickFirstNameOfPlan();
        new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(copyOfThreeDayPage.getButtonSaveToMyWorkout()));
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,130)", "");
        copyOfThreeDayPage.clickButtonSaveToMyWorkout();
        myRoutinePageService.openMyRoutinePage();
    }
}
