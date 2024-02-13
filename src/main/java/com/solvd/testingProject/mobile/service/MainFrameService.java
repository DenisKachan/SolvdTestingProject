package com.solvd.testingProject.mobile.service;

import com.solvd.testingProject.mobile.pages.AccountPage;
import com.solvd.testingProject.mobile.pages.BrowseMenuPage;
import com.solvd.testingProject.mobile.pages.MainFrame;
import org.openqa.selenium.WebDriver;

public class MainFrameService {

    public AccountPage navigateToAccountPage(WebDriver driver){
        MainFrame mainFrame = new MainFrame(driver);
        return mainFrame.clickAccountPageButton();
    }

    public BrowseMenuPage navigateToBrowseMenuPage(WebDriver driver){
        MainFrame mainFrame = new MainFrame(driver);
        return mainFrame.clickBrowseMenuButton();
    }
}
