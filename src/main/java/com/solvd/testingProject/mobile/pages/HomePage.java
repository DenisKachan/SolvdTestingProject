package com.solvd.testingProject.mobile.pages;

import com.solvd.testingProject.mobile.common.HomePageBase;
import com.solvd.testingProject.mobile.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }
}
