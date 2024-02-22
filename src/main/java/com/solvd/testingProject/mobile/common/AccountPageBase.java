package com.solvd.testingProject.mobile.common;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AccountPageBase extends AbstractPage implements IMobileUtils {
    public AccountPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isAccountNameLabelPresent();

    public abstract String getNameOfTheAccount();
}
