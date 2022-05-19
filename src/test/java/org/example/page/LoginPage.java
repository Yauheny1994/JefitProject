package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='regusername']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@id='myemail']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='passwordconfirm']")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    private WebElement reCaptcha;

    @FindBy(xpath = "//input[@value='Create Account']")
    private WebElement buttonCreateAccount;

    public LoginPage fillUserName(String createdUserName) {
        userNameField.clear();
        userNameField.sendKeys(createdUserName);
        return this;
    }

    public LoginPage fillEmailAddress(String createdEmailAddress) {
        emailAddressField.clear();
        emailAddressField.sendKeys(createdEmailAddress);
        return this;
    }

    public LoginPage fillPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage fillConfirmPassword(String confirmPassword) {
        passwordField.clear();
        passwordField.sendKeys(confirmPassword);
        return this;
    }

    public LoginPage clickCaptcha() {
        reCaptcha.click();
        return this;
    }

    public void clickButtonCreateAccount() {
        buttonCreateAccount.click();
    }


}
