package com.solvd.testingProject.mobile.service;

import com.solvd.testingProject.mobile.pages.AccountPage;
import org.openqa.selenium.WebDriver;

public class AccountService {

    public String getNameOfTheAccount(WebDriver driver){
        AccountPage accountPage = new AccountPage(driver);
        return accountPage.getNameOfTheAccount();
    }
}
