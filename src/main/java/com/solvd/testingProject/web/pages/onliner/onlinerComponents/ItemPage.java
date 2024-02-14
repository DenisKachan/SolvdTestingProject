package com.solvd.testingProject.web.pages.onliner.onlinerComponents;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends AbstractPage {
    public ItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div/a[contains(text(),'Купить сейчас')]")
    private ExtendedWebElement buyNowButton;

    @FindBy(xpath = "//div/a[contains(text(),'В корзину')]")
    private ExtendedWebElement addToShoppingCartButton;

    public String getColorOfTheBuyNowButton(){
        buyNowButton.hover();
      return buyNowButton.getCssValue("color");
    }

    public String getColorOfTheAddToShoppingCartButton(){
        addToShoppingCartButton.hover();
        return addToShoppingCartButton.getCssValue("color");
    }

    public boolean isBuyNowButtonPresent(){
        driver.switchTo().defaultContent();
        buyNowButton.scrollTo();
        buyNowButton.hover();
        return buyNowButton.isPresent();
    }

    public boolean isAddToShoppingCartButtonPresent(){
        driver.switchTo().defaultContent();
        addToShoppingCartButton.scrollTo();
        addToShoppingCartButton.hover();
        return addToShoppingCartButton.isPresent();
    }

    public int getWidthOfBuyNowButton(){
        return buyNowButton.getSize().getWidth();
    }

    public int getWidthOfAddToShoppingCartButton(){
        return addToShoppingCartButton.getSize().getWidth();
    }
}
