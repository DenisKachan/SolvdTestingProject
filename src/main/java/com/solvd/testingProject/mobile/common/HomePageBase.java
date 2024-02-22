package com.solvd.testingProject.mobile.common;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage implements IMobileUtils {
    public HomePageBase(WebDriver driver) {
        super(driver);
    }
}
