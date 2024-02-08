package com.solvd.testingProject.web.service;

import com.solvd.testingProject.web.domain.User;
import com.solvd.testingProject.web.domain.Users;
import com.solvd.testingProject.web.pages.Header;
import com.solvd.testingProject.web.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginService {

    public User createUser(Users user) {
        return new User(user.getEmail(), user.getPassword(), user.getUserName());
    }

    public LoginPage typeEmailAndContinue(String email, WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeEmail(email);
        return loginPage.clickContinueButton();
    }

    public LoginPage typePasswordAndSignIn(String password, WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typePassword(password);
        return loginPage.clickSignInButton();
    }

    public Header login(String email, String password, WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeEmail(email);
        loginPage.clickContinueButton();
        loginPage.typePassword(password);
        loginPage.clickSignInButton();
        return new Header(driver);
    }

    public Header returnToTheMainPage(WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.clickWebSiteHeader();
    }
}
