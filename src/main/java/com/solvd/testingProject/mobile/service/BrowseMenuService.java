package com.solvd.testingProject.mobile.service;

import com.solvd.testingProject.mobile.pages.BrowseMenuPage;
import com.solvd.testingProject.mobile.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class BrowseMenuService {

    public LoginPage signOut(WebDriver driver){
        BrowseMenuPage browseMenuPage = new BrowseMenuPage(driver);
        browseMenuPage.scrollDownToSettings();
        browseMenuPage.clickSettingsButton();
        browseMenuPage.scrollDownToSignOutButton();
        browseMenuPage.clickSignOutButton();
        return browseMenuPage.confirmSignOut();
    }
}
