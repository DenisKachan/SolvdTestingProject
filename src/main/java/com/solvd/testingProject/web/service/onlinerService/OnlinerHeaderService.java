package com.solvd.testingProject.web.service.onlinerService;

import com.solvd.testingProject.web.pages.onliner.onlinerComponents.ItemPage;
import com.solvd.testingProject.web.pages.onliner.onlinerComponents.OnlinerHeader;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.WebDriver;

public class OnlinerHeaderService{

    public ItemPage typeInAndFindAnItem(String itemName, WebDriver driver){
        OnlinerHeader onlinerHeader = new OnlinerHeader(driver);
        onlinerHeader.openPage();
        onlinerHeader.findAnItemInCatalog(itemName);
      return   onlinerHeader.clickFirstNeededItemFromTheSearchInput();
    }
}
