package com.solvd.testingProject.mobile.common;

import com.solvd.testingProject.mobile.pages.HomePage;
import com.solvd.testingProject.mobile.pages.LoginPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage implements IMobileUtils {
    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract LoginPage typeEmail(String email);

    public abstract LoginPage typePassword(String password);

    public abstract LoginPage clickContinueButton();

    public abstract LoginPage clickFirstSignInButton();

    public abstract boolean isEmailErrorBoxPresent();

    public abstract boolean isPasswordErrorBoxPresent();

    public abstract boolean isEmailInputPresent();

    public abstract boolean isContinueButtonPresent();

    public abstract boolean isFirstSignInButtonPresent();

    public abstract boolean isPasswordInputPresent();

    public abstract boolean isFinalSignInButtonPresent();

    public abstract LoginPage clickFinalSignInButton();
}
