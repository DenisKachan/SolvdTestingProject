package com.solvd.testingProject.commonDomain;

import com.zebrunner.carina.utils.R;
import lombok.Getter;

@Getter
public enum Users {

    VALID(R.TESTDATA.get("valid.email"), R.TESTDATA.get("valid.password"), R.TESTDATA.get("valid.username")),
    INVALID(R.TESTDATA.get("invalid.email"), R.TESTDATA.get("invalid.password"), R.TESTDATA.get("invalid.username"));

    private final String email;
    private final String password;

    private final String userName;

    Users(String email, String password, String userName) {
        this.email = email;
        this.password = password;
        this.userName = userName;
    }

}
