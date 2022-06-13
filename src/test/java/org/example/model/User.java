package org.example.model;

import lombok.Getter;

@Getter
public class User {

    private String userName = System.getProperty("userName");
    private String password =System.getProperty("password");
}
