package com.solvd.testingProject.mobileTests;

import com.solvd.testingProject.commonDomain.Users;
import com.solvd.testingProject.mobile.common.BrowseMenuPageBase;
import com.solvd.testingProject.mobile.common.LoginPageBase;
import com.solvd.testingProject.mobile.common.MainFrameBase;
import com.solvd.testingProject.mobile.pages.BrowseMenuPage;
import com.solvd.testingProject.mobile.pages.LoginPage;
import com.solvd.testingProject.mobile.service.AccountService;
import com.solvd.testingProject.mobile.service.BrowseMenuService;
import com.solvd.testingProject.mobile.service.LoginService;
import com.solvd.testingProject.mobile.service.MainFrameService;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginLogoutTests implements IAbstractTest, IMobileUtils {

    AccountService accountService = new AccountService();
    BrowseMenuService browseMenuService = new BrowseMenuService();
    LoginService loginService = new LoginService();
    MainFrameService mainFrameService = new MainFrameService();

    @Test(description = "try to login with invalid email")
    public void verifyInvalidEmailTest() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        softAssert.assertTrue(loginPage.isFirstSignInButtonPresent(), "Sign in option is not present");
        softAssert.assertTrue((loginService.typeEmailAndContinue(Users.INVALID.getEmail(), getDriver()).isEmailErrorBoxPresent()), "Error box is not present");
        softAssert.assertAll();
    }

    @Test(description = "try to login with valid email")
    public void verifyValidEmailTest() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        softAssert.assertTrue(loginPage.isFirstSignInButtonPresent(), "Sign in option is not present");
        softAssert.assertTrue((loginService.typeEmailAndContinue(Users.VALID.getEmail(), getDriver()).isPasswordInputPresent()), "Password input is not present");
        softAssert.assertAll();
    }

    @Test(description = "try to login with invalid password")
    public void verifyInvalidPasswordTest() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginService.typeEmailAndContinue(Users.VALID.getEmail(), getDriver());
        softAssert.assertTrue(loginPage.isPasswordInputPresent(), "Password input is not present");
        softAssert.assertTrue(loginPage.isFinalSignInButtonPresent(),"Final sign in button is not present");
        softAssert.assertTrue((loginService.typePasswordAndSignIn(Users.INVALID.getPassword(), getDriver()).isPasswordErrorBoxPresent()), "Password error box is not present");
        softAssert.assertAll();
    }

    @Test(description = "try to login with valid password")
    public void verifyValidPasswordTest() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginService.typeEmailAndContinue(Users.VALID.getEmail(), getDriver());
        softAssert.assertTrue(loginPage.isPasswordInputPresent(), "Password input is not present");
        softAssert.assertTrue(loginPage.isFinalSignInButtonPresent(),"Final sign in button is not present");
        loginService.typePasswordAndSignIn(Users.VALID.getPassword(), getDriver());
        MainFrameBase mainFrame = initPage(getDriver(),MainFrameBase.class);
        softAssert.assertTrue(mainFrame.isAccountPageButtonPresent(),"Account menu button is not present");
        softAssert.assertEquals(mainFrameService.navigateToAccountPage(getDriver()).getNameOfTheAccount(),Users.VALID.getUserName(),"User name is different with the logged in");
        softAssert.assertAll();
    }

    @Test(description = "try to sign out")
    public void verifySignOutTest() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginService.login(Users.VALID.getEmail(), Users.VALID.getPassword(), getDriver());
        mainFrameService.navigateToBrowseMenuPage(getDriver());
        browseMenuService.signOut(getDriver());
        softAssert.assertTrue(loginPage.isFirstSignInButtonPresent(),"Sign in button is not present");
        softAssert.assertAll();
    }
}
