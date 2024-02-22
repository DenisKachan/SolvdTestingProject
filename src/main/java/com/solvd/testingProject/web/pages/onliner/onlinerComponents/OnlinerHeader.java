package com.solvd.testingProject.web.pages.onliner.onlinerComponents;

import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class OnlinerHeader extends AbstractPage {
    @FindBy(xpath = "//input[@class='fast-search__input']")
    private ExtendedWebElement searchInput;
    @FindBy(xpath = "//iframe[@class='modal-iframe']")
    private WebElement iframe;

    @FindBy(xpath = "//div[@class='result__item result__item_product']")
    private ExtendedWebElement firstNeededItem;

    public ItemPage clickFirstNeededItemFromTheSearchInput(){
        driver.switchTo().frame(0);
        firstNeededItem.click();
        return new ItemPage(driver);
    }

    public OnlinerHeader(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(R.TESTDATA.get("home_url"));
    }

    public OnlinerHeader findAnItemInCatalog(String neededItem){
        searchInput.type(neededItem);
        return this;
    }


    public boolean isSearchInputPresent(){
        return searchInput.isPresent();
    }
}
