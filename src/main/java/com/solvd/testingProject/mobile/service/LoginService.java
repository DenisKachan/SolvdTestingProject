package com.solvd.testingProject.mobile.service;

import com.solvd.testingProject.commonDomain.User;
import com.solvd.testingProject.commonDomain.Users;
import com.solvd.testingProject.mobile.pages.HomePage;
import com.solvd.testingProject.mobile.pages.LoginPage;
import org.openqa.selenium.WebDriver;


public class LoginService {
    public User createUser(Users user) {
        return new User(user.getEmail(), user.getPassword(), user.getUserName());
    }

    public LoginPage typeEmailAndContinue(String email, WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickFirstSignInButton();
        loginPage.typeEmail(email);
        return loginPage.clickContinueButton();
    }

    public LoginPage typePasswordAndSignIn(String password, WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typePassword(password);
        return loginPage.clickFinalSignInButton();
    }

    public HomePage login(String email, String password, WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickFirstSignInButton();
        loginPage.typeEmail(email);
        loginPage.clickContinueButton();
        loginPage.typePassword(password);
        loginPage.clickFinalSignInButton();
        return new HomePage(driver);
    }
}
