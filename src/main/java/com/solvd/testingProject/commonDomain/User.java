package com.solvd.testingProject.commonDomain;

import lombok.Getter;

@Getter
public class User {
    private final String email;
    private final String password;

    private final String userName;

    public User(String email, String password, String userName) {
        this.email = email;
        this.password = password;
        this.userName = userName;
    }

}
