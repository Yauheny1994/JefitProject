package org.example.model;

import lombok.Getter;

@Getter
public class User {

//    private final String userName = "makarik_ma@mail.ru";
//
//    private final String password = "Makarik_ma1@mail.ru";

    private String userName = System.getProperty("userName");
    private String password =System.getProperty("password");
}
