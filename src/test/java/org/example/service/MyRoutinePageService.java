package org.example.service;

import lombok.extern.log4j.Log4j2;
import org.example.driver.DriverSingleton;
import org.example.page.MyJefitPage;
import org.example.page.MyRoutinesPage;
import org.example.page.RoutineManagerPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log4j2
public class MyRoutinePageService {


    private final WebDriver driver = DriverSingleton.getInstance().getDriver();
    public static final String NAME_OF_CREATED_ROUTINE = "FirstRoutine";
    public static final String URL_MY_ROUTINE_PAGE = "https://www.jefit.com/my-jefit/my-routines/routine-manager.php";

    private final MyRoutinesPage myRoutinesPage = new MyRoutinesPage();
    private final RoutineManagerPage routineManagerPage = new RoutineManagerPage();
    private final MyJefitPageService myJefitPageService = new MyJefitPageService();
    private final LoginPageService loginPageService = new LoginPageService();
    private final MyJefitPage myJefitPage = new MyJefitPage();


    public String getNameOfRoutine() {
        log.info("get Name of Routine");
        return routineManagerPage.getNameOfCreatedRoutine().getText();
    }

    public void createNewRoutine() {
        log.info("login");
        loginPageService.login();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(myJefitPage.getButtonMyRoutines()));
        log.info("open 'My Routine Page'");
        myJefitPageService.goMyRoutinePage();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(myRoutinesPage.getTabRoutineManager()));
        log.info("create new account");
        myRoutinesPage.clickLinkRoutineManager();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(myRoutinesPage.getButtonCreateNewRoutine()));
        myRoutinesPage.clickButtonCreateNewAccount();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(routineManagerPage.getFieldRoutineName()));
        log.info("fill name of routine");
        routineManagerPage.getFieldRoutineName().sendKeys(NAME_OF_CREATED_ROUTINE);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        log.info("click button 'Save Routine'");
        routineManagerPage.clickButtonSaveRoutine();
    }

    public void openMyRoutinePage() {
        log.info("open 'My routine' page");
        driver.get(URL_MY_ROUTINE_PAGE);
    }

    public String getNameOfDownloadedRoutine() {
        log.info("get name of downloaded routine");
        return myRoutinesPage.getNameOfDownloadedRoutine().getText();
    }
}
