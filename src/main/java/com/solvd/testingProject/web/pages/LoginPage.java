package com.solvd.testingProject.web.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//a[@class='a-link-nav-icon']")
    private ExtendedWebElement webSiteLabel;

    @FindBy(xpath = "//form[@name='signIn']")
    private ExtendedWebElement title;

    @FindBy(xpath = "//input[@type='email']")
    private ExtendedWebElement emailInput;

    @FindBy(id = "continue")
    private ExtendedWebElement continueButton;

    @FindBy(id = "auth-error-message-box")
    private ExtendedWebElement errorBox;

    @FindBy(xpath = "//input[@type='password']")
    private ExtendedWebElement passwordInput;

    @FindBy(id = "signInSubmit")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//a[@class='a-link-nav-icon']")
    private ExtendedWebElement mainPageNavigateButton;


    public LoginPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(title);
    }

    public LoginPage typeEmail(String email) {
        emailInput.type(email);
        return this;
    }

    public LoginPage typePassword(String password) {
        passwordInput.type(password);
        return this;
    }

    public LoginPage clickContinueButton() {
        continueButton.click();
        return this;
    }

    public LoginPage clickSignInButton() {
        signInButton.click();
        return this;
    }

    public boolean isErrorBoxPresent() {
        return errorBox.isPresent();
    }

    public boolean isEmailInputPresent() {
        return emailInput.isPresent();
    }

    public boolean isContinueButtonPresent() {
        return continueButton.isPresent();
    }

    public boolean isSignInButtonPresent() {
        return signInButton.isPresent();
    }

    public boolean isPasswordInputPresent() {
        return passwordInput.isPresent();
    }

    public Header clickWebSiteHeader() {
        webSiteLabel.click();
        return new Header(driver);
    }
}
