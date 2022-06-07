package org.example.service;

import org.example.driver.DriverSingleton;
import org.example.page.MyJefitPage;
import org.example.page.MyRoutinesPage;
import org.example.page.RoutineManagerPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyRoutinePageService {


    private WebDriver driver = DriverSingleton.getInstance().getDriver();
    public static final String NAME_OF_CREATED_ROUTINE = "FirstRoutine";
    public static final String URL_MY_ROUTINE_PAGE = "https://www.jefit.com/my-jefit/my-routines/routine-manager.php";

    private MyRoutinesPage myRoutinesPage = new MyRoutinesPage();
    private RoutineManagerPage routineManagerPage = new RoutineManagerPage();
    private MyJefitPageService myJefitPageService = new MyJefitPageService();
    private LoginPageService loginPageService = new LoginPageService();
    private MyJefitPage myJefitPage = new MyJefitPage();


    public String getNameOfRoutine() {
        return routineManagerPage.getNameOfRoutine().getText();
    }

    public void createNewRoutine() {
        loginPageService.login();
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(myJefitPage.getButtonMyRoutines()));
        myJefitPageService.goMyRoutinePage();
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(myRoutinesPage.getTabRoutineManager()));
        myRoutinesPage.clickTabRoutineManager()
                .clickButtonCreateNewAccount();
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(routineManagerPage.getFieldRoutineName()));
        routineManagerPage.getFieldRoutineName().sendKeys(NAME_OF_CREATED_ROUTINE);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        routineManagerPage.clickButtonSaveRoutine();
    }

    public void openMyRoutinePage() {
        driver.get(URL_MY_ROUTINE_PAGE);
    }

    public String getNameOfDownloadedRoutine() {
        return myRoutinesPage.getNameOfDownloadedRoutine().getText();
    }
}
