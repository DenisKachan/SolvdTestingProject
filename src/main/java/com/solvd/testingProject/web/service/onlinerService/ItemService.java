package com.solvd.testingProject.web.service.onlinerService;

import com.solvd.testingProject.web.pages.onliner.onlinerComponents.ItemPage;
import org.openqa.selenium.WebDriver;

public class ItemService {

    public String getColorOfTheBuyNowButton(WebDriver driver){
        ItemPage itemPage = new ItemPage(driver);
        return itemPage.getColorOfTheBuyNowButton();
    }
    public String getColorOfTheAddToShoppingCartButton(WebDriver driver){
        ItemPage itemPage = new ItemPage(driver);
        return itemPage.getColorOfTheAddToShoppingCartButton();
    }

    public boolean isAddToShoppingCartButtonWiderThanBuyNowButton(WebDriver driver){
        ItemPage itemPage = new ItemPage(driver);
        return (itemPage.getWidthOfAddToShoppingCartButton()<itemPage.getWidthOfBuyNowButton());
    }

    public boolean areButtonsPresent(WebDriver driver){
        ItemPage itemPage = new ItemPage(driver);
        return (itemPage.isBuyNowButtonPresent()&&itemPage.isAddToShoppingCartButtonPresent());
    }
}
