package com.romanceabroad.ui;

import org.testng.Assert;
import org.testng.annotations.Test;


public class GiftsTests extends BaseUI {

    @Test(dataProvider = "InputsSearch",dataProviderClass = DataProviders.class)
    public void testGiftsIconPageTest1(String inputsearch) {
        mainPage.clickPhotosPageLink();
        mainPage.javaWaitSec(3);
        String currentUrlPhotos = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPhotos, Data.expectedUrlGiftsSearch);
        driver.findElement(Locators.LINK_ICON_GIFTS).click();
        mainPage.javaWaitSec(3);
        mainPage.ajaxSendKeys(driver.findElement(Locators.LINK_TEXT_FIELD),inputsearch);
        giftsPage.clickButtonSearch();
        mainPage.verifyLinkActive(Data.expectedUrlTeddy);
        System.out.println(inputsearch);
    }
    @Test()
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

