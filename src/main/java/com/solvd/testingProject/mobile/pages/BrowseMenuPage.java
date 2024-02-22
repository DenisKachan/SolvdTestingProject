package com.solvd.testingProject.mobile.pages;

import com.solvd.testingProject.mobile.common.BrowseMenuPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BrowseMenuPageBase.class)
public class BrowseMenuPage extends BrowseMenuPageBase {
    public BrowseMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"c_se\"]")
    private ExtendedWebElement settingsButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Customer Service\"]")
    private ExtendedWebElement customerServiceButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Not SolvdTest? Sign Out\"]")
    private ExtendedWebElement signOutButton;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button2\"]")
    private ExtendedWebElement confirmSignOutButton;

    @Override
    public boolean isSettingsButtonPresent(){
        return settingsButton.isPresent();
    }

    @Override
    public boolean isSignOutButtonPresent(){
        return signOutButton.isPresent();
    }

    @Override
    public BrowseMenuPage clickSettingsButton(){
        settingsButton.click();
        return this;
    }

    @Override
    public BrowseMenuPage clickSignOutButton(){
        signOutButton.click();
        return this;
    }

    @Override
    public LoginPage confirmSignOut(){
        confirmSignOutButton.click();
        return new LoginPage(driver);
    }

    @Override
    public BrowseMenuPage scrollDownToSettings(){
        swipe(settingsButton,Direction.UP);
        return this;
    }

    @Override
    public BrowseMenuPageBase scrollDownToSignOutButton(){
        swipe(customerServiceButton,Direction.UP);
        return this;
    }
}
