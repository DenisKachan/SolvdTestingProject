package com.solvd.testingProject.mobile.common;

import com.solvd.testingProject.mobile.pages.AccountPage;
import com.solvd.testingProject.mobile.pages.BrowseMenuPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MainFrameBase extends AbstractPage implements IMobileUtils {
    public MainFrameBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isBrowseMenuPageButtonPresent();

    public abstract boolean isAccountPageButtonPresent();

    public abstract BrowseMenuPage clickBrowseMenuButton();

    public abstract AccountPage clickAccountPageButton();
}
