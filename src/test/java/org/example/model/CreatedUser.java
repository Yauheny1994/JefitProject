package org.example.model;

public class CreatedUser {

    String createdUserName = "makarchuk_evgen@inbox.ru";
    String createdEmailAddress = "makarchuk_evgen@inbox.ru";
    String createdPassword;
    String createdConfirmPassword;

    public String getUserName() {
        return createdUserName;
    }

    public String getEmailAddress() {
        return createdEmailAddress;
    }

    public String getPassword() {
        return createdPassword;
    }

    public String getConfirmPassword() {
        return createdConfirmPassword;
    }
}
