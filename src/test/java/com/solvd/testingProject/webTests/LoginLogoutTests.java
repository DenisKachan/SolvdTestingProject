package com.solvd.testingProject.webTests;

import com.solvd.testingProject.commonDomain.Users;
import com.solvd.testingProject.web.pages.Header;
import com.solvd.testingProject.web.pages.LoginPage;
import com.solvd.testingProject.web.service.HeaderService;
import com.solvd.testingProject.web.service.LoginService;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginLogoutTests implements IAbstractTest{

    private final LoginService loginService = new LoginService();
    private final HeaderService headerService = new HeaderService();

    @Test(description = "try to login with invalid email")
    public void verifyInvalidEmailTest() {
        SoftAssert softAssert = new SoftAssert();
        Header header = new Header(getDriver());
        header.open();
        softAssert.assertTrue(header.isPageOpened(), "The header is not visible");
        softAssert.assertTrue(header.isSearchInputPresent(), "Search input is not present");
        softAssert.assertTrue(header.isAccountAndListsLabelPresent(), "Account and lists label is not present");
        LoginPage loginPage = headerService.openLoginPage(getDriver());
        softAssert.assertTrue(loginPage.isEmailInputPresent(), "Email input is not present");
        softAssert.assertTrue(loginPage.isContinueButtonPresent(), "Continue button is not present");
        softAssert.assertTrue((loginService.typeEmailAndContinue(Users.INVALID.getEmail(), getDriver()).isErrorBoxPresent()), "Error box is not present");
        softAssert.assertAll();
    }

    @Test(description = "try to login with valid email")
    public void verifyValidEmailTest() {
        SoftAssert softAssert = new SoftAssert();
        Header header = new Header(getDriver());
        header.open();
        softAssert.assertTrue(header.isPageOpened(), "The header is not visible");
        softAssert.assertTrue(header.isSearchInputPresent(), "Search input is not present");
        softAssert.assertTrue(header.isAccountAndListsLabelPresent(), "Account and lists label is not present");
        LoginPage loginPage = headerService.openLoginPage(getDriver());
        softAssert.assertTrue(loginPage.isEmailInputPresent(), "Email input is not present");
        softAssert.assertTrue(loginPage.isContinueButtonPresent(), "Continue button is not present");
        loginService.typeEmailAndContinue(Users.VALID.getEmail(), getDriver());
        softAssert.assertTrue(loginPage.isPasswordInputPresent(), "Password input is not present");
        softAssert.assertTrue(loginPage.isSignInButtonPresent(), "Sign In Button is not present");
        softAssert.assertAll();
    }

    @Test(description = "try to login with invalid password")
    public void verifyInvalidPasswordTest() {
        SoftAssert softAssert = new SoftAssert();
        Header header = new Header(getDriver());
        header.open();
        LoginPage loginPage = headerService.openLoginPage(getDriver());
        loginService.typeEmailAndContinue(Users.VALID.getEmail(), getDriver());
        softAssert.assertTrue(loginPage.isPasswordInputPresent(), "Password input is not present");
        softAssert.assertTrue(loginPage.isSignInButtonPresent(), "Sign In Button is not present");
        softAssert.assertTrue((loginService.typePasswordAndSignIn(Users.INVALID.getPassword(), getDriver())).isErrorBoxPresent(), "Error box is not present");
        softAssert.assertAll();
    }

    @Test(description = "try to login with valid password")
    public void verifyValidPasswordTest() {
        SoftAssert softAssert = new SoftAssert();
        Header header = new Header(getDriver());
        header.open();
        LoginPage loginPage = headerService.openLoginPage(getDriver());
        loginService.typeEmailAndContinue(Users.VALID.getEmail(), getDriver());
        softAssert.assertTrue(loginPage.isPasswordInputPresent(), "Password input is not present");
        softAssert.assertTrue(loginPage.isSignInButtonPresent(), "Sign In Button is not present");
        loginService.typePasswordAndSignIn(Users.VALID.getPassword(), getDriver());
        softAssert.assertTrue(headerService.getUserNameOfTheAccount(getDriver()).contains(Users.VALID.getUserName()), "The account is not logged in");
        softAssert.assertAll();
    }

    @Test(description = "try to sign out")
    public void signOutTest() {
        SoftAssert softAssert = new SoftAssert();
        Header header = new Header(getDriver());
        header.open();
        headerService.openLoginPage(getDriver());
        loginService.login(Users.VALID.getEmail(), Users.VALID.getPassword(), getDriver());
        softAssert.assertTrue(header.isAccountAndListsLabelPresent(), "Account and list label is not present");
        headerService.signOut(getDriver());
        loginService.returnToTheMainPage(getDriver());
        softAssert.assertTrue(header.isAccountAndListsLabelPresent(), "Account and list label is not present");
        softAssert.assertFalse(headerService.getUserNameOfTheAccount(getDriver()).contains(Users.VALID.getUserName()), "The account is not signed out");
        softAssert.assertAll();
    }

}
