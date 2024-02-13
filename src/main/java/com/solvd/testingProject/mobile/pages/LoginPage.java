package com.solvd.testingProject.mobile.pages;

import com.solvd.testingProject.mobile.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase implements IMobileUtils {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.amazon.mShop.android.shopping:id/sign_in_button\"]")
    private ExtendedWebElement signInOptionButton;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"ap_email_login\"]")
    private ExtendedWebElement emailInput;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"continue\"]")
    private ExtendedWebElement continueButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"No account found with email address\"]")
    private ExtendedWebElement noAccountError;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"ap_password\"]")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"signInSubmit\"]")
    private ExtendedWebElement finalSignInButton;

    @FindBy(xpath = "//android.view.View[@text=\"Your password is incorrect\"]")
    private ExtendedWebElement wrongPasswordError;

    @Override
    public LoginPage typeEmail(String email) {
        emailInput.type(email);
        return this;
    }

    @Override
    public LoginPage typePassword(String password) {
        passwordInput.type(password);
        return this;
    }

    @Override
    public LoginPage clickContinueButton() {
        continueButton.click();
        return this;
    }

    @Override
    public LoginPage clickFirstSignInButton() {
        signInOptionButton.click();
        return this;
    }

    @Override
    public boolean isEmailErrorBoxPresent() {
        return noAccountError.isPresent();
    }

    @Override
    public boolean isPasswordErrorBoxPresent(){
        return wrongPasswordError.isPresent();
    }

    @Override
    public boolean isEmailInputPresent() {
        return emailInput.isPresent();
    }

    @Override
    public boolean isContinueButtonPresent() {
        return continueButton.isPresent();
    }

    @Override
    public boolean isFirstSignInButtonPresent() {
        return signInOptionButton.isPresent();
    }

    @Override
    public boolean isPasswordInputPresent() {
        return passwordInput.isPresent();
    }

    @Override
    public boolean isFinalSignInButtonPresent(){
        return finalSignInButton.isPresent();
    }

    @Override
    public LoginPage clickFinalSignInButton(){
        finalSignInButton.click();
        return this;}
}
