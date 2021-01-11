package com.romanceabroad.ui;

import org.testng.Assert;
import org.testng.annotations.Test;


public class GiftsTests extends BaseUI {
    public static final boolean isTest2 = true;
    public static final boolean isTest3 = true;


    @Test(dataProvider = "InputsSearch", dataProviderClass = DataProviders.class, priority = 1, enabled = isTest2, groups = {"ie"})
    public void testGiftsIconPageTest1(String inputsearch) {
        mainPage.clickPhotosPageLink();
        mainPage.javaWaitSec(3);
        String currentUrlPhotos = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPhotos, Data.expectedUrlPhotos);
        driver.findElement(Locators.LINK_ICON_GIFTS).click();
        mainPage.javaWaitSec(3);
        mainPage.ajaxSendKeys(driver.findElement(Locators.LINK_TEXT_FIELD), inputsearch);
        giftsPage.clickButtonSearch();
        mainPage.verifyLinkActive(Data.expectedUrlTeddy);
        System.out.println(inputsearch);
    }

    @Test(priority = 2, enabled = isTest3, groups = {"user"})
    public void testGiftsBasketPageTest2() {
        mainPage.clickGiftsPageLink();
        String currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        softAssert.assertEquals(currentUrlGifts, Data.expectedUrlGifts, "Url is wrong");
        mainPage.javaWaitSec(3);
        mainPage.perfomClick(driver.findElement(Locators.BLOCK_PRODUCT));
        mainPage.javaWaitSec(3);
        mainPage.perfomClick(driver.findElement(Locators.LINK_FRUITS));
        System.out.println("We can see product!");
    }

}


