package com.solvd.testingProject.mobile.pages;

import com.solvd.testingProject.mobile.common.AccountPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AccountPageBase.class)
public class AccountPage extends AccountPageBase {
    public AccountPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//android.widget.TextView[@text=\"SolvdTest\"]")
    private ExtendedWebElement userName;


    @Override
    public boolean isAccountNameLabelPresent(){
        return userName.isPresent();
    }

    @Override
    public String getNameOfTheAccount(){
        return userName.getText();
    }
}
