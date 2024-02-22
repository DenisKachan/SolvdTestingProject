package com.solvd.testingProject.mobile.pages;

import com.solvd.testingProject.mobile.common.MainFrameBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MainFrameBase.class)
public class MainFrame extends MainFrameBase {
    public MainFrame(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.amazon.mShop.android.shopping:id/chrome_search_hint_view\"]")
    private ExtendedWebElement searchInput;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Home Tab 1 of 5\"]")
    private ExtendedWebElement homePageButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Inspire feed Tab 2 of 5\"]")
    private ExtendedWebElement inspirePageButton;

    @FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.amazon.mShop.android.shopping:id/bottom_tab_button_icon\"])[3]")
    private ExtendedWebElement accountPageButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.amazon.mShop.android.shopping:id/cart_count\"]")
    private ExtendedWebElement shoppingCartPageButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Browse menu Tab 5 of 5\"]")
    private ExtendedWebElement browseMenuPageButton;

    @Override
    public boolean isBrowseMenuPageButtonPresent(){
        return browseMenuPageButton.isPresent();
    }

    @Override
    public boolean isAccountPageButtonPresent(){
        return accountPageButton.isPresent();
    }

    @Override
    public BrowseMenuPage clickBrowseMenuButton(){
        browseMenuPageButton.click();
        return new BrowseMenuPage(driver);
    }

    @Override
    public AccountPage clickAccountPageButton(){
        accountPageButton.click();
        return new AccountPage(driver);
    }
}
