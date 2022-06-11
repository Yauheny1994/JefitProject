package org.example.service;

import lombok.extern.log4j.Log4j2;
import org.example.driver.DriverSingleton;
import org.example.page.CopyOfThreeDayPage;
import org.example.page.MyRoutinesPage;
import org.example.page.RoutinesPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log4j2
public class RoutinesPageService {

    private final MyRoutinesPage myRoutinesPage = new MyRoutinesPage();
    private final RoutinesPage routinesPage = new RoutinesPage();
    private final CopyOfThreeDayPage copyOfThreeDayPage = new CopyOfThreeDayPage();
    private final MyRoutinePageService myRoutinePageService = new MyRoutinePageService();
    private final WebDriver driver = DriverSingleton.getInstance().getDriver();


    public void addNewWorkoutInMyRoutine() {
        log.info("click button 'Download Routine'");
        myRoutinesPage.getButtonDownloadARoutine().click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        log.info("click 'Name of plan'");
        routinesPage.clickNameOfPlan();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(copyOfThreeDayPage.getButtonSaveToMyWorkout()));
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,130)", "");
        log.info("click button 'Save to My Workout'");
        copyOfThreeDayPage.clickButtonSaveToMyWorkout();
        log.info("refresh 'My Routine' page");
        myRoutinePageService.openMyRoutinePage();
    }
}
