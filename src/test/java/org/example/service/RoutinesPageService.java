package org.example.service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.example.page.CopyOfThreeDayPage;
import org.example.page.MyRoutinesPage;
import org.example.page.RoutinesPage;
import org.example.utils.JavaScript;
import org.example.utils.Waiter;


@Log4j2
public class RoutinesPageService {

    private final MyRoutinesPage myRoutinesPage = new MyRoutinesPage();
    private final RoutinesPage routinesPage = new RoutinesPage();
    private final CopyOfThreeDayPage copyOfThreeDayPage = new CopyOfThreeDayPage();
    private final MyRoutinePageService myRoutinePageService = new MyRoutinePageService();
    private final JavaScript javaScript = new JavaScript();
    private final Waiter waiter = new Waiter();


    @Step("Add new workout in my routine")
    public void addNewWorkoutInMyRoutine() {
        log.info("click button 'Download Routine'");
        myRoutinesPage.clickButtonDownloadARoutine();
        log.info("scroll down on the page");
        javaScript.scrollDownThePage();
        log.info("click 'Name of plan'");
        routinesPage.clickNameOfPlan();
        log.info("wait button save to my workout");
        waiter.waitVisibilityOf(copyOfThreeDayPage.getButtonSaveToMyWorkout());
        log.info("scroll to the element");
        javaScript.scrollToTheElementOnRoutinePage();
        log.info("click button 'Save to My Workout'");
        copyOfThreeDayPage.clickButtonSaveToMyWorkout();
        log.info("refresh 'My Routine' page");
        myRoutinePageService.openMyRoutinePage();
    }
}
