package org.example.model;

public class User {

    private String UserName = "Petro";
    private String EmailAddress = "Petrofan@mail.ru";
    private String Password = "Petrofan1@";
    private String ConfirmPassword = "Petrofan1@";

    public String getUserName() {
        return UserName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public String getPassword() {
        return Password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }
}
