package com.solvd.testingProject.mobile.common;

import com.solvd.testingProject.mobile.pages.BrowseMenuPage;
import com.solvd.testingProject.mobile.pages.LoginPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class BrowseMenuPageBase extends AbstractPage implements IMobileUtils {
    public BrowseMenuPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isSettingsButtonPresent();

    public abstract boolean isSignOutButtonPresent();

    public abstract BrowseMenuPage clickSettingsButton();

    public abstract BrowseMenuPage clickSignOutButton();

    public abstract LoginPage confirmSignOut();

    public abstract BrowseMenuPage scrollDownToSettings();

    public abstract BrowseMenuPageBase scrollDownToSignOutButton();
}
