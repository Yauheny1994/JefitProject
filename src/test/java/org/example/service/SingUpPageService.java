package org.example.service;
import org.example.model.User;
import org.example.page.SignUpPage;
import org.example.page.MainPage;


public class SingUpPageService {

    public static final String URL_MAIN_PAGE_JEFIT = "https://www.jefit.com/";

    User user = new User();
    SignUpPage signUpPage = new SignUpPage();
    MainPage mainPage = new MainPage();


    public void registration() {
        mainPage.openPage(URL_MAIN_PAGE_JEFIT)
                .clickButtonSingUp();
        signUpPage.fillUserName(user.getUserName())
                .fillEmailAddress(user.getEmailAddress())
                .fillPassword(user.getPassword())
                .fillConfirmPassword(user.getConfirmPassword())
                .clickCaptcha()
                .clickButtonCreateAccount();
    }


}
