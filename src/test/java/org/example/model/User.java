package org.example.model;

public class User extends CreatedUser {

    String UserName = "Petro";
    String EmailAddress = "Petrofan@mail.ru";
    String Password = "Petrofan1@";
    String ConfirmPassword = "Petrofan1@";

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
