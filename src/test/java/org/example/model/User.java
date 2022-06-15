package org.example.model;

import lombok.Getter;

@Getter
public class User {

    private final String userName = System.getProperty("userName");
    private final String password =System.getProperty("password");
}
