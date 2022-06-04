package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='navbar_username']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@id='navbar_username']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//input[@id='navbar_password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@class='loginblueButton1']")
    private WebElement logInButton;

    @FindBy(xpath = "//div[@id ='invalidpassworderrormessage']")
    private WebElement invalidMessage;

    public WebElement getInvalidMessage() {
        return invalidMessage;
    }

    public LoginPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage clearFieldUserName() {
        userNameField.clear();
        return this;
    }

    public LoginPage clearFieldEmailAddress() {
        emailAddressField.clear();
        return this;
    }

    public LoginPage clearFieldPassword() {
        passwordField.clear();
        return this;
    }

    public LoginPage fillUsernameAddress(String username) {
        userNameField.clear();
        userNameField.sendKeys(username);
        return this;
    }

    public LoginPage fillEmailAddress(String emailAddress) {
        emailAddressField.clear();
        emailAddressField.sendKeys(emailAddress);
        return this;
    }

    public LoginPage fillPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    public void clickButtonLogin() {
        logInButton.click();
    }


}


