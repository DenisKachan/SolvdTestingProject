package com.solvd.testingProject.web.pages;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractPage {

    @FindBy(id = "nav-logo")
    private ExtendedWebElement title;

    @FindBy(id = "twotabsearchtextbox")
    private ExtendedWebElement searchInput;

    @FindBy(id = "nav-search-submit-button")
    private ExtendedWebElement searchSubmitButton;

    @FindBy(xpath = "//div[@class='nav-line-1-container']")
    private ExtendedWebElement accountAndListsLabel;

    @FindBy(xpath = "//span[text()='Sign Out']")
    private ExtendedWebElement signOutLabel;

    @FindBy(id = "nav-cart-count-container")
    private ExtendedWebElement shoppingCartLabel;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    private ExtendedWebElement textFromAccountListLabel;

    public Header(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(title);
    }

    @Override
    public void open() {
        super.openURL(Configuration.getRequired("home_url"));
    }

    public LoginPage clickAccountAndListsLabel() {
        accountAndListsLabel.click();
        return new LoginPage(driver);
    }

    public ShoppingCartPage clickShoppingCartLabel() {
        shoppingCartLabel.click();
        return new ShoppingCartPage(driver);
    }

    public LoginPage clickSignOutLabel() {
        signOutLabel.click();
        return new LoginPage(driver);
    }

    public Header typeTextInSearchInput(String text) {
        searchInput.type(text);
        return this;
    }

    public ProductsPage clickSearchButton() {
        searchSubmitButton.click();
        return new ProductsPage(driver);
    }

    public void moveMouseToAccountAndListsLabel() {
        accountAndListsLabel.hover();
    }

    public boolean isSearchInputPresent() {
        return searchInput.isPresent();
    }

    public boolean isAccountAndListsLabelPresent() {
        return accountAndListsLabel.isPresent();
    }

    public String getTextFromAccountListLabel() {
        return textFromAccountListLabel.getText();
    }

}
