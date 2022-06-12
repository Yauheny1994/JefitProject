package org.example.page;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Log4j2
public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='navbar_username']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@id='navbar_password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@class='loginblueButton1']")
    private WebElement logInButton;

    @FindBy(xpath = "//div[@id ='invalidpassworderrormessage']")
    private WebElement invalidMessage;

    public LoginPage openPage(String url) {
        log.info("open 'Login' page");
        driver.get(url);
        return this;
    }

    public LoginPage clearFieldUserName() {
        log.info("clear field User Name");
        userNameField.clear();
        return this;
    }

    public LoginPage clearFieldPassword() {
        log.info("clear field Password");
        passwordField.clear();
        return this;
    }

    public LoginPage fillUserNameField(String username) {
        log.info("clear field User Name");
        userNameField.clear();
        log.info("Enter User Name");
        userNameField.sendKeys(username);
        return this;
    }

    public LoginPage fillPassword(String password) {
        log.info("clear field Password");
        passwordField.clear();
        log.info("Enter Password");
        passwordField.sendKeys(password);
        return this;
    }

    public void clickButtonLogin() {
        log.info("click button 'Login'");
        logInButton.click();
    }

    public String getInvalidMessage() {
        log.info("get 'Invalid Message'");
        return invalidMessage.getText();
    }
}


