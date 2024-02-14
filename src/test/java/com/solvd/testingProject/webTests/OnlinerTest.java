package com.solvd.testingProject.webTests;

import com.solvd.testingProject.commonDomain.OnlinerColors;
import com.solvd.testingProject.web.pages.onliner.onlinerComponents.ItemPage;
import com.solvd.testingProject.web.service.onlinerService.*;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OnlinerTest implements IAbstractTest {
    private final ItemService itemService = new ItemService();
    private final OnlinerHeaderService onlinerHeaderService = new OnlinerHeaderService();


    @Test
    public void verifyButtonWidthTest(){
        onlinerHeaderService.typeInAndFindAnItem("Ноутбуки", getDriver());
        Assert.assertTrue(itemService.areButtonsPresent(getDriver()));
        Assert.assertTrue(itemService.isAddToShoppingCartButtonWiderThanBuyNowButton(getDriver()));
    }
}
