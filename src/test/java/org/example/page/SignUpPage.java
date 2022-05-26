package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {

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

    @Override
    protected WebElement waitVisibilityOf(WebElement element) {
        return super.waitVisibilityOf(element);
    }

    public SignUpPage fillUserName(String userName) {
        userNameField.clear();
        userNameField.sendKeys(userName);
        return this;
    }

    public SignUpPage fillEmailAddress(String emailAddress) {
        emailAddressField.clear();
        emailAddressField.sendKeys(emailAddress);
        return this;
    }

    public SignUpPage fillPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    public SignUpPage fillConfirmPassword(String confirmPassword) {
        passwordField.clear();
        passwordField.sendKeys(confirmPassword);
        return this;
    }

    public SignUpPage clickCaptcha() {
        reCaptcha.click();
        return this;
    }

    public void clickButtonCreateAccount() {
        buttonCreateAccount.click();
    }


}
