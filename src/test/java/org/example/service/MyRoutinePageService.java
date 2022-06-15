package org.example.service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.example.driver.DriverSingleton;
import org.example.page.MyJefitPage;
import org.example.page.MyRoutinesPage;
import org.example.page.RoutineManagerPage;
import org.example.utils.JavaScript;
import org.openqa.selenium.WebDriver;


@Log4j2
public class MyRoutinePageService {


    private static final String URL_MY_ROUTINE_PAGE = "https://www.jefit.com/my-jefit/my-routines/routine-manager.php";
    private final WebDriver driver = DriverSingleton.getInstance().getDriver();
    private final MyRoutinesPage myRoutinesPage = new MyRoutinesPage();
    private final RoutineManagerPage routineManagerPage = new RoutineManagerPage();
    private final MyJefitPageService myJefitPageService = new MyJefitPageService();
    private final LoginPageService loginPageService = new LoginPageService();
    private final JavaScript javaScript = new JavaScript();


    @Step("Get Name of Routine")
    public String getNameOfCreatedRoutine() {
        log.info("get Name of Routine");
        return routineManagerPage.getNameOfCreatedRoutine();
    }

    @Step("Create new Routine")
    public void createNewRoutine() {
        log.info("login");
        loginPageService.login();
        log.info("open 'My Routine Page'");
        myJefitPageService.openMyRoutinePage();
        log.info("create new account");
        myRoutinesPage.clickLinkRoutineManager();
        log.info("wait button create new routine");
        myRoutinesPage.clickButtonCreateNewAccount();
        log.info("fill name of routine");
        routineManagerPage.fillNameOFCreatedRoutine();
        javaScript.scrollDownThePage();
        log.info("click button 'Save Routine'");
        routineManagerPage.clickButtonSaveRoutine();
    }

    @Step("Open 'My routine' page'")
    public void openMyRoutinePage() {
        log.info("open 'My routine' page'");
        driver.get(URL_MY_ROUTINE_PAGE);
    }

    @Step("Get name of downloaded routine")
    public String getNameOfDownloadedRoutine() {
        log.info("get name of downloaded routine");
        return myRoutinesPage.getNameOfDownloadedRoutine();
    }
}
