package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PhotosTests extends BaseUI {
    public static final boolean isTest12 = true;
    public static final boolean isTest13 = true;
    public static final boolean isTest19 = true;
    String actualTitle;

    @Test(priority = 1, enabled = isTest12, groups = {"ie"})
    public void testPhotosPageTest6() {
        List<WebElement> list = driver.findElements(Locators.LINK_LINKS);
        for (int i = 0; i < list.size(); i++) {
            if (i == 4) {
                mainPage.ajaxClick(driver.findElement(Locators.LINK_HOME));
                mainPage.javaWaitSec(1);
                mainPage.checkLinksOnWebPage("//img", "src");
            }
        }
    }

    @Test(priority = 2, enabled = isTest13, groups = {"user"})
    public void testPhotosPageTest10() {
        mainPage.clickPhotosPageLink();
        mainPage.javaWaitSec(3);
        String currentUrlPhotos = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPhotos, Data.expectedUrlPhotos);
        mainPage.perfomClick(driver.findElement(Locators.BUTTON_ALBUMS));
        mainPage.javaWaitSec(3);
        photosPage.selectLanguageButton();
        System.out.println(" Язык страницы - Русский !");
    }

    @Test(priority = 3, enabled = isTest19, groups = {"ie"})
    public void testUserTabs() {
        mainPage.clickPhotosPageLink();
        List<WebElement> userTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);
        actualTitle = photosPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitleAllTabs);

        for (int i = 0; i < userTabs.size(); i++) {
            userTabs.get(i).click();
            actualTitle = photosPage.getAnyTitle();
            if (i == 0) {
                mainPage.javaWaitSec(3);
                Assert.assertEquals(actualTitle, Data.expectedTitleGallery);
            } else if (i == 1) {
                Assert.assertEquals(actualTitle, Data.expectedTitlePhotoGallery);
            } else if (i == 2) {
                Assert.assertEquals(actualTitle, Data.expectedTitleVideoGallery);
            } else if (i == 3) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGalleryAlbums);
            }
            userTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);
        }
    }
}


