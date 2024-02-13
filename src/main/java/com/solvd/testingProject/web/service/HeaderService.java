package com.solvd.testingProject.web.service;

import com.solvd.testingProject.web.pages.Header;
import com.solvd.testingProject.web.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class HeaderService {

    public LoginPage openLoginPage(WebDriver driver) {
        Header header = new Header(driver);
        return header.clickAccountAndListsLabel();
    }

    public void signOut(WebDriver driver) {
        Header header = new Header(driver);
        header.moveMouseToAccountAndListsLabel();
        header.clickSignOutLabel();
    }

    public String getUserNameOfTheAccount(WebDriver driver) {
        Header header = new Header(driver);
        return header.getTextFromAccountListLabel();
    }
}
